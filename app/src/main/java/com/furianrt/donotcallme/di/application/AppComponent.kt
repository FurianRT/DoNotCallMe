package com.furianrt.donotcallme.di.application

import com.furianrt.donotcallme.di.presenter.PresenterComponent
import com.furianrt.donotcallme.di.presenter.PresenterModule
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun newPresenterComponent(module: PresenterModule): PresenterComponent
}