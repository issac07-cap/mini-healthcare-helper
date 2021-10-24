package com.healthcare.databasemodule;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import daos.DoctorDao;
import daos.DoctorDao_Impl;
import daos.PatientDao;
import daos.PatientDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Db_Impl extends Db {
  private volatile DoctorDao _doctorDao;

  private volatile PatientDao _patientDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DoctorEnt` (`doctorId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `doctorName` TEXT NOT NULL, `doctorPhone` TEXT NOT NULL, `doctorPassword` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_DoctorEnt_doctorPhone` ON `DoctorEnt` (`doctorPhone`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CertificationEnt` (`certificationId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `doctorId` INTEGER NOT NULL, `certificationName` TEXT NOT NULL, `graduationDate` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_CertificationEnt_doctorId_certificationName` ON `CertificationEnt` (`doctorId`, `certificationName`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PatientEnt` (`patientId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `patientName` TEXT NOT NULL, `patientPhone` TEXT NOT NULL, `patientPassword` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_PatientEnt_patientPhone` ON `PatientEnt` (`patientPhone`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AppointmentEnt` (`appointmentId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `doctorId` INTEGER NOT NULL, `patientId` INTEGER NOT NULL, `dateOfAppointment` INTEGER NOT NULL, `timeOfAppointment` TEXT NOT NULL, `duration` INTEGER NOT NULL, FOREIGN KEY(`doctorId`) REFERENCES `DoctorEnt`(`doctorId`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`patientId`) REFERENCES `PatientEnt`(`patientId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_AppointmentEnt_doctorId_dateOfAppointment_timeOfAppointment` ON `AppointmentEnt` (`doctorId`, `dateOfAppointment`, `timeOfAppointment`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_AppointmentEnt_doctorId` ON `AppointmentEnt` (`doctorId`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_AppointmentEnt_patientId` ON `AppointmentEnt` (`patientId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AvailabilityEnt` (`availabilityId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `doctorId` INTEGER NOT NULL, `availableDate` INTEGER NOT NULL, `fromTime` TEXT NOT NULL, `toTime` TEXT NOT NULL, `slotDuration` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_AvailabilityEnt_doctorId_availableDate_fromTime_toTime` ON `AvailabilityEnt` (`doctorId`, `availableDate`, `fromTime`, `toTime`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2bab1690fd4b2dcbc95718ada1f39320')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `DoctorEnt`");
        _db.execSQL("DROP TABLE IF EXISTS `CertificationEnt`");
        _db.execSQL("DROP TABLE IF EXISTS `PatientEnt`");
        _db.execSQL("DROP TABLE IF EXISTS `AppointmentEnt`");
        _db.execSQL("DROP TABLE IF EXISTS `AvailabilityEnt`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
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
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDoctorEnt = new HashMap<String, TableInfo.Column>(4);
        _columnsDoctorEnt.put("doctorId", new TableInfo.Column("doctorId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEnt.put("doctorName", new TableInfo.Column("doctorName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEnt.put("doctorPhone", new TableInfo.Column("doctorPhone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEnt.put("doctorPassword", new TableInfo.Column("doctorPassword", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDoctorEnt = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDoctorEnt = new HashSet<TableInfo.Index>(1);
        _indicesDoctorEnt.add(new TableInfo.Index("index_DoctorEnt_doctorPhone", true, Arrays.asList("doctorPhone")));
        final TableInfo _infoDoctorEnt = new TableInfo("DoctorEnt", _columnsDoctorEnt, _foreignKeysDoctorEnt, _indicesDoctorEnt);
        final TableInfo _existingDoctorEnt = TableInfo.read(_db, "DoctorEnt");
        if (! _infoDoctorEnt.equals(_existingDoctorEnt)) {
          return new RoomOpenHelper.ValidationResult(false, "DoctorEnt(entities.DoctorEnt).\n"
                  + " Expected:\n" + _infoDoctorEnt + "\n"
                  + " Found:\n" + _existingDoctorEnt);
        }
        final HashMap<String, TableInfo.Column> _columnsCertificationEnt = new HashMap<String, TableInfo.Column>(4);
        _columnsCertificationEnt.put("certificationId", new TableInfo.Column("certificationId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCertificationEnt.put("doctorId", new TableInfo.Column("doctorId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCertificationEnt.put("certificationName", new TableInfo.Column("certificationName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCertificationEnt.put("graduationDate", new TableInfo.Column("graduationDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCertificationEnt = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCertificationEnt = new HashSet<TableInfo.Index>(1);
        _indicesCertificationEnt.add(new TableInfo.Index("index_CertificationEnt_doctorId_certificationName", true, Arrays.asList("doctorId","certificationName")));
        final TableInfo _infoCertificationEnt = new TableInfo("CertificationEnt", _columnsCertificationEnt, _foreignKeysCertificationEnt, _indicesCertificationEnt);
        final TableInfo _existingCertificationEnt = TableInfo.read(_db, "CertificationEnt");
        if (! _infoCertificationEnt.equals(_existingCertificationEnt)) {
          return new RoomOpenHelper.ValidationResult(false, "CertificationEnt(entities.CertificationEnt).\n"
                  + " Expected:\n" + _infoCertificationEnt + "\n"
                  + " Found:\n" + _existingCertificationEnt);
        }
        final HashMap<String, TableInfo.Column> _columnsPatientEnt = new HashMap<String, TableInfo.Column>(4);
        _columnsPatientEnt.put("patientId", new TableInfo.Column("patientId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatientEnt.put("patientName", new TableInfo.Column("patientName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatientEnt.put("patientPhone", new TableInfo.Column("patientPhone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatientEnt.put("patientPassword", new TableInfo.Column("patientPassword", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPatientEnt = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPatientEnt = new HashSet<TableInfo.Index>(1);
        _indicesPatientEnt.add(new TableInfo.Index("index_PatientEnt_patientPhone", true, Arrays.asList("patientPhone")));
        final TableInfo _infoPatientEnt = new TableInfo("PatientEnt", _columnsPatientEnt, _foreignKeysPatientEnt, _indicesPatientEnt);
        final TableInfo _existingPatientEnt = TableInfo.read(_db, "PatientEnt");
        if (! _infoPatientEnt.equals(_existingPatientEnt)) {
          return new RoomOpenHelper.ValidationResult(false, "PatientEnt(entities.PatientEnt).\n"
                  + " Expected:\n" + _infoPatientEnt + "\n"
                  + " Found:\n" + _existingPatientEnt);
        }
        final HashMap<String, TableInfo.Column> _columnsAppointmentEnt = new HashMap<String, TableInfo.Column>(6);
        _columnsAppointmentEnt.put("appointmentId", new TableInfo.Column("appointmentId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppointmentEnt.put("doctorId", new TableInfo.Column("doctorId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppointmentEnt.put("patientId", new TableInfo.Column("patientId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppointmentEnt.put("dateOfAppointment", new TableInfo.Column("dateOfAppointment", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppointmentEnt.put("timeOfAppointment", new TableInfo.Column("timeOfAppointment", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppointmentEnt.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAppointmentEnt = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysAppointmentEnt.add(new TableInfo.ForeignKey("DoctorEnt", "CASCADE", "NO ACTION",Arrays.asList("doctorId"), Arrays.asList("doctorId")));
        _foreignKeysAppointmentEnt.add(new TableInfo.ForeignKey("PatientEnt", "CASCADE", "NO ACTION",Arrays.asList("patientId"), Arrays.asList("patientId")));
        final HashSet<TableInfo.Index> _indicesAppointmentEnt = new HashSet<TableInfo.Index>(3);
        _indicesAppointmentEnt.add(new TableInfo.Index("index_AppointmentEnt_doctorId_dateOfAppointment_timeOfAppointment", true, Arrays.asList("doctorId","dateOfAppointment","timeOfAppointment")));
        _indicesAppointmentEnt.add(new TableInfo.Index("index_AppointmentEnt_doctorId", false, Arrays.asList("doctorId")));
        _indicesAppointmentEnt.add(new TableInfo.Index("index_AppointmentEnt_patientId", false, Arrays.asList("patientId")));
        final TableInfo _infoAppointmentEnt = new TableInfo("AppointmentEnt", _columnsAppointmentEnt, _foreignKeysAppointmentEnt, _indicesAppointmentEnt);
        final TableInfo _existingAppointmentEnt = TableInfo.read(_db, "AppointmentEnt");
        if (! _infoAppointmentEnt.equals(_existingAppointmentEnt)) {
          return new RoomOpenHelper.ValidationResult(false, "AppointmentEnt(entities.AppointmentEnt).\n"
                  + " Expected:\n" + _infoAppointmentEnt + "\n"
                  + " Found:\n" + _existingAppointmentEnt);
        }
        final HashMap<String, TableInfo.Column> _columnsAvailabilityEnt = new HashMap<String, TableInfo.Column>(6);
        _columnsAvailabilityEnt.put("availabilityId", new TableInfo.Column("availabilityId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAvailabilityEnt.put("doctorId", new TableInfo.Column("doctorId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAvailabilityEnt.put("availableDate", new TableInfo.Column("availableDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAvailabilityEnt.put("fromTime", new TableInfo.Column("fromTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAvailabilityEnt.put("toTime", new TableInfo.Column("toTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAvailabilityEnt.put("slotDuration", new TableInfo.Column("slotDuration", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAvailabilityEnt = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAvailabilityEnt = new HashSet<TableInfo.Index>(1);
        _indicesAvailabilityEnt.add(new TableInfo.Index("index_AvailabilityEnt_doctorId_availableDate_fromTime_toTime", true, Arrays.asList("doctorId","availableDate","fromTime","toTime")));
        final TableInfo _infoAvailabilityEnt = new TableInfo("AvailabilityEnt", _columnsAvailabilityEnt, _foreignKeysAvailabilityEnt, _indicesAvailabilityEnt);
        final TableInfo _existingAvailabilityEnt = TableInfo.read(_db, "AvailabilityEnt");
        if (! _infoAvailabilityEnt.equals(_existingAvailabilityEnt)) {
          return new RoomOpenHelper.ValidationResult(false, "AvailabilityEnt(entities.AvailabilityEnt).\n"
                  + " Expected:\n" + _infoAvailabilityEnt + "\n"
                  + " Found:\n" + _existingAvailabilityEnt);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2bab1690fd4b2dcbc95718ada1f39320", "cd37a7ad92b8b0ccdacb72671996f451");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "DoctorEnt","CertificationEnt","PatientEnt","AppointmentEnt","AvailabilityEnt");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `DoctorEnt`");
      _db.execSQL("DELETE FROM `CertificationEnt`");
      _db.execSQL("DELETE FROM `PatientEnt`");
      _db.execSQL("DELETE FROM `AppointmentEnt`");
      _db.execSQL("DELETE FROM `AvailabilityEnt`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DoctorDao.class, DoctorDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PatientDao.class, PatientDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public DoctorDao getDoctorDao() {
    if (_doctorDao != null) {
      return _doctorDao;
    } else {
      synchronized(this) {
        if(_doctorDao == null) {
          _doctorDao = new DoctorDao_Impl(this);
        }
        return _doctorDao;
      }
    }
  }

  @Override
  public PatientDao getPatientDao() {
    if (_patientDao != null) {
      return _patientDao;
    } else {
      synchronized(this) {
        if(_patientDao == null) {
          _patientDao = new PatientDao_Impl(this);
        }
        return _patientDao;
      }
    }
  }
}
