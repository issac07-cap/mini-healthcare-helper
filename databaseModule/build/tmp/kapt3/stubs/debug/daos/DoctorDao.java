package daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\n2\u0006\u0010\f\u001a\u00020\u0004H\'J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Ldaos/DoctorDao;", "", "doctorLogin", "", "", "doctorPhone", "", "doctorPassword", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDoctorById", "Landroidx/lifecycle/LiveData;", "Lentities/DoctorEnt;", "doctorId", "insertAvailabilities", "availabilities", "Lentities/AvailabilityEnt;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCertifications", "certifications", "Lentities/CertificationEnt;", "insertDoctor", "doctor", "(Lentities/DoctorEnt;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "databaseModule_debug"})
public abstract interface DoctorDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertDoctor(@org.jetbrains.annotations.NotNull()
    entities.DoctorEnt doctor, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "Select doctorId from DoctorEnt where doctorPhone =:doctorPhone and doctorPassword=:doctorPassword limit 1")
    public abstract java.lang.Object doctorLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String doctorPhone, @org.jetbrains.annotations.NotNull()
    java.lang.String doctorPassword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> p2);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from DoctorEnt where doctorId=:doctorId limit 1")
    public abstract androidx.lifecycle.LiveData<java.util.List<entities.DoctorEnt>> getDoctorById(long doctorId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    @androidx.room.Transaction()
    public abstract java.lang.Object insertCertifications(@org.jetbrains.annotations.NotNull()
    java.util.List<entities.CertificationEnt> certifications, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertAvailabilities(@org.jetbrains.annotations.NotNull()
    java.util.List<entities.AvailabilityEnt> availabilities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> p1);
}