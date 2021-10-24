package relations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lrelations/DoctorWithAvailabilities;", "", "availabilities", "Lentities/AvailabilityEnt;", "doctor", "Lrelations/DoctorDetails;", "(Lentities/AvailabilityEnt;Lrelations/DoctorDetails;)V", "getAvailabilities", "()Lentities/AvailabilityEnt;", "getDoctor", "()Lrelations/DoctorDetails;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "databaseModule_debug"})
public final class DoctorWithAvailabilities {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final entities.AvailabilityEnt availabilities = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "doctorId", entityColumn = "doctorId", entity = entities.DoctorEnt.class)
    private final relations.DoctorDetails doctor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final entities.AvailabilityEnt getAvailabilities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final relations.DoctorDetails getDoctor() {
        return null;
    }
    
    public DoctorWithAvailabilities(@org.jetbrains.annotations.NotNull()
    entities.AvailabilityEnt availabilities, @org.jetbrains.annotations.NotNull()
    relations.DoctorDetails doctor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final entities.AvailabilityEnt component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final relations.DoctorDetails component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final relations.DoctorWithAvailabilities copy(@org.jetbrains.annotations.NotNull()
    entities.AvailabilityEnt availabilities, @org.jetbrains.annotations.NotNull()
    relations.DoctorDetails doctor) {
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