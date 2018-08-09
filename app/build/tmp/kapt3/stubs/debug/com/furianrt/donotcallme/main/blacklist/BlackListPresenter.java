package com.furianrt.donotcallme.main.blacklist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/furianrt/donotcallme/main/blacklist/BlackListPresenter;", "Lcom/furianrt/donotcallme/main/blacklist/BlackListContract$Presenter;", "mDataManager", "Lcom/furianrt/donotcallme/data/DataManager;", "(Lcom/furianrt/donotcallme/data/DataManager;)V", "mView", "Lcom/furianrt/donotcallme/main/blacklist/BlackListContract$View;", "attachView", "", "view", "detachView", "loadContacts", "updateContact", "contact", "Lcom/furianrt/donotcallme/data/model/BlackContact;", "app_debug"})
public final class BlackListPresenter implements com.furianrt.donotcallme.main.blacklist.BlackListContract.Presenter {
    private com.furianrt.donotcallme.main.blacklist.BlackListContract.View mView;
    private final com.furianrt.donotcallme.data.DataManager mDataManager = null;
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.main.blacklist.BlackListContract.View view) {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    @java.lang.Override()
    public void loadContacts() {
    }
    
    @java.lang.Override()
    public void updateContact(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.BlackContact contact) {
    }
    
    public BlackListPresenter(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.DataManager mDataManager) {
        super();
    }
}