package com.furianrt.donotcallme;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/furianrt/donotcallme/BaseView;", "", "getPresenterComponent", "Lcom/furianrt/donotcallme/di/presenter/PresenterComponent;", "context", "Landroid/content/Context;", "app_debug"})
public abstract interface BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.furianrt.donotcallme.di.presenter.PresenterComponent getPresenterComponent(@org.jetbrains.annotations.Nullable()
    android.content.Context context);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static com.furianrt.donotcallme.di.presenter.PresenterComponent getPresenterComponent(com.furianrt.donotcallme.BaseView $this, @org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return null;
        }
    }
}