package com.furianrt.donotcallme.main.log

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.furianrt.donotcallme.main.BaseFragment
import com.furianrt.donotcallme.R
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton
import com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RFACLabelItem
import com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RapidFloatingActionContentLabelList
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionHelper
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionLayout
import com.wangjie.rapidfloatingactionbutton.util.RFABTextUtil
import kotlinx.android.synthetic.main.fragment_log.view.*


class LogFragment : BaseFragment(),
        RapidFloatingActionContentLabelList.OnRapidFloatingActionContentLabelListListener<Any> {

    private var rfaLayout: RapidFloatingActionLayout? = null
    private var rfaButton: RapidFloatingActionButton? = null
    private var rfabHelper: RapidFloatingActionHelper? = null

    override fun getFabIdCode(): String {
        return getString(R.string.fab_id_code_log_list)
    }

    override fun onInitialFab(fab: RapidFloatingActionButton?) {
        rfaButton = fab
        initRFAB()
    }

    override fun onRFACItemIconClick(position: Int, item: RFACLabelItem<Any>?) {
        Toast.makeText(activity, "clicked icon: $position", Toast.LENGTH_SHORT).show()
        rfabHelper!!.toggleContent()
    }

    override fun onRFACItemLabelClick(position: Int, item: RFACLabelItem<Any>?) {
        Toast.makeText(activity, "clicked label: $position", Toast.LENGTH_SHORT).show()
        rfabHelper!!.toggleContent()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_log, container, false)

        rfaLayout = view.rfab_group_sample_fragment_c_rfal

        return view
    }

    private fun initRFAB() {
        if (null == rfaButton) {
            return
        }

        /*
        // 可通过代码设置属性
        rfaLayout.setFrameColor(Color.RED);
        rfaLayout.setFrameAlpha(0.4f);
        rfaBtn.setNormalColor(0xff37474f);
        rfaBtn.setPressedColor(0xff263238);
        rfaBtn.getRfabProperties().setShadowDx(ABTextUtil.dip2px(context, 3));
        rfaBtn.getRfabProperties().setShadowDy(ABTextUtil.dip2px(context, 3));
        rfaBtn.getRfabProperties().setShadowRadius(ABTextUtil.dip2px(context, 5));
        rfaBtn.getRfabProperties().setShadowColor(0xffcccccc);
        rfaBtn.getRfabProperties().setStandardSize(RFABSize.MINI);
        rfaBtn.build();
        */

        val context = activity

        val rfaContent = RapidFloatingActionContentLabelList(context)
        rfaContent.setOnRapidFloatingActionContentLabelListListener(this)
        val items = ArrayList<RFACLabelItem<Any>>()

        items.add(RFACLabelItem<Any>()
                .setLabel("WangJie")
                .setResId(R.mipmap.ic_launcher_round)
                .setIconNormalColor(-0xfa9100)
                .setIconPressedColor(-0xf2acfe)
                .setLabelColor(-0xfa9100)
                .setWrapper(2)
        )

        rfaContent
                .setItems(items)
                .setIconShadowRadius(RFABTextUtil.dip2px(context, 5f))
                .setIconShadowColor(-0x777778)
                .setIconShadowDy(RFABTextUtil.dip2px(context, 5f))

        rfabHelper = RapidFloatingActionHelper(context, rfaLayout, rfaButton, rfaContent).build()
    }
}
