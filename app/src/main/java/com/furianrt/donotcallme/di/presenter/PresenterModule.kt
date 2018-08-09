package com.furianrt.donotcallme.di.presenter

import dagger.Module
import dagger.Provides
import android.content.Context
import com.furianrt.donotcallme.contacts.ContactContract
import com.furianrt.donotcallme.contacts.ContactPresenter
import com.furianrt.donotcallme.data.DataManager
import com.furianrt.donotcallme.main.blacklist.BlackListContract
import com.furianrt.donotcallme.main.blacklist.BlackListPresenter
import com.furianrt.donotcallme.main.whitelist.WhiteListContract
import com.furianrt.donotcallme.main.whitelist.WhiteListPresenter

@Module
class PresenterModule(private val context: Context?) {

    @Provides
    @PresenterScope
    fun provideContext(): Context? {
        return context
    }

    @Provides
    @PresenterScope
    fun provideBlackListPresenter(dataManager: DataManager): BlackListContract.Presenter {
        return BlackListPresenter(dataManager)
    }

    @Provides
    @PresenterScope
    fun provideWhiteListPresenter(dataManager: DataManager): WhiteListContract.Presenter {
        return WhiteListPresenter(dataManager)
    }

    @Provides
    @PresenterScope
    fun provideContactPresenter(dataManager: DataManager): ContactContract.Presenter {
        return ContactPresenter(dataManager)
    }
}