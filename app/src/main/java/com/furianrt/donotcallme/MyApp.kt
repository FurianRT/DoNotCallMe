package com.furianrt.donotcallme

import android.app.Application
import com.furianrt.donotcallme.data.room.ContactDatabase
import com.furianrt.donotcallme.di.application.AppComponent
import com.furianrt.donotcallme.di.application.AppModule
import com.furianrt.donotcallme.di.application.DaggerAppComponent
import javax.inject.Inject

class MyApp : Application() {

    val component: AppComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

    companion object {
        lateinit var instance: MyApp
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}