package com.furianrt.donotcallme.main

import android.support.v4.app.Fragment
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton

abstract class BaseFragment : Fragment() {

    abstract fun getFabIdCode(): String?

    abstract fun onInitialFab(fab: RapidFloatingActionButton?)
}