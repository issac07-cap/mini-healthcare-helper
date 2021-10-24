package daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\'J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\'J,\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\'J,\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Ldaos/PatientDao;", "", "bookAnAppointment", "", "appointmentEnt", "Lentities/AppointmentEnt;", "(Lentities/AppointmentEnt;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDoctorWithCertifications", "Landroidx/lifecycle/LiveData;", "", "Lrelations/DoctorWithCertifications;", "getAvailabilityOnADate", "Lrelations/DoctorWithAvailabilities;", "doctorId", "date", "Ljava/time/LocalDate;", "getBookedAvailabilityOnADate", "getPastAppointmentByPatientId", "Lrelations/PatientWithAppointments;", "patientId", "currentDate", "currentTime", "Ljava/time/LocalTime;", "getUpcomingAppointmentsForPatientById", "insertPatient", "patient", "Lentities/PatientEnt;", "(Lentities/PatientEnt;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "patientLogin", "patientPhone", "", "patientPassword", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "databaseModule_debug"})
public abstract interface PatientDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertPatient(@org.jetbrains.annotations.NotNull()
    entities.PatientEnt patient, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "Select patientId from PatientEnt where patientPhone =:patientPhone and patientPassword=:patientPassword")
    public abstract java.lang.Object patientLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String patientPhone, @org.jetbrains.annotations.NotNull()
    java.lang.String patientPassword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> p2);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from DoctorEnt Group By doctorId")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<java.util.List<relations.DoctorWithCertifications>> getAllDoctorWithCertifications();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from AvailabilityEnt where doctorId=:doctorId and availableDate=:date")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<java.util.List<relations.DoctorWithAvailabilities>> getAvailabilityOnADate(long doctorId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object bookAnAppointment(@org.jetbrains.annotations.NotNull()
    entities.AppointmentEnt appointmentEnt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from AppointmentEnt where doctorId=:doctorId and dateOfAppointment=:date")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<java.util.List<entities.AppointmentEnt>> getBookedAvailabilityOnADate(long doctorId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ((SELECT * FROM AppointmentEnt as app where app.patientId=:patientId and (dateOfAppointment > :currentDate  OR (dateOfAppointment = :currentDate AND timeOfAppointment > :currentTime))) as PatientResult) INNER JOIN DoctorEnt as doc ON doc.doctorId=PatientResult.doctorId")
    public abstract androidx.lifecycle.LiveData<java.util.List<relations.PatientWithAppointments>> getUpcomingAppointmentsForPatientById(long patientId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate currentDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime currentTime);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ((SELECT * FROM AppointmentEnt as app where app.patientId=:patientId and (dateOfAppointment < :currentDate  OR (dateOfAppointment = :currentDate AND timeOfAppointment < :currentTime))) as PatientResult) INNER JOIN DoctorEnt as doc ON doc.doctorId=PatientResult.doctorId")
    public abstract androidx.lifecycle.LiveData<java.util.List<relations.PatientWithAppointments>> getPastAppointmentByPatientId(long patientId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate currentDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime currentTime);
}