package com.furianrt.donotcallme.data.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.furianrt.donotcallme.data.model.BlackContact
import com.furianrt.donotcallme.data.model.WhiteContact

@Database(entities = [(BlackContact::class), (WhiteContact::class)], version = 1,
        exportSchema = false)
@TypeConverters(RoomTypeConverter::class)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun whiteDao(): WhiteContactDao

    abstract fun blackDao(): BlackContactDao
}