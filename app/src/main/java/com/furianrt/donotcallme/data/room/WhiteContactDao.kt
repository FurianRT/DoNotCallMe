package com.furianrt.donotcallme.data.room

import android.arch.persistence.room.*
import com.furianrt.donotcallme.data.model.WhiteContact
import io.reactivex.Flowable

@Dao
interface WhiteContactDao {

    @Insert
    fun insert(contact: WhiteContact)

    @Update
    fun update(contact: WhiteContact)

    @Query("DELETE FROM WhiteContacts WHERE id=:id")
    fun delete (id: String)

    @Query("SELECT * FROM WhiteContacts")
    fun getAllContacts(): Flowable<List<WhiteContact>>
}