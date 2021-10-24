package entities;

import java.lang.System;

@androidx.room.Entity(indices = {@androidx.room.Index(unique = true, value = {"doctorId", "availableDate", "fromTime", "toTime"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\nH\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015\u00a8\u0006%"}, d2 = {"Lentities/AvailabilityEnt;", "", "doctorId", "", "availableDate", "Ljava/time/LocalDate;", "fromTime", "Ljava/time/LocalTime;", "toTime", "slotDuration", "", "(JLjava/time/LocalDate;Ljava/time/LocalTime;Ljava/time/LocalTime;I)V", "availabilityId", "getAvailabilityId", "()J", "setAvailabilityId", "(J)V", "getAvailableDate", "()Ljava/time/LocalDate;", "getDoctorId", "getFromTime", "()Ljava/time/LocalTime;", "getSlotDuration", "()I", "getToTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "databaseModule_debug"})
public final class AvailabilityEnt {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long availabilityId = 0L;
    private final long doctorId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDate availableDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalTime fromTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalTime toTime = null;
    private final int slotDuration = 0;
    
    public final long getAvailabilityId() {
        return 0L;
    }
    
    public final void setAvailabilityId(long p0) {
    }
    
    public final long getDoctorId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getAvailableDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime getFromTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime getToTime() {
        return null;
    }
    
    public final int getSlotDuration() {
        return 0;
    }
    
    public AvailabilityEnt(long doctorId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate availableDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime fromTime, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime toTime, int slotDuration) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalTime component3() {
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
    public final entities.AvailabilityEnt copy(long doctorId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate availableDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime fromTime, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime toTime, int slotDuration) {
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