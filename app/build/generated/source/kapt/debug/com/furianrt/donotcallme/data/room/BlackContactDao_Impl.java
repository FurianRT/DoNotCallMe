package com.furianrt.donotcallme.data.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.RxRoom;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.furianrt.donotcallme.data.model.BlackContact;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public class BlackContactDao_Impl implements BlackContactDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfBlackContact;

  private final RoomTypeConverter __roomTypeConverter = new RoomTypeConverter();

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfBlackContact;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public BlackContactDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBlackContact = new EntityInsertionAdapter<BlackContact>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `BlackContacts`(`activated`,`id`,`name`,`numbers`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BlackContact value) {
        final int _tmp;
        _tmp = value.getActivated() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        final String _tmp_1;
        _tmp_1 = __roomTypeConverter.fromList(value.getNumbers());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
      }
    };
    this.__updateAdapterOfBlackContact = new EntityDeletionOrUpdateAdapter<BlackContact>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `BlackContacts` SET `activated` = ?,`id` = ?,`name` = ?,`numbers` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BlackContact value) {
        final int _tmp;
        _tmp = value.getActivated() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        final String _tmp_1;
        _tmp_1 = __roomTypeConverter.fromList(value.getNumbers());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getId());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM BlackContacts WHERE id=?";
        return _query;
      }
    };
  }

  @Override
  public void insert(BlackContact contact) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfBlackContact.insert(contact);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(BlackContact contact) {
    __db.beginTransaction();
    try {
      __updateAdapterOfBlackContact.handle(contact);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(String id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (id == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, id);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public Flowable<List<BlackContact>> getAllContacts() {
    final String _sql = "SELECT * FROM BlackContacts";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"BlackContacts"}, new Callable<List<BlackContact>>() {
      @Override
      public List<BlackContact> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfActivated = _cursor.getColumnIndexOrThrow("activated");
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfNumbers = _cursor.getColumnIndexOrThrow("numbers");
          final List<BlackContact> _result = new ArrayList<BlackContact>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BlackContact _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final List<String> _tmpNumbers;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfNumbers);
            _tmpNumbers = __roomTypeConverter.fromString(_tmp);
            _item = new BlackContact(_tmpId,_tmpName,_tmpNumbers);
            final boolean _tmpActivated;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfActivated);
            _tmpActivated = _tmp_1 != 0;
            _item.setActivated(_tmpActivated);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
