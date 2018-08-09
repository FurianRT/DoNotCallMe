package com.furianrt.donotcallme.contacts

import android.annotation.SuppressLint
import android.database.Cursor
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View.INVISIBLE
import com.furianrt.donotcallme.R
import com.furianrt.donotcallme.data.model.MyContact
import kotlinx.android.synthetic.main.activity_contact.*
import kotlinx.android.synthetic.main.app_bar_contact.*
import javax.inject.Inject
import android.net.Uri
import android.provider.ContactsContract
import android.provider.ContactsContract.*
import android.provider.ContactsContract.CommonDataKinds.*
import android.util.Log
import android.view.View
import android.widget.Toast

class ContactActivity : AppCompatActivity(), ContactContract.View, View.OnClickListener {

    @Inject
    lateinit var mPresenter: ContactContract.Presenter

    private val mAdapter = ContactListAdapter()

    private var mIsBlack: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        getPresenterComponent(this).inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        mPresenter.attachView(this)

        mIsBlack = intent.getBooleanExtra(getString(R.string.intent_extra_list_type), true)

        setupUi()

        mPresenter.loadContacts(mIsBlack)
    }

    private fun setupUi() {
        setSupportActionBar(toolbar)
        button_add_contacts.setOnClickListener(this)
        val manager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val dividerItemDecoration = DividerItemDecoration(this, manager.orientation)
        list_contact.apply {
            layoutManager = manager
            adapter = mAdapter
            addItemDecoration(dividerItemDecoration)
        }
    }

    @SuppressLint("Recycle")
    override fun onClick(view: View?) {
        val contacts = mAdapter.getSelectedContacts()
        mPresenter.addContacts(contacts, mIsBlack)
        finish()
    }

    override fun showContacts(list: List<MyContact>) {
        mAdapter.submitList(list)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}