package admin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Ladmin/RegisterRoleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/healthcare/helper/databinding/ActivityRegisterRoleBinding;", "context", "getContext", "()Ladmin/RegisterRoleActivity;", "context$delegate", "Lkotlin/Lazy;", "doctorDao", "Ldaos/DoctorDao;", "getDoctorDao", "()Ldaos/DoctorDao;", "doctorDao$delegate", "addDoctorDataToDatabase", "", "doctorUsername", "", "doctorPhone", "doctorPassword", "doctorDegree", "graduatedIn", "handleClickListeners", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class RegisterRoleActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.healthcare.helper.databinding.ActivityRegisterRoleBinding binding;
    private final kotlin.Lazy doctorDao$delegate = null;
    private final kotlin.Lazy context$delegate = null;
    
    private final daos.DoctorDao getDoctorDao() {
        return null;
    }
    
    private final admin.RegisterRoleActivity getContext() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handleClickListeners() {
    }
    
    private final void addDoctorDataToDatabase(java.lang.String doctorUsername, java.lang.String doctorPhone, java.lang.String doctorPassword, java.lang.String doctorDegree, java.lang.String graduatedIn) {
    }
    
    public RegisterRoleActivity() {
        super();
    }
}