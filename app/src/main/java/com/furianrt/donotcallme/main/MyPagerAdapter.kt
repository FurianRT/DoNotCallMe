package com.furianrt.donotcallme.main

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.furianrt.donotcallme.R

class MyPagerAdapter(context: Context,
                     fm: FragmentManager,
                     private val fragments: ArrayList<BaseFragment>)
    : FragmentStatePagerAdapter(fm) {

    private val titles = context.resources.getStringArray(R.array.string_array_tab_titles)

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }
}