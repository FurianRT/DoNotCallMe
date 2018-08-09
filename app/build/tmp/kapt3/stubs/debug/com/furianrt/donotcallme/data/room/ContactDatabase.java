package com.furianrt.donotcallme.data.room;

import java.lang.System;

@android.arch.persistence.room.TypeConverters(value = {com.furianrt.donotcallme.data.room.RoomTypeConverter.class})
@android.arch.persistence.room.Database(entities = {com.furianrt.donotcallme.data.model.BlackContact.class, com.furianrt.donotcallme.data.model.WhiteContact.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/furianrt/donotcallme/data/room/ContactDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "blackDao", "Lcom/furianrt/donotcallme/data/room/BlackContactDao;", "whiteDao", "Lcom/furianrt/donotcallme/data/room/WhiteContactDao;", "app_debug"})
public abstract class ContactDatabase extends android.arch.persistence.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.furianrt.donotcallme.data.room.WhiteContactDao whiteDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.furianrt.donotcallme.data.room.BlackContactDao blackDao();
    
    public ContactDatabase() {
        super();
    }
}