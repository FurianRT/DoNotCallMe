package com.furianrt.donotcallme.contacts

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import com.furianrt.donotcallme.R
import com.furianrt.donotcallme.data.model.MyContact
import kotlinx.android.synthetic.main.activity_contact_list_item.view.*

class ContactListAdapter
    : ListAdapter<MyContact, ContactListAdapter.ViewHolder>(ContactDiffCallback()) {

    private var mList: List<MyContact>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.activity_contact_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun submitList(list: List<MyContact>?) {
        super.submitList(list)
        mList = list
    }

    fun getSelectedContacts(): List<MyContact> {
        return mList
                ?.filter { it.isChecked }
                .orEmpty()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        private lateinit var mContact: MyContact

        fun bind(contact: MyContact) {
            mContact = contact
            itemView.apply {
                setOnClickListener(this@ViewHolder)
                text_contact_name.text = contact.name
                check_add_contact.isChecked = contact.isChecked
                check_add_contact.setOnClickListener(this@ViewHolder)
            }
        }

        override fun onClick(view: View?) {
            mContact.isChecked = !mContact.isChecked
            itemView.check_add_contact.isChecked = mContact.isChecked
        }
    }
}