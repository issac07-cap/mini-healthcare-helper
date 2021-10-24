package entities;

import java.lang.System;

@androidx.room.Entity(indices = {@androidx.room.Index(unique = true, value = {"doctorId", "certificationName"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lentities/CertificationEnt;", "", "doctorId", "", "certificationName", "", "graduationDate", "Ljava/time/LocalDate;", "(JLjava/lang/String;Ljava/time/LocalDate;)V", "certificationId", "getCertificationId", "()J", "setCertificationId", "(J)V", "getCertificationName", "()Ljava/lang/String;", "getDoctorId", "getGraduationDate", "()Ljava/time/LocalDate;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "databaseModule_debug"})
public final class CertificationEnt {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long certificationId = 0L;
    private final long doctorId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String certificationName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDate graduationDate = null;
    
    public final long getCertificationId() {
        return 0L;
    }
    
    public final void setCertificationId(long p0) {
    }
    
    public final long getDoctorId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCertificationName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getGraduationDate() {
        return null;
    }
    
    public CertificationEnt(long doctorId, @org.jetbrains.annotations.NotNull()
    java.lang.String certificationName, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate graduationDate) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final entities.CertificationEnt copy(long doctorId, @org.jetbrains.annotations.NotNull()
    java.lang.String certificationName, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate graduationDate) {
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