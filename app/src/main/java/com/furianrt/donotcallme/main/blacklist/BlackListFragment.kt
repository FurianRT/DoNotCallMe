package com.furianrt.donotcallme.main.blacklist

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.furianrt.donotcallme.main.BaseFragment
import com.furianrt.donotcallme.R
import com.furianrt.donotcallme.contacts.ContactActivity
import com.furianrt.donotcallme.data.model.BlackContact
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton
import com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RFACLabelItem
import com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RapidFloatingActionContentLabelList
import kotlinx.android.synthetic.main.fragment_black_list.view.*
import javax.inject.Inject
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionHelper
import com.wangjie.rapidfloatingactionbutton.util.RFABTextUtil

class BlackListFragment : BaseFragment(), BlackListContract.View,
        RapidFloatingActionContentLabelList.OnRapidFloatingActionContentLabelListListener<Any>,
        BlackListAdapter.OnListItemInteractionListener {

    @Inject
    lateinit var mPresenter: BlackListContract.Presenter

    private var mActionHelper: RapidFloatingActionHelper? = null

    private val mAdapter = BlackListAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getPresenterComponent(context).inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_black_list, container, false)

        mPresenter.attachView(this)

        setupRV(view)

        mPresenter.loadContacts()

        return view
    }

    override fun showContacts(contacts: List<BlackContact>?) {
        mAdapter.submitList(contacts)
    }

    private fun setupRV(view: View) {
        val manager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val dividerItemDecoration = DividerItemDecoration(context, manager.orientation)
        view.list_black_contacts.apply {
            layoutManager = manager
            adapter = mAdapter
            addItemDecoration(dividerItemDecoration)
        }
    }

    override fun onListItemCheckedChanged(contact: BlackContact) {
        mPresenter.updateContact(contact)
    }

    override fun onListItemClick(contact: BlackContact) {
        Toast.makeText(context, contact.id, Toast.LENGTH_SHORT).show()
    }

    override fun onRFACItemIconClick(position: Int, item: RFACLabelItem<Any>?) {
        onFabItemClick(position)
    }

    override fun onRFACItemLabelClick(position: Int, item: RFACLabelItem<Any>?) {
        onFabItemClick(position)
    }

    private fun onFabItemClick(position: Int) {
        when (position) {
            0 -> {
                val intent = Intent(context, ContactActivity::class.java)
                intent.putExtra(getString(R.string.intent_extra_list_type), true)
                startActivity(intent)
            }
        }
        mActionHelper?.toggleContent()
    }

    override fun getFabIdCode(): String {
        return getString(R.string.fab_id_code_black_list)
    }

    override fun onInitialFab(fab: RapidFloatingActionButton?) {
        val contentList = RapidFloatingActionContentLabelList(context)
        contentList.setOnRapidFloatingActionContentLabelListListener(this)
        val items = ArrayList<RFACLabelItem<Any>>()
        items.add(RFACLabelItem<Any>()
                .setLabel(getString(R.string.from_contact_list))
                .setResId(R.drawable.ic_contact_phone_white)
                .setIconNormalColor(resources.getColor(R.color.dark_red))
                .setLabelColor(resources.getColor(R.color.black))
                .setWrapper(0)
        )

        items.add(RFACLabelItem<Any>()
                .setLabel(getString(R.string.from_call_log))
                .setResId(R.drawable.ic_list_white)
                .setIconNormalColor(resources.getColor(R.color.dark_red))
                .setLabelColor(resources.getColor(R.color.black))
                .setWrapper(1)
        )

        items.add(RFACLabelItem<Any>()
                .setLabel(getString(R.string.begin_with))
                .setResId(R.drawable.ic_short_text_white)
                .setIconNormalColor(resources.getColor(R.color.dark_red))
                .setLabelColor(resources.getColor(R.color.black))
                .setWrapper(2)
        )

        items.add(RFACLabelItem<Any>()
                .setLabel(getString(R.string.contains))
                .setResId(R.drawable.ic_power_input_white)
                .setIconNormalColor(resources.getColor(R.color.dark_red))
                .setLabelColor(resources.getColor(R.color.black))
                .setWrapper(3)
        )

        items.add(RFACLabelItem<Any>()
                .setLabel(getString(R.string.enter_number))
                .setResId(R.drawable.ic_dialpad_white)
                .setIconNormalColor(resources.getColor(R.color.dark_red))
                .setLabelColor(resources.getColor(R.color.black))
                .setWrapper(4)
        )

        contentList
                .setItems(items)
                .setIconShadowRadius(RFABTextUtil.dip2px(context, 5f))
                .setIconShadowColor(-0x777778)
                .setIconShadowDy(RFABTextUtil.dip2px(context, 5f))

        fab?.let {
            mActionHelper =
                    RapidFloatingActionHelper(context, view!!.layout_fab, it, contentList).build()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        mPresenter.detachView()
    }
}
