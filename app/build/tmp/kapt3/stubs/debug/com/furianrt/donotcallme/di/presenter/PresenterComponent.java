package com.furianrt.donotcallme.di.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/furianrt/donotcallme/di/presenter/PresenterComponent;", "", "inject", "", "activity", "Lcom/furianrt/donotcallme/contacts/ContactActivity;", "fragment", "Lcom/furianrt/donotcallme/main/blacklist/BlackListFragment;", "Lcom/furianrt/donotcallme/main/whitelist/WhiteListFragment;", "app_debug"})
@dagger.Subcomponent(modules = {com.furianrt.donotcallme.di.presenter.PresenterModule.class})
@PresenterScope()
public abstract interface PresenterComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.main.blacklist.BlackListFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.main.whitelist.WhiteListFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.contacts.ContactActivity activity);
}