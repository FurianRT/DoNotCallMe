package com.furianrt.donotcallme.main.whitelist

import com.furianrt.donotcallme.BasePresenter
import com.furianrt.donotcallme.BaseView
import com.furianrt.donotcallme.data.model.WhiteContact

interface WhiteListContract {

    interface View : BaseView {

        fun showContacts(contacts: List<WhiteContact>?)
    }

    interface Presenter : BasePresenter<View> {

        fun loadContacts()
    }
}