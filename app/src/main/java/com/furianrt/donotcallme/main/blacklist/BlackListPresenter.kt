package com.furianrt.donotcallme.main.blacklist

import com.furianrt.donotcallme.data.DataManager
import com.furianrt.donotcallme.data.model.BlackContact
import io.reactivex.android.schedulers.AndroidSchedulers

class BlackListPresenter(private val mDataManager: DataManager) : BlackListContract.Presenter {

    private var mView: BlackListContract.View? = null

    override fun attachView(view: BlackListContract.View) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }

    override fun loadContacts() {
        mDataManager
                .getBlackContacts()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { mView?.showContacts(it) }
    }

    override fun updateContact(contact: BlackContact) {
        mDataManager.update(contact)
    }
}