package relations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lrelations/PatientWithAppointments;", "", "appointmentId", "", "patientId", "doctor", "Lentities/DoctorEnt;", "dateTimePojo", "Lrelations/DateTimePojo;", "(JJLentities/DoctorEnt;Lrelations/DateTimePojo;)V", "getAppointmentId", "()J", "getDateTimePojo", "()Lrelations/DateTimePojo;", "getDoctor", "()Lentities/DoctorEnt;", "getPatientId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "databaseModule_debug"})
public final class PatientWithAppointments {
    private final long appointmentId = 0L;
    private final long patientId = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final entities.DoctorEnt doctor = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final relations.DateTimePojo dateTimePojo = null;
    
    public final long getAppointmentId() {
        return 0L;
    }
    
    public final long getPatientId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final entities.DoctorEnt getDoctor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final relations.DateTimePojo getDateTimePojo() {
        return null;
    }
    
    public PatientWithAppointments(long appointmentId, long patientId, @org.jetbrains.annotations.NotNull()
    entities.DoctorEnt doctor, @org.jetbrains.annotations.NotNull()
    relations.DateTimePojo dateTimePojo) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final entities.DoctorEnt component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final relations.DateTimePojo component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final relations.PatientWithAppointments copy(long appointmentId, long patientId, @org.jetbrains.annotations.NotNull()
    entities.DoctorEnt doctor, @org.jetbrains.annotations.NotNull()
    relations.DateTimePojo dateTimePojo) {
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