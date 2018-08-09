package com.furianrt.donotcallme.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\fH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000eH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0010H&\u00a8\u0006\u0015"}, d2 = {"Lcom/furianrt/donotcallme/data/DataManager;", "", "deleteBlackContact", "", "id", "", "deleteWhiteContact", "getActualContacts", "Lio/reactivex/Single;", "", "Lcom/furianrt/donotcallme/data/model/MyContact;", "getBlackContacts", "Lio/reactivex/Flowable;", "", "Lcom/furianrt/donotcallme/data/model/BlackContact;", "getWhiteContacts", "Lcom/furianrt/donotcallme/data/model/WhiteContact;", "insert", "blackContact", "whiteContact", "update", "app_debug"})
public abstract interface DataManager {
    
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.BlackContact blackContact);
    
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.WhiteContact whiteContact);
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.BlackContact blackContact);
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.WhiteContact whiteContact);
    
    public abstract void deleteBlackContact(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    public abstract void deleteWhiteContact(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<com.furianrt.donotcallme.data.model.BlackContact>> getBlackContacts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<com.furianrt.donotcallme.data.model.WhiteContact>> getWhiteContacts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.furianrt.donotcallme.data.model.MyContact>> getActualContacts();
}