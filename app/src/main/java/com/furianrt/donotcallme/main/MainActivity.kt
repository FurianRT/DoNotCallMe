package com.furianrt.donotcallme.main

import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import com.furianrt.donotcallme.R
import com.wangjie.rapidfloatingactionbutton.listener.OnRapidFloatingButtonGroupListener
import com.wangjie.rapidfloatingactionbutton.rfabgroup.RapidFloatingActionButtonGroup
import kotlinx.android.synthetic.main.activity_main.*
import com.furianrt.donotcallme.main.blacklist.BlackListFragment
import com.furianrt.donotcallme.main.log.LogFragment
import com.furianrt.donotcallme.main.whitelist.WhiteListFragment
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), OnRapidFloatingButtonGroupListener {

    private val mFragments = ArrayList<BaseFragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        mFragments.add(BlackListFragment())
        mFragments.add(WhiteListFragment())
        mFragments.add(LogFragment())

        setupUi()
    }

    private fun setupUi() {
        val toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.open, R.string.close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        group_fab.setOnRapidFloatingButtonGroupListener(this)
        pager.offscreenPageLimit = 3
        pager.adapter = MyPagerAdapter(this, supportFragmentManager, mFragments)
        pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }
            override fun onPageScrolled(position: Int, positionOffset: Float, posOffsetPix: Int) {
            }
            override fun onPageSelected(position: Int) {
                group_fab.setSection(position)
            }
        })
        tab_layout.setupWithViewPager(pager)
    }

    override fun onRFABGPrepared(rapidFloatingActionButtonGroup: RapidFloatingActionButtonGroup) {
        for (fragment in mFragments) {
            fragment.onInitialFab(rapidFloatingActionButtonGroup.getRFABByIdentificationCode(
                    fragment.getFabIdCode()))
        }
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        pager.clearOnPageChangeListeners()
    }
}
