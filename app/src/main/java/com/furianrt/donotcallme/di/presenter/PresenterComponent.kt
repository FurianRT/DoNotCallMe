package com.furianrt.donotcallme.di.presenter

import com.furianrt.donotcallme.contacts.ContactActivity
import com.furianrt.donotcallme.main.blacklist.BlackListFragment
import com.furianrt.donotcallme.main.whitelist.WhiteListFragment
import dagger.Subcomponent

@PresenterScope
@Subcomponent(modules = [PresenterModule::class])
interface PresenterComponent {

    fun inject(fragment: BlackListFragment)

    fun inject(fragment: WhiteListFragment)

    fun inject(activity: ContactActivity)

    //fun inject(fragment: LogFragment)
}