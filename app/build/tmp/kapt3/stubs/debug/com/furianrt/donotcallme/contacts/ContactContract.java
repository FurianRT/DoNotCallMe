package com.furianrt.donotcallme.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/furianrt/donotcallme/contacts/ContactContract;", "", "Presenter", "View", "app_debug"})
public abstract interface ContactContract {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/furianrt/donotcallme/contacts/ContactContract$View;", "Lcom/furianrt/donotcallme/BaseView;", "showContacts", "", "list", "", "Lcom/furianrt/donotcallme/data/model/MyContact;", "app_debug"})
    public static abstract interface View extends com.furianrt.donotcallme.BaseView {
        
        public abstract void showContacts(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.furianrt.donotcallme.data.model.MyContact> list);
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
        public static final class DefaultImpls {
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public static com.furianrt.donotcallme.di.presenter.PresenterComponent getPresenterComponent(com.furianrt.donotcallme.contacts.ContactContract.View $this, @org.jetbrains.annotations.Nullable()
            android.content.Context context) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/furianrt/donotcallme/contacts/ContactContract$Presenter;", "Lcom/furianrt/donotcallme/BasePresenter;", "Lcom/furianrt/donotcallme/contacts/ContactContract$View;", "addContacts", "", "contacts", "", "Lcom/furianrt/donotcallme/data/model/MyContact;", "isBlack", "", "loadContacts", "app_debug"})
    public static abstract interface Presenter extends com.furianrt.donotcallme.BasePresenter<com.furianrt.donotcallme.contacts.ContactContract.View> {
        
        public abstract void loadContacts(boolean isBlack);
        
        public abstract void addContacts(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.furianrt.donotcallme.data.model.MyContact> contacts, boolean isBlack);
    }
}