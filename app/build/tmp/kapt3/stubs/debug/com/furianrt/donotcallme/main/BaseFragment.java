package com.furianrt.donotcallme.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/furianrt/donotcallme/main/BaseFragment;", "Landroid/support/v4/app/Fragment;", "()V", "getFabIdCode", "", "onInitialFab", "", "fab", "Lcom/wangjie/rapidfloatingactionbutton/RapidFloatingActionButton;", "app_debug"})
public abstract class BaseFragment extends android.support.v4.app.Fragment {
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getFabIdCode();
    
    public abstract void onInitialFab(@org.jetbrains.annotations.Nullable()
    com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton fab);
    
    public BaseFragment() {
        super();
    }
}