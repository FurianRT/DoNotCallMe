package com.furianrt.donotcallme.data.room

import android.arch.persistence.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

fun <T> Gson.fromJson(json: String): T =
        this.fromJson<T>(json, object : TypeToken<T>() {}.type)

class RoomTypeConverter {

    @TypeConverter
    fun fromString(value: String): List<String> {
        return Gson().fromJson(value)
    }

    @TypeConverter
    fun fromList(list: List<String>): String {
        return Gson().toJson(list)
    }
}