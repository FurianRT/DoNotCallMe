package com.furianrt.donotcallme.main.blacklist

import com.furianrt.donotcallme.BasePresenter
import com.furianrt.donotcallme.BaseView
import com.furianrt.donotcallme.data.model.BlackContact

interface BlackListContract {

    interface View : BaseView {

        fun showContacts(contacts: List<BlackContact>?)
    }

    interface Presenter : BasePresenter<View> {

        fun loadContacts()

        fun updateContact(contact: BlackContact)
    }
}