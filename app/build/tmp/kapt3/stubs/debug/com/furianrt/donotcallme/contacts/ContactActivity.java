package com.furianrt.donotcallme.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0010H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0016\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/furianrt/donotcallme/contacts/ContactActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/furianrt/donotcallme/contacts/ContactContract$View;", "Landroid/view/View$OnClickListener;", "()V", "mAdapter", "Lcom/furianrt/donotcallme/contacts/ContactListAdapter;", "mIsBlack", "", "mPresenter", "Lcom/furianrt/donotcallme/contacts/ContactContract$Presenter;", "getMPresenter", "()Lcom/furianrt/donotcallme/contacts/ContactContract$Presenter;", "setMPresenter", "(Lcom/furianrt/donotcallme/contacts/ContactContract$Presenter;)V", "onClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupUi", "showContacts", "list", "", "Lcom/furianrt/donotcallme/data/model/MyContact;", "app_debug"})
public final class ContactActivity extends android.support.v7.app.AppCompatActivity implements com.furianrt.donotcallme.contacts.ContactContract.View, android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.furianrt.donotcallme.contacts.ContactContract.Presenter mPresenter;
    private final com.furianrt.donotcallme.contacts.ContactListAdapter mAdapter = null;
    private boolean mIsBlack;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.furianrt.donotcallme.contacts.ContactContract.Presenter getMPresenter() {
        return null;
    }
    
    public final void setMPresenter(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.contacts.ContactContract.Presenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUi() {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void showContacts(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.furianrt.donotcallme.data.model.MyContact> list) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public ContactActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.furianrt.donotcallme.di.presenter.PresenterComponent getPresenterComponent(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
}