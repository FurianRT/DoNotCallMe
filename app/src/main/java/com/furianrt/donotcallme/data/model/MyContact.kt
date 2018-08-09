package com.furianrt.donotcallme.data.model

import android.arch.persistence.room.Ignore

open class MyContact(@Ignore open var id: String,
                     @Ignore open var name: String,
                     @Ignore open var numbers: List<String>?) {

    @Ignore
    var isChecked = false

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MyContact) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }


}