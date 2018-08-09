package com.furianrt.donotcallme.main.blacklist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/furianrt/donotcallme/main/blacklist/BlackListAdapter;", "Landroid/support/v7/recyclerview/extensions/ListAdapter;", "Lcom/furianrt/donotcallme/data/model/BlackContact;", "Lcom/furianrt/donotcallme/main/blacklist/BlackListAdapter$ViewHolder;", "mListener", "Lcom/furianrt/donotcallme/main/blacklist/BlackListAdapter$OnListItemInteractionListener;", "(Lcom/furianrt/donotcallme/main/blacklist/BlackListAdapter$OnListItemInteractionListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnListItemInteractionListener", "ViewHolder", "app_debug"})
public final class BlackListAdapter extends android.support.v7.recyclerview.extensions.ListAdapter<com.furianrt.donotcallme.data.model.BlackContact, com.furianrt.donotcallme.main.blacklist.BlackListAdapter.ViewHolder> {
    private final com.furianrt.donotcallme.main.blacklist.BlackListAdapter.OnListItemInteractionListener mListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.furianrt.donotcallme.main.blacklist.BlackListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.main.blacklist.BlackListAdapter.ViewHolder holder, int position) {
    }
    
    public BlackListAdapter(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.main.blacklist.BlackListAdapter.OnListItemInteractionListener mListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u001a\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/furianrt/donotcallme/main/blacklist/BlackListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/furianrt/donotcallme/main/blacklist/BlackListAdapter;Landroid/view/View;)V", "mContact", "Lcom/furianrt/donotcallme/data/model/BlackContact;", "bind", "", "contact", "onCheckedChanged", "p0", "Landroid/widget/CompoundButton;", "checked", "", "onClick", "view", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements android.widget.CompoundButton.OnCheckedChangeListener, android.view.View.OnClickListener {
        private com.furianrt.donotcallme.data.model.BlackContact mContact;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.furianrt.donotcallme.data.model.BlackContact contact) {
        }
        
        @java.lang.Override()
        public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
        android.widget.CompoundButton p0, boolean checked) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View view) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/furianrt/donotcallme/main/blacklist/BlackListAdapter$OnListItemInteractionListener;", "", "onListItemCheckedChanged", "", "contact", "Lcom/furianrt/donotcallme/data/model/BlackContact;", "onListItemClick", "app_debug"})
    public static abstract interface OnListItemInteractionListener {
        
        public abstract void onListItemClick(@org.jetbrains.annotations.NotNull()
        com.furianrt.donotcallme.data.model.BlackContact contact);
        
        public abstract void onListItemCheckedChanged(@org.jetbrains.annotations.NotNull()
        com.furianrt.donotcallme.data.model.BlackContact contact);
    }
}