package com.furianrt.donotcallme.data.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "Log")
class LogContact(
        @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = false) override var id: String,
        @ColumnInfo(name = "name") override var name: String,
        @ColumnInfo(name = "numbers") override var numbers: List<String>?)
    : MyContact(id, name, numbers)