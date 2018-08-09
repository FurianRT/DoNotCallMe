package com.furianrt.donotcallme.main.blacklist

import android.support.v7.util.DiffUtil
import com.furianrt.donotcallme.data.model.BlackContact

class BlackListDiffCallback : DiffUtil.ItemCallback<BlackContact>() {

    override fun areContentsTheSame(oldItem: BlackContact, newItem: BlackContact): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areItemsTheSame(oldItem: BlackContact, newItem: BlackContact): Boolean {
        return oldItem == newItem
    }
}