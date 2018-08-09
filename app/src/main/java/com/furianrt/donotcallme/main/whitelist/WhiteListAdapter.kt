package com.furianrt.donotcallme.main.whitelist

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.furianrt.donotcallme.R
import com.furianrt.donotcallme.data.model.WhiteContact
import kotlinx.android.synthetic.main.fragment_white_list_item.view.*

class WhiteListAdapter(private val mListener: OnListItemClickListener)
    : ListAdapter<WhiteContact, WhiteListAdapter.ViewHolder>(WhiteListDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.fragment_white_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
            View.OnClickListener {

        private lateinit var mContact: WhiteContact

        fun bind(contact: WhiteContact) {
            mContact = contact
            itemView.apply {
                setOnClickListener(this@ViewHolder)
                text_contact_name.text = mContact.name
                text_contact_numbers.text = mContact.numbers?.joinToString("\n")
            }
        }

        override fun onClick(view: View?) {
            mListener.onListItemClick(mContact)
        }
    }

    interface OnListItemClickListener {

        fun onListItemClick(contact: WhiteContact)
    }
}