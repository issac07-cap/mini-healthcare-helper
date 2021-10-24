package daos;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import converters.LocalDateConverter;
import converters.LocalTimeConverter;
import entities.AvailabilityEnt;
import entities.CertificationEnt;
import entities.DoctorEnt;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DoctorDao_Impl implements DoctorDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DoctorEnt> __insertionAdapterOfDoctorEnt;

  private final EntityInsertionAdapter<CertificationEnt> __insertionAdapterOfCertificationEnt;

  private final LocalDateConverter __localDateConverter = new LocalDateConverter();

  private final EntityInsertionAdapter<AvailabilityEnt> __insertionAdapterOfAvailabilityEnt;

  private final LocalTimeConverter __localTimeConverter = new LocalTimeConverter();

  public DoctorDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDoctorEnt = new EntityInsertionAdapter<DoctorEnt>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `DoctorEnt` (`doctorId`,`doctorName`,`doctorPhone`,`doctorPassword`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DoctorEnt value) {
        stmt.bindLong(1, value.getDoctorId());
        if (value.getDoctorName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDoctorName());
        }
        if (value.getDoctorPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDoctorPhone());
        }
        if (value.getDoctorPassword() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDoctorPassword());
        }
      }
    };
    this.__insertionAdapterOfCertificationEnt = new EntityInsertionAdapter<CertificationEnt>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `CertificationEnt` (`certificationId`,`doctorId`,`certificationName`,`graduationDate`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CertificationEnt value) {
        stmt.bindLong(1, value.getCertificationId());
        stmt.bindLong(2, value.getDoctorId());
        if (value.getCertificationName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCertificationName());
        }
        final long _tmp;
        _tmp = __localDateConverter.localDateToLong(value.getGraduationDate());
        stmt.bindLong(4, _tmp);
      }
    };
    this.__insertionAdapterOfAvailabilityEnt = new EntityInsertionAdapter<AvailabilityEnt>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `AvailabilityEnt` (`availabilityId`,`doctorId`,`availableDate`,`fromTime`,`toTime`,`slotDuration`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AvailabilityEnt value) {
        stmt.bindLong(1, value.getAvailabilityId());
        stmt.bindLong(2, value.getDoctorId());
        final long _tmp;
        _tmp = __localDateConverter.localDateToLong(value.getAvailableDate());
        stmt.bindLong(3, _tmp);
        final String _tmp_1;
        _tmp_1 = __localTimeConverter.localTimeToStr(value.getFromTime());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __localTimeConverter.localTimeToStr(value.getToTime());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        stmt.bindLong(6, value.getSlotDuration());
      }
    };
  }

  @Override
  public Object insertDoctor(final DoctorEnt doctor, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfDoctorEnt.insertAndReturnId(doctor);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertCertifications(final List<CertificationEnt> certifications,
      final Continuation<? super List<Long>> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          List<Long> _result = __insertionAdapterOfCertificationEnt.insertAndReturnIdsList(certifications);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertAvailabilities(final List<AvailabilityEnt> availabilities,
      final Continuation<? super List<Long>> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          List<Long> _result = __insertionAdapterOfAvailabilityEnt.insertAndReturnIdsList(availabilities);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object doctorLogin(final String doctorPhone, final String doctorPassword,
      final Continuation<? super List<Long>> p2) {
    final String _sql = "Select doctorId from DoctorEnt where doctorPhone =? and doctorPassword=? limit 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (doctorPhone == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, doctorPhone);
    }
    _argIndex = 2;
    if (doctorPassword == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, doctorPassword);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<Long> _result = new ArrayList<Long>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Long _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getLong(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p2);
  }

  @Override
  public LiveData<List<DoctorEnt>> getDoctorById(final long doctorId) {
    final String _sql = "Select * from DoctorEnt where doctorId=? limit 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, doctorId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"DoctorEnt"}, false, new Callable<List<DoctorEnt>>() {
      @Override
      public List<DoctorEnt> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDoctorId = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorId");
          final int _cursorIndexOfDoctorName = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorName");
          final int _cursorIndexOfDoctorPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorPhone");
          final int _cursorIndexOfDoctorPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorPassword");
          final List<DoctorEnt> _result = new ArrayList<DoctorEnt>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DoctorEnt _item;
            final String _tmpDoctorName;
            if (_cursor.isNull(_cursorIndexOfDoctorName)) {
              _tmpDoctorName = null;
            } else {
              _tmpDoctorName = _cursor.getString(_cursorIndexOfDoctorName);
            }
            final String _tmpDoctorPhone;
            if (_cursor.isNull(_cursorIndexOfDoctorPhone)) {
              _tmpDoctorPhone = null;
            } else {
              _tmpDoctorPhone = _cursor.getString(_cursorIndexOfDoctorPhone);
            }
            final String _tmpDoctorPassword;
            if (_cursor.isNull(_cursorIndexOfDoctorPassword)) {
              _tmpDoctorPassword = null;
            } else {
              _tmpDoctorPassword = _cursor.getString(_cursorIndexOfDoctorPassword);
            }
            _item = new DoctorEnt(_tmpDoctorName,_tmpDoctorPhone,_tmpDoctorPassword);
            final long _tmpDoctorId;
            _tmpDoctorId = _cursor.getLong(_cursorIndexOfDoctorId);
            _item.setDoctorId(_tmpDoctorId);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
