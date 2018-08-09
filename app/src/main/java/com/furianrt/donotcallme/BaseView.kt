package com.furianrt.donotcallme

import android.content.Context
import com.furianrt.donotcallme.di.presenter.PresenterComponent
import com.furianrt.donotcallme.di.presenter.PresenterModule

interface BaseView {

    fun getPresenterComponent(context: Context?): PresenterComponent {
        return MyApp.instance
                .component
                .newPresenterComponent(PresenterModule(context))
    }
}

