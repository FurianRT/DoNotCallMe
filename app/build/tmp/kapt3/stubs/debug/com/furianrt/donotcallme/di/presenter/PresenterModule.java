package com.furianrt.donotcallme.di.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/furianrt/donotcallme/di/presenter/PresenterModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "provideBlackListPresenter", "Lcom/furianrt/donotcallme/main/blacklist/BlackListContract$Presenter;", "dataManager", "Lcom/furianrt/donotcallme/data/DataManager;", "provideContactPresenter", "Lcom/furianrt/donotcallme/contacts/ContactContract$Presenter;", "provideContext", "provideWhiteListPresenter", "Lcom/furianrt/donotcallme/main/whitelist/WhiteListContract$Presenter;", "app_debug"})
@dagger.Module()
public final class PresenterModule {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable()
    @PresenterScope()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @PresenterScope()
    @dagger.Provides()
    public final com.furianrt.donotcallme.main.blacklist.BlackListContract.Presenter provideBlackListPresenter(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.DataManager dataManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @PresenterScope()
    @dagger.Provides()
    public final com.furianrt.donotcallme.main.whitelist.WhiteListContract.Presenter provideWhiteListPresenter(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.DataManager dataManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @PresenterScope()
    @dagger.Provides()
    public final com.furianrt.donotcallme.contacts.ContactContract.Presenter provideContactPresenter(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.DataManager dataManager) {
        return null;
    }
    
    public PresenterModule(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super();
    }
}