package application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"Lapplication/ApplicationClass;", "Landroid/app/Application;", "()V", "TAG", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "doctorDao", "Ldaos/DoctorDao;", "getDoctorDao", "()Ldaos/DoctorDao;", "doctorDao$delegate", "patientDao", "Ldaos/PatientDao;", "getPatientDao", "()Ldaos/PatientDao;", "patientDao$delegate", "onCreate", "", "app_debug"})
public final class ApplicationClass extends android.app.Application {
    private final java.lang.String TAG = "AppTag";
    private final kotlin.Lazy context$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy doctorDao$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy patientDao$delegate = null;
    
    private final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final daos.DoctorDao getDoctorDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final daos.PatientDao getPatientDao() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public ApplicationClass() {
        super();
    }
}