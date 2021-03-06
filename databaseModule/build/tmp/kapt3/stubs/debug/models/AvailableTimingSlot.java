package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lmodels/AvailableTimingSlot;", "Ljava/io/Serializable;", "fromTime", "Ljava/time/LocalTime;", "toTime", "slotDuration", "", "(Ljava/time/LocalTime;Ljava/time/LocalTime;I)V", "getFromTime", "()Ljava/time/LocalTime;", "getSlotDuration", "()I", "getToTime", "databaseModule_debug"})
public final class AvailableTimingSlot implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalTime fromTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalTime toTime = null;
    private final int slotDuration = 0;
    
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
    
    public AvailableTimingSlot(@org.jetbrains.annotations.NotNull()
    java.time.LocalTime fromTime, @org.jetbrains.annotations.NotNull()
    java.time.LocalTime toTime, int slotDuration) {
        super();
    }
}