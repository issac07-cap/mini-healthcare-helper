package entities;

import java.lang.System;

@androidx.room.Entity(indices = {@androidx.room.Index(unique = true, value = {"doctorId", "dateOfAppointment", "timeOfAppointment"})}, foreignKeys = {@androidx.room.ForeignKey(entity = entities.DoctorEnt.class, childColumns = {"doctorId"}, onDelete = 5, parentColumns = {"doctorId"}), @androidx.room.ForeignKey(entity = entities.PatientEnt.class, childColumns = {"patientId"}, onDelete = 5, parentColumns = {"patientId"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\nH\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lentities/AppointmentEnt;", "", "doctorId", "", "patientId", "dateOfAppointment", "Ljava/time/LocalDate;", "timeOfAppointment", "Ljava/time/LocalTime;", "duration", "", "(JJLjava/time/LocalDate;Ljava/time/LocalTime;I)V", "appointmentId", "getAppointmentId", "()J", "setAppointmentId", "(J)V", "getDateOfAppointment", "()Ljava/time/LocalDate;", "getDoctorId", "getDuration", "()I", "getPatientId", "getTimeOfAppointment", "()Ljava/time/LocalTime;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "databaseModule_debug"})
public final class AppointmentEnt {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long appointmentId = 0L;
    @androidx.room.ColumnInfo(index = true)
    private final long doctorId = 0L;
    @androidx.room.ColumnInfo(index = true)
    private final long patientId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDate dateOfAppointment = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalTime timeOfAppointment = null;
    private final int duration = 0;
    
    public final long getAppointmentId() {
        return 0L;
    }
    
    public final void setAppointmentId(long p0) {
    }
    
    public final long getDoctorId() {
        return 0L;
    }
    
    public final long getPatientId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getDateOfAppointment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime getTimeOfAppointment() {
        return null;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    public AppointmentEnt(long doctorId, long patientId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate dateOfAppointment, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime timeOfAppointment, int duration) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final entities.AppointmentEnt copy(long doctorId, long patientId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate dateOfAppointment, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime timeOfAppointment, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}