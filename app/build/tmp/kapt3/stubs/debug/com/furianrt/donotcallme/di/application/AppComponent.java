package com.furianrt.donotcallme.di.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/furianrt/donotcallme/di/application/AppComponent;", "", "newPresenterComponent", "Lcom/furianrt/donotcallme/di/presenter/PresenterComponent;", "module", "Lcom/furianrt/donotcallme/di/presenter/PresenterModule;", "app_debug"})
@dagger.Component(modules = {com.furianrt.donotcallme.di.application.AppModule.class})
@AppScope()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.furianrt.donotcallme.di.presenter.PresenterComponent newPresenterComponent(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.di.presenter.PresenterModule module);
}