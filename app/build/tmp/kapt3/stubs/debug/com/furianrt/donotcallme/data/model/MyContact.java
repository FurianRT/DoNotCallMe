package com.furianrt.donotcallme.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001b"}, d2 = {"Lcom/furianrt/donotcallme/data/model/MyContact;", "", "id", "", "name", "numbers", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "isChecked", "", "()Z", "setChecked", "(Z)V", "getName", "setName", "getNumbers", "()Ljava/util/List;", "setNumbers", "(Ljava/util/List;)V", "equals", "other", "hashCode", "", "app_debug"})
public class MyContact {
    @android.arch.persistence.room.Ignore()
    private boolean isChecked;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Ignore()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Ignore()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Ignore()
    private java.util.List<java.lang.String> numbers;
    
    public final boolean isChecked() {
        return false;
    }
    
    public final void setChecked(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.List<java.lang.String> getNumbers() {
        return null;
    }
    
    public void setNumbers(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    public MyContact(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> numbers) {
        super();
    }
}