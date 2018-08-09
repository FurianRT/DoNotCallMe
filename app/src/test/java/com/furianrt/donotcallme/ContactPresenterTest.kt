package com.furianrt.donotcallme

import android.database.Cursor
import android.provider.ContactsContract
import com.furianrt.donotcallme.contacts.ContactContract
import com.furianrt.donotcallme.contacts.ContactPresenter
import com.furianrt.donotcallme.data.DataManager
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class ContactPresenterTest {

    /*lateinit var presenter: ContactContract.Presenter

    @Mock lateinit var view: ContactContract.View
    @Mock lateinit var dataManager: DataManager
    @Mock lateinit var contactManager: ContactManager
    @Mock lateinit var cursor: Cursor

    @Before
    fun setUp() {
        presenter = ContactPresenter(dataManager)
    }

    @Test
    fun loadContacts_nullView_doNotShowingList() {
        `when`(cursor.count).thenReturn(3)
        `when`(contactManager.query(ContactsContract.Contacts.CONTENT_URI,
                null, null)).thenReturn(cursor)

        presenter.loadContacts(contactManager)

        verify(view, times(0)).showContacts(ArgumentMatchers.anyList())
    }

    @Test
    fun loadContacts_noContacts_doNotShowingList() {
        presenter.attachView(view)
        `when`(cursor.count).thenReturn(0)
        `when`(contactManager.query(ContactsContract.Contacts.CONTENT_URI,
                null, null)).thenReturn(cursor)

        presenter.loadContacts(contactManager)

        verify(view, times(0)).showContacts(ArgumentMatchers.anyList())
    }

    @Test
    fun loadContacts_manyContacts_showingList() {
        presenter.attachView(view)
        `when`(cursor.count).thenReturn(3)
        `when`(contactManager.query(ContactsContract.Contacts.CONTENT_URI,
                null, null)).thenReturn(cursor)

        presenter.loadContacts(contactManager)

        verify(view, times(1)).showContacts(ArgumentMatchers.anyList())
    }

    @Test
    fun loadContacts_nullCursor_doNotShowingList() {
        presenter.attachView(view)
        `when`(contactManager.query(ContactsContract.Contacts.CONTENT_URI,
                null, null)).thenReturn(null)

        presenter.loadContacts(contactManager)

        verify(view, times(0)).showContacts(ArgumentMatchers.anyList())
    }*/
}