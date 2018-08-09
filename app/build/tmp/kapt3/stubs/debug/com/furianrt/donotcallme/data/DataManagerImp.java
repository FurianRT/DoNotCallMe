package com.furianrt.donotcallme.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f0\u0016H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000f0\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/furianrt/donotcallme/data/DataManagerImp;", "Lcom/furianrt/donotcallme/data/DataManager;", "mDatabase", "Lcom/furianrt/donotcallme/data/room/ContactDatabase;", "mPrefs", "Lcom/furianrt/donotcallme/data/prefs/PreferencesHelper;", "mContentResolver", "Landroid/content/ContentResolver;", "(Lcom/furianrt/donotcallme/data/room/ContactDatabase;Lcom/furianrt/donotcallme/data/prefs/PreferencesHelper;Landroid/content/ContentResolver;)V", "deleteBlackContact", "", "id", "", "deleteWhiteContact", "getActualContactNumbers", "", "contactId", "getActualContacts", "Lio/reactivex/Single;", "", "Lcom/furianrt/donotcallme/data/model/MyContact;", "getBlackContacts", "Lio/reactivex/Flowable;", "Lcom/furianrt/donotcallme/data/model/BlackContact;", "getWhiteContacts", "Lcom/furianrt/donotcallme/data/model/WhiteContact;", "insert", "blackContact", "whiteContact", "update", "app_debug"})
@com.furianrt.donotcallme.di.application.AppScope()
public final class DataManagerImp implements com.furianrt.donotcallme.data.DataManager {
    private final com.furianrt.donotcallme.data.room.ContactDatabase mDatabase = null;
    private final com.furianrt.donotcallme.data.prefs.PreferencesHelper mPrefs = null;
    private final android.content.ContentResolver mContentResolver = null;
    
    @java.lang.Override()
    public void insert(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.BlackContact blackContact) {
    }
    
    @java.lang.Override()
    public void insert(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.WhiteContact whiteContact) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.BlackContact blackContact) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.WhiteContact whiteContact) {
    }
    
    @java.lang.Override()
    public void deleteBlackContact(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void deleteWhiteContact(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<com.furianrt.donotcallme.data.model.BlackContact>> getBlackContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<com.furianrt.donotcallme.data.model.WhiteContact>> getWhiteContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.furianrt.donotcallme.data.model.MyContact>> getActualContacts() {
        return null;
    }
    
    private final java.util.List<java.lang.String> getActualContactNumbers(java.lang.String contactId) {
        return null;
    }
    
    public DataManagerImp(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.room.ContactDatabase mDatabase, @org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.prefs.PreferencesHelper mPrefs, @org.jetbrains.annotations.NotNull()
    android.content.ContentResolver mContentResolver) {
        super();
    }
}