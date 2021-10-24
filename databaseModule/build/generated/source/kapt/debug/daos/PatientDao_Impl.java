package daos;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import converters.LocalDateConverter;
import converters.LocalTimeConverter;
import entities.AppointmentEnt;
import entities.AvailabilityEnt;
import entities.CertificationEnt;
import entities.DoctorEnt;
import entities.PatientEnt;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import relations.DateTimePojo;
import relations.DoctorDetails;
import relations.DoctorWithAvailabilities;
import relations.DoctorWithCertifications;
import relations.PatientWithAppointments;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PatientDao_Impl implements PatientDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PatientEnt> __insertionAdapterOfPatientEnt;

  private final EntityInsertionAdapter<AppointmentEnt> __insertionAdapterOfAppointmentEnt;

  private final LocalDateConverter __localDateConverter = new LocalDateConverter();

  private final LocalTimeConverter __localTimeConverter = new LocalTimeConverter();

  public PatientDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPatientEnt = new EntityInsertionAdapter<PatientEnt>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `PatientEnt` (`patientId`,`patientName`,`patientPhone`,`patientPassword`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientEnt value) {
        stmt.bindLong(1, value.getPatientId());
        if (value.getPatientName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPatientName());
        }
        if (value.getPatientPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPatientPhone());
        }
        if (value.getPatientPassword() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPatientPassword());
        }
      }
    };
    this.__insertionAdapterOfAppointmentEnt = new EntityInsertionAdapter<AppointmentEnt>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `AppointmentEnt` (`appointmentId`,`doctorId`,`patientId`,`dateOfAppointment`,`timeOfAppointment`,`duration`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppointmentEnt value) {
        stmt.bindLong(1, value.getAppointmentId());
        stmt.bindLong(2, value.getDoctorId());
        stmt.bindLong(3, value.getPatientId());
        final long _tmp;
        _tmp = __localDateConverter.localDateToLong(value.getDateOfAppointment());
        stmt.bindLong(4, _tmp);
        final String _tmp_1;
        _tmp_1 = __localTimeConverter.localTimeToStr(value.getTimeOfAppointment());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        stmt.bindLong(6, value.getDuration());
      }
    };
  }

  @Override
  public Object insertPatient(final PatientEnt patient, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfPatientEnt.insertAndReturnId(patient);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object bookAnAppointment(final AppointmentEnt appointmentEnt,
      final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfAppointmentEnt.insertAndReturnId(appointmentEnt);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object patientLogin(final String patientPhone, final String patientPassword,
      final Continuation<? super List<Long>> p2) {
    final String _sql = "Select patientId from PatientEnt where patientPhone =? and patientPassword=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (patientPhone == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, patientPhone);
    }
    _argIndex = 2;
    if (patientPassword == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, patientPassword);
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
  public LiveData<List<DoctorWithCertifications>> getAllDoctorWithCertifications() {
    final String _sql = "Select * from DoctorEnt Group By doctorId";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"CertificationEnt","DoctorEnt"}, true, new Callable<List<DoctorWithCertifications>>() {
      @Override
      public List<DoctorWithCertifications> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfDoctorId = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorId");
            final int _cursorIndexOfDoctorName = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorName");
            final int _cursorIndexOfDoctorPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorPhone");
            final LongSparseArray<ArrayList<CertificationEnt>> _collectionCertifications = new LongSparseArray<ArrayList<CertificationEnt>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfDoctorId);
              ArrayList<CertificationEnt> _tmpCertificationsCollection = _collectionCertifications.get(_tmpKey);
              if (_tmpCertificationsCollection == null) {
                _tmpCertificationsCollection = new ArrayList<CertificationEnt>();
                _collectionCertifications.put(_tmpKey, _tmpCertificationsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipCertificationEntAsentitiesCertificationEnt(_collectionCertifications);
            final List<DoctorWithCertifications> _result = new ArrayList<DoctorWithCertifications>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final DoctorWithCertifications _item;
              final DoctorDetails _tmpDoctor;
              if (! (_cursor.isNull(_cursorIndexOfDoctorId) && _cursor.isNull(_cursorIndexOfDoctorName) && _cursor.isNull(_cursorIndexOfDoctorPhone))) {
                final long _tmpDoctorId;
                _tmpDoctorId = _cursor.getLong(_cursorIndexOfDoctorId);
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
                _tmpDoctor = new DoctorDetails(_tmpDoctorId,_tmpDoctorName,_tmpDoctorPhone);
              }  else  {
                _tmpDoctor = null;
              }
              ArrayList<CertificationEnt> _tmpCertificationsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfDoctorId);
              _tmpCertificationsCollection_1 = _collectionCertifications.get(_tmpKey_1);
              if (_tmpCertificationsCollection_1 == null) {
                _tmpCertificationsCollection_1 = new ArrayList<CertificationEnt>();
              }
              _item = new DoctorWithCertifications(_tmpDoctor,_tmpCertificationsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<DoctorWithAvailabilities>> getAvailabilityOnADate(final long doctorId,
      final LocalDate date) {
    final String _sql = "Select * from AvailabilityEnt where doctorId=? and availableDate=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, doctorId);
    _argIndex = 2;
    final long _tmp;
    _tmp = __localDateConverter.localDateToLong(date);
    _statement.bindLong(_argIndex, _tmp);
    return __db.getInvalidationTracker().createLiveData(new String[]{"DoctorEnt","AvailabilityEnt"}, true, new Callable<List<DoctorWithAvailabilities>>() {
      @Override
      public List<DoctorWithAvailabilities> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfAvailabilityId = CursorUtil.getColumnIndexOrThrow(_cursor, "availabilityId");
            final int _cursorIndexOfDoctorId = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorId");
            final int _cursorIndexOfAvailableDate = CursorUtil.getColumnIndexOrThrow(_cursor, "availableDate");
            final int _cursorIndexOfFromTime = CursorUtil.getColumnIndexOrThrow(_cursor, "fromTime");
            final int _cursorIndexOfToTime = CursorUtil.getColumnIndexOrThrow(_cursor, "toTime");
            final int _cursorIndexOfSlotDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "slotDuration");
            final LongSparseArray<DoctorDetails> _collectionDoctor = new LongSparseArray<DoctorDetails>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfDoctorId);
              _collectionDoctor.put(_tmpKey, null);
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipDoctorEntAsrelationsDoctorDetails(_collectionDoctor);
            final List<DoctorWithAvailabilities> _result = new ArrayList<DoctorWithAvailabilities>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final DoctorWithAvailabilities _item;
              final AvailabilityEnt _tmpAvailabilities;
              if (! (_cursor.isNull(_cursorIndexOfAvailabilityId) && _cursor.isNull(_cursorIndexOfDoctorId) && _cursor.isNull(_cursorIndexOfAvailableDate) && _cursor.isNull(_cursorIndexOfFromTime) && _cursor.isNull(_cursorIndexOfToTime) && _cursor.isNull(_cursorIndexOfSlotDuration))) {
                final long _tmpDoctorId;
                _tmpDoctorId = _cursor.getLong(_cursorIndexOfDoctorId);
                final LocalDate _tmpAvailableDate;
                final long _tmp_1;
                _tmp_1 = _cursor.getLong(_cursorIndexOfAvailableDate);
                _tmpAvailableDate = __localDateConverter.localDateFromEpoch(_tmp_1);
                final LocalTime _tmpFromTime;
                final String _tmp_2;
                if (_cursor.isNull(_cursorIndexOfFromTime)) {
                  _tmp_2 = null;
                } else {
                  _tmp_2 = _cursor.getString(_cursorIndexOfFromTime);
                }
                _tmpFromTime = __localTimeConverter.localTimeFromStr(_tmp_2);
                final LocalTime _tmpToTime;
                final String _tmp_3;
                if (_cursor.isNull(_cursorIndexOfToTime)) {
                  _tmp_3 = null;
                } else {
                  _tmp_3 = _cursor.getString(_cursorIndexOfToTime);
                }
                _tmpToTime = __localTimeConverter.localTimeFromStr(_tmp_3);
                final int _tmpSlotDuration;
                _tmpSlotDuration = _cursor.getInt(_cursorIndexOfSlotDuration);
                _tmpAvailabilities = new AvailabilityEnt(_tmpDoctorId,_tmpAvailableDate,_tmpFromTime,_tmpToTime,_tmpSlotDuration);
                final long _tmpAvailabilityId;
                _tmpAvailabilityId = _cursor.getLong(_cursorIndexOfAvailabilityId);
                _tmpAvailabilities.setAvailabilityId(_tmpAvailabilityId);
              }  else  {
                _tmpAvailabilities = null;
              }
              DoctorDetails _tmpDoctor = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfDoctorId);
              _tmpDoctor = _collectionDoctor.get(_tmpKey_1);
              _item = new DoctorWithAvailabilities(_tmpAvailabilities,_tmpDoctor);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<AppointmentEnt>> getBookedAvailabilityOnADate(final long doctorId,
      final LocalDate date) {
    final String _sql = "Select * from AppointmentEnt where doctorId=? and dateOfAppointment=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, doctorId);
    _argIndex = 2;
    final long _tmp;
    _tmp = __localDateConverter.localDateToLong(date);
    _statement.bindLong(_argIndex, _tmp);
    return __db.getInvalidationTracker().createLiveData(new String[]{"AppointmentEnt"}, true, new Callable<List<AppointmentEnt>>() {
      @Override
      public List<AppointmentEnt> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfAppointmentId = CursorUtil.getColumnIndexOrThrow(_cursor, "appointmentId");
            final int _cursorIndexOfDoctorId = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorId");
            final int _cursorIndexOfPatientId = CursorUtil.getColumnIndexOrThrow(_cursor, "patientId");
            final int _cursorIndexOfDateOfAppointment = CursorUtil.getColumnIndexOrThrow(_cursor, "dateOfAppointment");
            final int _cursorIndexOfTimeOfAppointment = CursorUtil.getColumnIndexOrThrow(_cursor, "timeOfAppointment");
            final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
            final List<AppointmentEnt> _result = new ArrayList<AppointmentEnt>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final AppointmentEnt _item;
              final long _tmpDoctorId;
              _tmpDoctorId = _cursor.getLong(_cursorIndexOfDoctorId);
              final long _tmpPatientId;
              _tmpPatientId = _cursor.getLong(_cursorIndexOfPatientId);
              final LocalDate _tmpDateOfAppointment;
              final long _tmp_1;
              _tmp_1 = _cursor.getLong(_cursorIndexOfDateOfAppointment);
              _tmpDateOfAppointment = __localDateConverter.localDateFromEpoch(_tmp_1);
              final LocalTime _tmpTimeOfAppointment;
              final String _tmp_2;
              if (_cursor.isNull(_cursorIndexOfTimeOfAppointment)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getString(_cursorIndexOfTimeOfAppointment);
              }
              _tmpTimeOfAppointment = __localTimeConverter.localTimeFromStr(_tmp_2);
              final int _tmpDuration;
              _tmpDuration = _cursor.getInt(_cursorIndexOfDuration);
              _item = new AppointmentEnt(_tmpDoctorId,_tmpPatientId,_tmpDateOfAppointment,_tmpTimeOfAppointment,_tmpDuration);
              final long _tmpAppointmentId;
              _tmpAppointmentId = _cursor.getLong(_cursorIndexOfAppointmentId);
              _item.setAppointmentId(_tmpAppointmentId);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<PatientWithAppointments>> getUpcomingAppointmentsForPatientById(
      final long patientId, final LocalDate currentDate, final LocalTime currentTime) {
    final String _sql = "SELECT * FROM ((SELECT * FROM AppointmentEnt as app where app.patientId=? and (dateOfAppointment > ?  OR (dateOfAppointment = ? AND timeOfAppointment > ?))) as PatientResult) INNER JOIN DoctorEnt as doc ON doc.doctorId=PatientResult.doctorId";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, patientId);
    _argIndex = 2;
    final long _tmp;
    _tmp = __localDateConverter.localDateToLong(currentDate);
    _statement.bindLong(_argIndex, _tmp);
    _argIndex = 3;
    final long _tmp_1;
    _tmp_1 = __localDateConverter.localDateToLong(currentDate);
    _statement.bindLong(_argIndex, _tmp_1);
    _argIndex = 4;
    final String _tmp_2;
    _tmp_2 = __localTimeConverter.localTimeToStr(currentTime);
    if (_tmp_2 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp_2);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"AppointmentEnt","DoctorEnt"}, false, new Callable<List<PatientWithAppointments>>() {
      @Override
      public List<PatientWithAppointments> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAppointmentId = CursorUtil.getColumnIndexOrThrow(_cursor, "appointmentId");
          final int _cursorIndexOfDoctorId = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorId");
          final int _cursorIndexOfPatientId = CursorUtil.getColumnIndexOrThrow(_cursor, "patientId");
          final int _cursorIndexOfDateOfAppointment = CursorUtil.getColumnIndexOrThrow(_cursor, "dateOfAppointment");
          final int _cursorIndexOfTimeOfAppointment = CursorUtil.getColumnIndexOrThrow(_cursor, "timeOfAppointment");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final int _cursorIndexOfDoctorId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorId");
          final int _cursorIndexOfDoctorName = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorName");
          final int _cursorIndexOfDoctorPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorPhone");
          final int _cursorIndexOfDoctorPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorPassword");
          final List<PatientWithAppointments> _result = new ArrayList<PatientWithAppointments>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PatientWithAppointments _item;
            final long _tmpAppointmentId;
            _tmpAppointmentId = _cursor.getLong(_cursorIndexOfAppointmentId);
            final long _tmpPatientId;
            _tmpPatientId = _cursor.getLong(_cursorIndexOfPatientId);
            final DoctorEnt _tmpDoctor;
            if (! (_cursor.isNull(_cursorIndexOfDoctorId) && _cursor.isNull(_cursorIndexOfDoctorId_1) && _cursor.isNull(_cursorIndexOfDoctorName) && _cursor.isNull(_cursorIndexOfDoctorPhone) && _cursor.isNull(_cursorIndexOfDoctorPassword))) {
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
              _tmpDoctor = new DoctorEnt(_tmpDoctorName,_tmpDoctorPhone,_tmpDoctorPassword);
              final long _tmpDoctorId;
              _tmpDoctorId = _cursor.getLong(_cursorIndexOfDoctorId);
              _tmpDoctor.setDoctorId(_tmpDoctorId);
              final long _tmpDoctorId_1;
              _tmpDoctorId_1 = _cursor.getLong(_cursorIndexOfDoctorId_1);
              _tmpDoctor.setDoctorId(_tmpDoctorId_1);
            }  else  {
              _tmpDoctor = null;
            }
            final DateTimePojo _tmpDateTimePojo;
            if (! (_cursor.isNull(_cursorIndexOfDateOfAppointment) && _cursor.isNull(_cursorIndexOfTimeOfAppointment) && _cursor.isNull(_cursorIndexOfDuration))) {
              final LocalDate _tmpDateOfAppointment;
              final long _tmp_3;
              _tmp_3 = _cursor.getLong(_cursorIndexOfDateOfAppointment);
              _tmpDateOfAppointment = __localDateConverter.localDateFromEpoch(_tmp_3);
              final LocalTime _tmpTimeOfAppointment;
              final String _tmp_4;
              if (_cursor.isNull(_cursorIndexOfTimeOfAppointment)) {
                _tmp_4 = null;
              } else {
                _tmp_4 = _cursor.getString(_cursorIndexOfTimeOfAppointment);
              }
              _tmpTimeOfAppointment = __localTimeConverter.localTimeFromStr(_tmp_4);
              final int _tmpDuration;
              _tmpDuration = _cursor.getInt(_cursorIndexOfDuration);
              _tmpDateTimePojo = new DateTimePojo(_tmpDateOfAppointment,_tmpTimeOfAppointment,_tmpDuration);
            }  else  {
              _tmpDateTimePojo = null;
            }
            _item = new PatientWithAppointments(_tmpAppointmentId,_tmpPatientId,_tmpDoctor,_tmpDateTimePojo);
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

  @Override
  public LiveData<List<PatientWithAppointments>> getPastAppointmentByPatientId(final long patientId,
      final LocalDate currentDate, final LocalTime currentTime) {
    final String _sql = "SELECT * FROM ((SELECT * FROM AppointmentEnt as app where app.patientId=? and (dateOfAppointment < ?  OR (dateOfAppointment = ? AND timeOfAppointment < ?))) as PatientResult) INNER JOIN DoctorEnt as doc ON doc.doctorId=PatientResult.doctorId";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, patientId);
    _argIndex = 2;
    final long _tmp;
    _tmp = __localDateConverter.localDateToLong(currentDate);
    _statement.bindLong(_argIndex, _tmp);
    _argIndex = 3;
    final long _tmp_1;
    _tmp_1 = __localDateConverter.localDateToLong(currentDate);
    _statement.bindLong(_argIndex, _tmp_1);
    _argIndex = 4;
    final String _tmp_2;
    _tmp_2 = __localTimeConverter.localTimeToStr(currentTime);
    if (_tmp_2 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp_2);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"AppointmentEnt","DoctorEnt"}, false, new Callable<List<PatientWithAppointments>>() {
      @Override
      public List<PatientWithAppointments> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAppointmentId = CursorUtil.getColumnIndexOrThrow(_cursor, "appointmentId");
          final int _cursorIndexOfDoctorId = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorId");
          final int _cursorIndexOfPatientId = CursorUtil.getColumnIndexOrThrow(_cursor, "patientId");
          final int _cursorIndexOfDateOfAppointment = CursorUtil.getColumnIndexOrThrow(_cursor, "dateOfAppointment");
          final int _cursorIndexOfTimeOfAppointment = CursorUtil.getColumnIndexOrThrow(_cursor, "timeOfAppointment");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final int _cursorIndexOfDoctorId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorId");
          final int _cursorIndexOfDoctorName = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorName");
          final int _cursorIndexOfDoctorPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorPhone");
          final int _cursorIndexOfDoctorPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorPassword");
          final List<PatientWithAppointments> _result = new ArrayList<PatientWithAppointments>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PatientWithAppointments _item;
            final long _tmpAppointmentId;
            _tmpAppointmentId = _cursor.getLong(_cursorIndexOfAppointmentId);
            final long _tmpPatientId;
            _tmpPatientId = _cursor.getLong(_cursorIndexOfPatientId);
            final DoctorEnt _tmpDoctor;
            if (! (_cursor.isNull(_cursorIndexOfDoctorId) && _cursor.isNull(_cursorIndexOfDoctorId_1) && _cursor.isNull(_cursorIndexOfDoctorName) && _cursor.isNull(_cursorIndexOfDoctorPhone) && _cursor.isNull(_cursorIndexOfDoctorPassword))) {
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
              _tmpDoctor = new DoctorEnt(_tmpDoctorName,_tmpDoctorPhone,_tmpDoctorPassword);
              final long _tmpDoctorId;
              _tmpDoctorId = _cursor.getLong(_cursorIndexOfDoctorId);
              _tmpDoctor.setDoctorId(_tmpDoctorId);
              final long _tmpDoctorId_1;
              _tmpDoctorId_1 = _cursor.getLong(_cursorIndexOfDoctorId_1);
              _tmpDoctor.setDoctorId(_tmpDoctorId_1);
            }  else  {
              _tmpDoctor = null;
            }
            final DateTimePojo _tmpDateTimePojo;
            if (! (_cursor.isNull(_cursorIndexOfDateOfAppointment) && _cursor.isNull(_cursorIndexOfTimeOfAppointment) && _cursor.isNull(_cursorIndexOfDuration))) {
              final LocalDate _tmpDateOfAppointment;
              final long _tmp_3;
              _tmp_3 = _cursor.getLong(_cursorIndexOfDateOfAppointment);
              _tmpDateOfAppointment = __localDateConverter.localDateFromEpoch(_tmp_3);
              final LocalTime _tmpTimeOfAppointment;
              final String _tmp_4;
              if (_cursor.isNull(_cursorIndexOfTimeOfAppointment)) {
                _tmp_4 = null;
              } else {
                _tmp_4 = _cursor.getString(_cursorIndexOfTimeOfAppointment);
              }
              _tmpTimeOfAppointment = __localTimeConverter.localTimeFromStr(_tmp_4);
              final int _tmpDuration;
              _tmpDuration = _cursor.getInt(_cursorIndexOfDuration);
              _tmpDateTimePojo = new DateTimePojo(_tmpDateOfAppointment,_tmpTimeOfAppointment,_tmpDuration);
            }  else  {
              _tmpDateTimePojo = null;
            }
            _item = new PatientWithAppointments(_tmpAppointmentId,_tmpPatientId,_tmpDoctor,_tmpDateTimePojo);
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

  private void __fetchRelationshipCertificationEntAsentitiesCertificationEnt(
      final LongSparseArray<ArrayList<CertificationEnt>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<CertificationEnt>> _tmpInnerMap = new LongSparseArray<ArrayList<CertificationEnt>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipCertificationEntAsentitiesCertificationEnt(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<CertificationEnt>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipCertificationEntAsentitiesCertificationEnt(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `certificationId`,`doctorId`,`certificationName`,`graduationDate` FROM `CertificationEnt` WHERE `doctorId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "doctorId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfCertificationId = CursorUtil.getColumnIndexOrThrow(_cursor, "certificationId");
      final int _cursorIndexOfDoctorId = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorId");
      final int _cursorIndexOfCertificationName = CursorUtil.getColumnIndexOrThrow(_cursor, "certificationName");
      final int _cursorIndexOfGraduationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "graduationDate");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<CertificationEnt> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final CertificationEnt _item_1;
          final long _tmpDoctorId;
          _tmpDoctorId = _cursor.getLong(_cursorIndexOfDoctorId);
          final String _tmpCertificationName;
          if (_cursor.isNull(_cursorIndexOfCertificationName)) {
            _tmpCertificationName = null;
          } else {
            _tmpCertificationName = _cursor.getString(_cursorIndexOfCertificationName);
          }
          final LocalDate _tmpGraduationDate;
          final long _tmp;
          _tmp = _cursor.getLong(_cursorIndexOfGraduationDate);
          _tmpGraduationDate = __localDateConverter.localDateFromEpoch(_tmp);
          _item_1 = new CertificationEnt(_tmpDoctorId,_tmpCertificationName,_tmpGraduationDate);
          final long _tmpCertificationId;
          _tmpCertificationId = _cursor.getLong(_cursorIndexOfCertificationId);
          _item_1.setCertificationId(_tmpCertificationId);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipDoctorEntAsrelationsDoctorDetails(
      final LongSparseArray<DoctorDetails> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<DoctorDetails> _tmpInnerMap = new LongSparseArray<DoctorDetails>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), null);
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipDoctorEntAsrelationsDoctorDetails(_tmpInnerMap);
          _map.putAll(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<DoctorDetails>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipDoctorEntAsrelationsDoctorDetails(_tmpInnerMap);
        _map.putAll(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `doctorId`,`doctorName`,`doctorPhone` FROM `DoctorEnt` WHERE `doctorId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "doctorId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfDoctorId = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorId");
      final int _cursorIndexOfDoctorName = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorName");
      final int _cursorIndexOfDoctorPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorPhone");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        if (_map.containsKey(_tmpKey)) {
          final DoctorDetails _item_1;
          final long _tmpDoctorId;
          _tmpDoctorId = _cursor.getLong(_cursorIndexOfDoctorId);
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
          _item_1 = new DoctorDetails(_tmpDoctorId,_tmpDoctorName,_tmpDoctorPhone);
          _map.put(_tmpKey, _item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
