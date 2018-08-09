package com.furianrt.donotcallme.main.whitelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/furianrt/donotcallme/main/whitelist/WhiteListContract;", "", "Presenter", "View", "app_debug"})
public abstract interface WhiteListContract {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/furianrt/donotcallme/main/whitelist/WhiteListContract$View;", "Lcom/furianrt/donotcallme/BaseView;", "showContacts", "", "contacts", "", "Lcom/furianrt/donotcallme/data/model/WhiteContact;", "app_debug"})
    public static abstract interface View extends com.furianrt.donotcallme.BaseView {
        
        public abstract void showContacts(@org.jetbrains.annotations.Nullable()
        java.util.List<com.furianrt.donotcallme.data.model.WhiteContact> contacts);
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
        public static final class DefaultImpls {
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public static com.furianrt.donotcallme.di.presenter.PresenterComponent getPresenterComponent(com.furianrt.donotcallme.main.whitelist.WhiteListContract.View $this, @org.jetbrains.annotations.Nullable()
            android.content.Context context) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/furianrt/donotcallme/main/whitelist/WhiteListContract$Presenter;", "Lcom/furianrt/donotcallme/BasePresenter;", "Lcom/furianrt/donotcallme/main/whitelist/WhiteListContract$View;", "loadContacts", "", "app_debug"})
    public static abstract interface Presenter extends com.furianrt.donotcallme.BasePresenter<com.furianrt.donotcallme.main.whitelist.WhiteListContract.View> {
        
        public abstract void loadContacts();
    }
}