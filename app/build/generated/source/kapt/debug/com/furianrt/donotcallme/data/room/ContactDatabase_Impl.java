package com.furianrt.donotcallme.data.room;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class ContactDatabase_Impl extends ContactDatabase {
  private volatile WhiteContactDao _whiteContactDao;

  private volatile BlackContactDao _blackContactDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `BlackContacts` (`activated` INTEGER NOT NULL, `id` TEXT NOT NULL, `name` TEXT NOT NULL, `numbers` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WhiteContacts` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `numbers` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"a2e238ffd4f94106959f26b45bfa7f25\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `BlackContacts`");
        _db.execSQL("DROP TABLE IF EXISTS `WhiteContacts`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBlackContacts = new HashMap<String, TableInfo.Column>(4);
        _columnsBlackContacts.put("activated", new TableInfo.Column("activated", "INTEGER", true, 0));
        _columnsBlackContacts.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsBlackContacts.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsBlackContacts.put("numbers", new TableInfo.Column("numbers", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBlackContacts = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBlackContacts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBlackContacts = new TableInfo("BlackContacts", _columnsBlackContacts, _foreignKeysBlackContacts, _indicesBlackContacts);
        final TableInfo _existingBlackContacts = TableInfo.read(_db, "BlackContacts");
        if (! _infoBlackContacts.equals(_existingBlackContacts)) {
          throw new IllegalStateException("Migration didn't properly handle BlackContacts(com.furianrt.donotcallme.data.model.BlackContact).\n"
                  + " Expected:\n" + _infoBlackContacts + "\n"
                  + " Found:\n" + _existingBlackContacts);
        }
        final HashMap<String, TableInfo.Column> _columnsWhiteContacts = new HashMap<String, TableInfo.Column>(3);
        _columnsWhiteContacts.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsWhiteContacts.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsWhiteContacts.put("numbers", new TableInfo.Column("numbers", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWhiteContacts = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWhiteContacts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWhiteContacts = new TableInfo("WhiteContacts", _columnsWhiteContacts, _foreignKeysWhiteContacts, _indicesWhiteContacts);
        final TableInfo _existingWhiteContacts = TableInfo.read(_db, "WhiteContacts");
        if (! _infoWhiteContacts.equals(_existingWhiteContacts)) {
          throw new IllegalStateException("Migration didn't properly handle WhiteContacts(com.furianrt.donotcallme.data.model.WhiteContact).\n"
                  + " Expected:\n" + _infoWhiteContacts + "\n"
                  + " Found:\n" + _existingWhiteContacts);
        }
      }
    }, "a2e238ffd4f94106959f26b45bfa7f25", "abb1265d60900d678f711159f38fcf37");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "BlackContacts","WhiteContacts");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `BlackContacts`");
      _db.execSQL("DELETE FROM `WhiteContacts`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public WhiteContactDao whiteDao() {
    if (_whiteContactDao != null) {
      return _whiteContactDao;
    } else {
      synchronized(this) {
        if(_whiteContactDao == null) {
          _whiteContactDao = new WhiteContactDao_Impl(this);
        }
        return _whiteContactDao;
      }
    }
  }

  @Override
  public BlackContactDao blackDao() {
    if (_blackContactDao != null) {
      return _blackContactDao;
    } else {
      synchronized(this) {
        if(_blackContactDao == null) {
          _blackContactDao = new BlackContactDao_Impl(this);
        }
        return _blackContactDao;
      }
    }
  }
}
