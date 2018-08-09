package com.furianrt.donotcallme.data

import android.content.ContentResolver
import android.provider.ContactsContract.*
import android.provider.ContactsContract.CommonDataKinds.*
import com.furianrt.donotcallme.data.model.BlackContact
import com.furianrt.donotcallme.data.model.MyContact
import com.furianrt.donotcallme.data.model.WhiteContact
import com.furianrt.donotcallme.data.prefs.PreferencesHelper
import com.furianrt.donotcallme.data.room.ContactDatabase
import com.furianrt.donotcallme.di.application.AppScope
import io.reactivex.Flowable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

@AppScope
class DataManagerImp(private val mDatabase: ContactDatabase,
                     private val mPrefs: PreferencesHelper,
                     private val mContentResolver: ContentResolver) : DataManager {

    override fun insertBlackDeleteWhite(blackContact: BlackContact) {
        Single.fromCallable { blackContact }
                .observeOn(Schedulers.io())
                .subscribe { it ->
                    mDatabase.runInTransaction {
                        deleteWhiteContact(it.id)
                        mDatabase.blackDao().insert(it)
                    }
                }
    }

    override fun insertWhiteDeleteBlack(whiteContact: WhiteContact) {
        Single.fromCallable { whiteContact }
                .observeOn(Schedulers.io())
                .subscribe { it ->
                    mDatabase.runInTransaction {
                        deleteBlackContact(it.id)
                        mDatabase.whiteDao().insert(it)
                    }
                }
    }

    override fun update(blackContact: BlackContact) {
        Single.fromCallable { mDatabase.blackDao().update(blackContact) }
                .subscribeOn(Schedulers.io())
    }

    override fun update(whiteContact: WhiteContact) {
        Single.fromCallable { mDatabase.whiteDao().update(whiteContact) }
                .subscribeOn(Schedulers.io())
    }

    override fun deleteBlackContact(id: String) {
        Single.fromCallable { mDatabase.blackDao().delete(id) }
                .subscribeOn(Schedulers.io())
    }

    override fun deleteWhiteContact(id: String) {
        Single.fromCallable { mDatabase.whiteDao().delete(id) }
                .subscribeOn(Schedulers.io())
    }

    override fun getBlackContacts(): Flowable<List<BlackContact>> {
        return mDatabase.blackDao().getAllContacts()
    }

    override fun getWhiteContacts(): Flowable<List<WhiteContact>> {
        return mDatabase.whiteDao().getAllContacts()
    }

    override fun getActualContacts(): Single<MutableList<MyContact>> {
        return Single.create {
            val list = mutableListOf<MyContact>()
            val contacts = mContentResolver.query(Contacts.CONTENT_URI, arrayOf(Contacts._ID,
                    Contacts.DISPLAY_NAME), null, null, null)
            if (contacts != null) {
                while (contacts.moveToNext()) {
                    val contactId = contacts.getString(contacts.getColumnIndex(Contacts._ID))
                    val name = contacts.getString(contacts.getColumnIndex(Contacts.DISPLAY_NAME))
                    val numbers = getActualContactNumbers(contactId)
                    list.add(MyContact(contactId, name, numbers))
                }
                contacts.close()
            }
            it.onSuccess(list)
        }
    }

    private fun getActualContactNumbers(contactId: String): List<String> {
        val numbers = ArrayList<String>()
        val cursor = mContentResolver.query(Phone.CONTENT_URI, arrayOf(Phone.NUMBER),
                Phone.CONTACT_ID + " = ?", arrayOf(contactId), null)
        if (cursor != null) {
            while (cursor.moveToNext()) {
                val number = cursor.getString(cursor.getColumnIndex(Phone.NUMBER))
                numbers.add(number)
            }
            cursor.close()
        }
        return numbers
    }
}