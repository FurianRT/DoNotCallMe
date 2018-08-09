package com.furianrt.donotcallme.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u0012\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/furianrt/donotcallme/contacts/ContactPresenter;", "Lcom/furianrt/donotcallme/contacts/ContactContract$Presenter;", "mDataManager", "Lcom/furianrt/donotcallme/data/DataManager;", "(Lcom/furianrt/donotcallme/data/DataManager;)V", "mView", "Lcom/furianrt/donotcallme/contacts/ContactContract$View;", "addContacts", "", "contacts", "", "Lcom/furianrt/donotcallme/data/model/MyContact;", "isBlack", "", "attachView", "view", "detachView", "loadContacts", "showContacts", "app_debug"})
public final class ContactPresenter implements com.furianrt.donotcallme.contacts.ContactContract.Presenter {
    private com.furianrt.donotcallme.contacts.ContactContract.View mView;
    private final com.furianrt.donotcallme.data.DataManager mDataManager = null;
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.contacts.ContactContract.View view) {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    @java.lang.Override()
    public void loadContacts(boolean isBlack) {
    }
    
    private final void showContacts(java.util.List<? extends com.furianrt.donotcallme.data.model.MyContact> contacts) {
    }
    
    @java.lang.Override()
    public void addContacts(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.furianrt.donotcallme.data.model.MyContact> contacts, boolean isBlack) {
    }
    
    public ContactPresenter(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.DataManager mDataManager) {
        super();
    }
}