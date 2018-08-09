package com.furianrt.donotcallme

interface BasePresenter<in T : BaseView> {

    fun attachView(view: T)

    fun detachView()
}