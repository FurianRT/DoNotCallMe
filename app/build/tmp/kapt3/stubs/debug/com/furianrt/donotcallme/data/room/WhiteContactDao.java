package com.furianrt.donotcallme.data.room;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\'\u00a8\u0006\r"}, d2 = {"Lcom/furianrt/donotcallme/data/room/WhiteContactDao;", "", "delete", "", "id", "", "getAllContacts", "Lio/reactivex/Flowable;", "", "Lcom/furianrt/donotcallme/data/model/WhiteContact;", "insert", "contact", "update", "app_debug"})
public abstract interface WhiteContactDao {
    
    @android.arch.persistence.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.WhiteContact contact);
    
    @android.arch.persistence.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.WhiteContact contact);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM WhiteContacts WHERE id=:id")
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM WhiteContacts")
    public abstract io.reactivex.Flowable<java.util.List<com.furianrt.donotcallme.data.model.WhiteContact>> getAllContacts();
}