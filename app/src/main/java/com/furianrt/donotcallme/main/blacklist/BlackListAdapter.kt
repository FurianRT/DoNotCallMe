package com.furianrt.donotcallme.main.blacklist

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.CompoundButton
import com.furianrt.donotcallme.R
import com.furianrt.donotcallme.data.model.BlackContact
import kotlinx.android.synthetic.main.fragment_black_list_item.view.*

class BlackListAdapter(private val mListener: OnListItemInteractionListener)
    : ListAdapter<BlackContact, BlackListAdapter.ViewHolder>(BlackListDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.fragment_black_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
            CompoundButton.OnCheckedChangeListener,
            View.OnClickListener {

        private lateinit var mContact: BlackContact

        fun bind(contact: BlackContact) {
            mContact = contact
            itemView.apply {
                text_contact_name.text = mContact.name
                text_contact_numbers.text = mContact.numbers?.joinToString("\n")
                switch_contact_active.isChecked = mContact.activated
                switch_contact_active.setOnCheckedChangeListener(this@ViewHolder)
                setOnClickListener(this@ViewHolder)
            }
        }

        override fun onCheckedChanged(p0: CompoundButton?, checked: Boolean) {
            mContact.activated = checked
            mListener.onListItemCheckedChanged(mContact)
        }

        override fun onClick(view: View?) {
            mListener.onListItemClick(mContact)
        }

    }

    interface OnListItemInteractionListener {

        fun onListItemClick(contact: BlackContact)

        fun onListItemCheckedChanged(contact: BlackContact)
    }
}