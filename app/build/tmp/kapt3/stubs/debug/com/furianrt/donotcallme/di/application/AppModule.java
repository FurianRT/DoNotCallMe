package com.furianrt.donotcallme.di.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0007J\b\u0010\u0015\u001a\u00020\u000bH\u0007J\b\u0010\u0016\u001a\u00020\u000bH\u0007J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0018\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/furianrt/donotcallme/di/application/AppModule;", "", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "provideApplication", "provideContactDatabase", "Lcom/furianrt/donotcallme/data/room/ContactDatabase;", "context", "Landroid/content/Context;", "databaseName", "", "provideContentResolver", "Landroid/content/ContentResolver;", "provideContext", "provideDataManager", "Lcom/furianrt/donotcallme/data/DataManager;", "database", "prefs", "Lcom/furianrt/donotcallme/data/prefs/PreferencesHelper;", "contentResolver", "provideDatabaseName", "providePrefFolderName", "providePreferencesHelper", "name", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final android.app.Application app = null;
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final android.app.Application provideApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final android.content.ContentResolver provideContentResolver(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @PreferenceInfo()
    @dagger.Provides()
    public final java.lang.String providePrefFolderName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final com.furianrt.donotcallme.data.prefs.PreferencesHelper providePreferencesHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @PreferenceInfo()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @DatabaseInfo()
    @dagger.Provides()
    public final java.lang.String provideDatabaseName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final com.furianrt.donotcallme.data.room.ContactDatabase provideContactDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @DatabaseInfo()
    java.lang.String databaseName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final com.furianrt.donotcallme.data.DataManager provideDataManager(@org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.room.ContactDatabase database, @org.jetbrains.annotations.NotNull()
    com.furianrt.donotcallme.data.prefs.PreferencesHelper prefs, @org.jetbrains.annotations.NotNull()
    android.content.ContentResolver contentResolver) {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super();
    }
}