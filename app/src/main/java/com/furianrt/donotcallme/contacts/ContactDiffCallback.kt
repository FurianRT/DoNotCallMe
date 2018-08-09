package com.furianrt.donotcallme.contacts

import android.support.v7.util.DiffUtil
import com.furianrt.donotcallme.data.model.MyContact

class ContactDiffCallback : DiffUtil.ItemCallback<MyContact>() {

    override fun areContentsTheSame(oldItem: MyContact, newItem: MyContact): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areItemsTheSame(oldItem: MyContact, newItem: MyContact): Boolean {
        return oldItem == newItem
    }
}