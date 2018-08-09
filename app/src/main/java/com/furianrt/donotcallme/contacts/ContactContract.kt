package com.furianrt.donotcallme.contacts

import android.database.Cursor
import android.net.Uri
import com.furianrt.donotcallme.BasePresenter
import com.furianrt.donotcallme.BaseView
import com.furianrt.donotcallme.data.model.MyContact

interface ContactContract {

    interface View : BaseView {

        fun showContacts(list: List<MyContact>)
    }

    interface Presenter : BasePresenter<View> {

        fun loadContacts(isBlack: Boolean)

        fun addContacts(contacts: List<MyContact>, isBlack: Boolean)
    }
}