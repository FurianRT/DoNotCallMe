package com.furianrt.donotcallme.main.blacklist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/furianrt/donotcallme/main/blacklist/BlackListDiffCallback;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/furianrt/donotcallme/data/model/BlackContact;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
public final class BlackListDiffCallback extends android.support.v7.util.DiffUtil.ItemCallback<com.furianrt.donotcallme.data.model.BlackContact> {
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.BlackContact oldItem, @org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.BlackContact newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.BlackContact oldItem, @org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.model.BlackContact newItem) {
        return false;
    }
    
    public BlackListDiffCallback() {
        super();
    }
}