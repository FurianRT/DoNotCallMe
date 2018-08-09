package com.furianrt.donotcallme.contacts

import com.furianrt.donotcallme.data.DataManager
import com.furianrt.donotcallme.data.model.BlackContact
import com.furianrt.donotcallme.data.model.MyContact
import com.furianrt.donotcallme.data.model.WhiteContact
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ContactPresenter(private val mDataManager: DataManager) : ContactContract.Presenter {

    private var mView: ContactContract.View? = null

    override fun attachView(view: ContactContract.View) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }

    override fun loadContacts(isBlack: Boolean) {
        if (isBlack) {
            mDataManager.getBlackContacts()
                    .firstElement()
                    .subscribeOn(Schedulers.io())
                    .subscribe { blackContacts -> showContacts(blackContacts) }
        } else {
            mDataManager.getWhiteContacts()
                    .firstElement()
                    .subscribeOn(Schedulers.io())
                    .subscribe { whiteContacts -> showContacts(whiteContacts) }
        }
    }

    private fun showContacts(contacts: List<MyContact>) {
        mDataManager.getActualContacts()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { actualContacts ->
                    actualContacts.removeAll(contacts)
                    mView?.showContacts(actualContacts)
                }
    }

    override fun addContacts(contacts: List<MyContact>, isBlack: Boolean) {
        for (contact in contacts) {
            if (isBlack) {
                mDataManager.insertBlackDeleteWhite(BlackContact(
                        contact.id, contact.name, contact.numbers))
            } else {
                mDataManager.insertWhiteDeleteBlack(WhiteContact(
                        contact.id, contact.name, contact.numbers))
            }
        }
    }
}