package com.furianrt.donotcallme.data

import com.furianrt.donotcallme.data.model.BlackContact
import com.furianrt.donotcallme.data.model.MyContact
import com.furianrt.donotcallme.data.model.WhiteContact
import io.reactivex.Flowable
import io.reactivex.Single

interface DataManager {

    fun insertBlackDeleteWhite(blackContact: BlackContact)

    fun insertWhiteDeleteBlack(whiteContact: WhiteContact)

    fun update(blackContact: BlackContact)

    fun update(whiteContact: WhiteContact)

    fun deleteBlackContact(id: String)

    fun deleteWhiteContact(id: String)

    fun getBlackContacts(): Flowable<List<BlackContact>>

    fun getWhiteContacts(): Flowable<List<WhiteContact>>

    fun getActualContacts(): Single<MutableList<MyContact>>
}