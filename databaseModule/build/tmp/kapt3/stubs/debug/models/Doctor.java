package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B+\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lmodels/Doctor;", "Lmodels/Person;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "doctorId", "", "doctorUsername", "", "doctorPhone", "doctorDegreeList", "", "Lmodels/Certification;", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDoctorDegreeList", "()Ljava/util/List;", "getDoctorId", "()J", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "flags", "CREATOR", "databaseModule_debug"})
public final class Doctor extends models.Person implements android.os.Parcelable {
    private final long doctorId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<models.Certification> doctorDegreeList = null;
    public static final models.Doctor.CREATOR CREATOR = null;
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    public final long getDoctorId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.Certification> getDoctorDegreeList() {
        return null;
    }
    
    public Doctor(long doctorId, @org.jetbrains.annotations.NotNull()
    java.lang.String doctorUsername, @org.jetbrains.annotations.NotNull()
    java.lang.String doctorPhone, @org.jetbrains.annotations.NotNull()
    java.util.List<models.Certification> doctorDegreeList) {
        super(null, null);
    }
    
    public Doctor(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lmodels/Doctor$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lmodels/Doctor;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lmodels/Doctor;", "databaseModule_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<models.Doctor> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public models.Doctor createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public models.Doctor[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}