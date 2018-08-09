package com.furianrt.donotcallme.di.application

import android.app.Application
import android.arch.persistence.room.Room
import android.content.ContentResolver
import android.content.Context
import com.furianrt.donotcallme.data.DataManager
import com.furianrt.donotcallme.data.DataManagerImp
import com.furianrt.donotcallme.data.prefs.PreferencesHelper
import com.furianrt.donotcallme.data.prefs.PreferencesHelperImp
import com.furianrt.donotcallme.data.room.ContactDatabase
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val app: Application) {

    @Provides
    @AppScope
    fun provideApplication(): Application {
        return app
    }

    @Provides
    @AppScope
    fun provideContext(): Context {
        return app
    }

    @Provides
    @AppScope
    fun provideContentResolver(context: Context): ContentResolver {
        return context.contentResolver
    }

    @Provides
    @PreferenceInfo
    @AppScope
    fun providePrefFolderName(): String {
        return "myPreferences"
    }

    @Provides
    @AppScope
    fun providePreferencesHelper(context: Context, @PreferenceInfo name: String): PreferencesHelper {
        return PreferencesHelperImp(context, name)
    }

    @Provides
    @DatabaseInfo
    @AppScope
    fun provideDatabaseName(): String {
        return "Contacts.db"
    }

    @Provides
    @AppScope
    fun provideContactDatabase(context: Context, @DatabaseInfo databaseName: String): ContactDatabase {
        return Room
                .databaseBuilder(context, ContactDatabase::class.java, databaseName)
                .build()
    }

    @Provides
    @AppScope
    fun provideDataManager(database: ContactDatabase, prefs: PreferencesHelper,
                           contentResolver: ContentResolver): DataManager {
        return DataManagerImp(database, prefs, contentResolver)
    }
}