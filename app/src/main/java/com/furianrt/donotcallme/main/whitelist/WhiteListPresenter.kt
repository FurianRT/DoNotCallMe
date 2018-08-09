package com.furianrt.donotcallme.main.whitelist

import com.furianrt.donotcallme.data.DataManager
import io.reactivex.android.schedulers.AndroidSchedulers

class WhiteListPresenter(private val mDataManager: DataManager) : WhiteListContract.Presenter {

    private var mView: WhiteListContract.View? = null

    override fun attachView(view: WhiteListContract.View) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }

    override fun loadContacts() {
        mDataManager
                .getWhiteContacts()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { mView?.showContacts(it) }
    }
}