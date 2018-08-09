package com.furianrt.donotcallme.data.room

import android.arch.persistence.room.*
import com.furianrt.donotcallme.data.model.BlackContact
import io.reactivex.Flowable

@Dao
interface BlackContactDao {

    @Insert
    fun insert(contact: BlackContact)

    @Update
    fun update(contact: BlackContact)

    @Query("DELETE FROM BlackContacts WHERE id=:id")
    fun delete (id: String)

    @Query("SELECT * FROM BlackContacts")
    fun getAllContacts(): Flowable<List<BlackContact>>
}