package com.furianrt.donotcallme.main.whitelist

import android.support.v7.util.DiffUtil
import com.furianrt.donotcallme.data.model.WhiteContact

class WhiteListDiffCallback : DiffUtil.ItemCallback<WhiteContact>() {

    override fun areContentsTheSame(oldItem: WhiteContact, newItem: WhiteContact): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areItemsTheSame(oldItem: WhiteContact, newItem: WhiteContact): Boolean {
        return oldItem == newItem
    }
}