package com.healthcare.databasemodule;

import java.lang.System;

@androidx.room.TypeConverters(value = {converters.LocalDateConverter.class, converters.LocalTimeConverter.class})
@androidx.room.Database(entities = {entities.DoctorEnt.class, entities.CertificationEnt.class, entities.PatientEnt.class, entities.AppointmentEnt.class, entities.AvailabilityEnt.class}, version = 3)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/healthcare/databasemodule/Db;", "Landroidx/room/RoomDatabase;", "()V", "doctorDao", "Ldaos/DoctorDao;", "getDoctorDao", "()Ldaos/DoctorDao;", "patientDao", "Ldaos/PatientDao;", "getPatientDao", "()Ldaos/PatientDao;", "Companion", "databaseModule_debug"})
public abstract class Db extends androidx.room.RoomDatabase {
    private static volatile com.healthcare.databasemodule.Db INSTANCE;
    public static final com.healthcare.databasemodule.Db.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract daos.DoctorDao getDoctorDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract daos.PatientDao getPatientDao();
    
    public Db() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/healthcare/databasemodule/Db$Companion;", "", "()V", "INSTANCE", "Lcom/healthcare/databasemodule/Db;", "getInstance", "context", "Landroid/content/Context;", "databaseModule_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.healthcare.databasemodule.Db getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}