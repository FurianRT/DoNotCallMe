package com.furianrt.donotcallme.main.whitelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/furianrt/donotcallme/main/whitelist/WhiteListAdapter;", "Landroid/support/v7/recyclerview/extensions/ListAdapter;", "Lcom/furianrt/donotcallme/data/model/WhiteContact;", "Lcom/furianrt/donotcallme/main/whitelist/WhiteListAdapter$ViewHolder;", "mListener", "Lcom/furianrt/donotcallme/main/whitelist/WhiteListAdapter$OnListItemClickListener;", "(Lcom/furianrt/donotcallme/main/whitelist/WhiteListAdapter$OnListItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnListItemClickListener", "ViewHolder", "app_debug"})
public final class WhiteListAdapter extends android.support.v7.recyclerview.extensions.ListAdapter<com.furianrt.donotcallme.data.model.WhiteContact, com.furianrt.donotcallme.main.whitelist.WhiteListAdapter.ViewHolder> {
    private final com.furianrt.donotcallme.main.whitelist.WhiteListAdapter.OnListItemClickListener mListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.furianrt.donotcallme.main.whitelist.WhiteListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.main.whitelist.WhiteListAdapter.ViewHolder holder, int position) {
    }
    
    public WhiteListAdapter(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.main.whitelist.WhiteListAdapter.OnListItemClickListener mListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/furianrt/donotcallme/main/whitelist/WhiteListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/furianrt/donotcallme/main/whitelist/WhiteListAdapter;Landroid/view/View;)V", "mContact", "Lcom/furianrt/donotcallme/data/model/WhiteContact;", "bind", "", "contact", "onClick", "view", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private com.furianrt.donotcallme.data.model.WhiteContact mContact;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.furianrt.donotcallme.data.model.WhiteContact contact) {
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
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/furianrt/donotcallme/main/whitelist/WhiteListAdapter$OnListItemClickListener;", "", "onListItemClick", "", "contact", "Lcom/furianrt/donotcallme/data/model/WhiteContact;", "app_debug"})
    public static abstract interface OnListItemClickListener {
        
        public abstract void onListItemClick(@org.jetbrains.annotations.NotNull()
        com.furianrt.donotcallme.data.model.WhiteContact contact);
    }
}