package com.furianrt.donotcallme.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/furianrt/donotcallme/contacts/ContactListAdapter;", "Landroid/support/v7/recyclerview/extensions/ListAdapter;", "Lcom/furianrt/donotcallme/data/model/MyContact;", "Lcom/furianrt/donotcallme/contacts/ContactListAdapter$ViewHolder;", "()V", "mList", "", "getSelectedContacts", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "ViewHolder", "app_debug"})
public final class ContactListAdapter extends android.support.v7.recyclerview.extensions.ListAdapter<com.furianrt.donotcallme.data.model.MyContact, com.furianrt.donotcallme.contacts.ContactListAdapter.ViewHolder> {
    private java.util.List<? extends com.furianrt.donotcallme.data.model.MyContact> mList;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.furianrt.donotcallme.contacts.ContactListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.contacts.ContactListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.furianrt.donotcallme.data.model.MyContact> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.furianrt.donotcallme.data.model.MyContact> getSelectedContacts() {
        return null;
    }
    
    public ContactListAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/furianrt/donotcallme/contacts/ContactListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/furianrt/donotcallme/contacts/ContactListAdapter;Landroid/view/View;)V", "mContact", "Lcom/furianrt/donotcallme/data/model/MyContact;", "bind", "", "contact", "onClick", "view", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private com.furianrt.donotcallme.data.model.MyContact mContact;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.furianrt.donotcallme.data.model.MyContact contact) {
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
}