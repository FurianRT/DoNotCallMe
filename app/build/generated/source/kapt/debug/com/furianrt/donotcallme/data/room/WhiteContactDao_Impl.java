package com.furianrt.donotcallme.data.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.RxRoom;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.furianrt.donotcallme.data.model.WhiteContact;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public class WhiteContactDao_Impl implements WhiteContactDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfWhiteContact;

  private final RoomTypeConverter __roomTypeConverter = new RoomTypeConverter();

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfWhiteContact;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public WhiteContactDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWhiteContact = new EntityInsertionAdapter<WhiteContact>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `WhiteContacts`(`id`,`name`,`numbers`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WhiteContact value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp;
        _tmp = __roomTypeConverter.fromList(value.getNumbers());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
      }
    };
    this.__updateAdapterOfWhiteContact = new EntityDeletionOrUpdateAdapter<WhiteContact>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `WhiteContacts` SET `id` = ?,`name` = ?,`numbers` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WhiteContact value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp;
        _tmp = __roomTypeConverter.fromList(value.getNumbers());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getId());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM WhiteContacts WHERE id=?";
        return _query;
      }
    };
  }

  @Override
  public void insert(WhiteContact contact) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfWhiteContact.insert(contact);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(WhiteContact contact) {
    __db.beginTransaction();
    try {
      __updateAdapterOfWhiteContact.handle(contact);
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
  public Flowable<List<WhiteContact>> getAllContacts() {
    final String _sql = "SELECT * FROM WhiteContacts";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"WhiteContacts"}, new Callable<List<WhiteContact>>() {
      @Override
      public List<WhiteContact> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfNumbers = _cursor.getColumnIndexOrThrow("numbers");
          final List<WhiteContact> _result = new ArrayList<WhiteContact>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WhiteContact _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final List<String> _tmpNumbers;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfNumbers);
            _tmpNumbers = __roomTypeConverter.fromString(_tmp);
            _item = new WhiteContact(_tmpId,_tmpName,_tmpNumbers);
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
