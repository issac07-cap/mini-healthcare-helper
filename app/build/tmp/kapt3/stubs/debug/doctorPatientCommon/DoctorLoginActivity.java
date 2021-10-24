package doctorPatientCommon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"LdoctorPatientCommon/DoctorLoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "backgroundExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "binding", "Lcom/healthcare/helper/databinding/ActivityDoctorPatientLoginBinding;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "doctorDao", "Ldaos/DoctorDao;", "getDoctorDao", "()Ldaos/DoctorDao;", "doctorDao$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "onStop", "showEtError", "phone", "", "password", "app_debug"})
public final class DoctorLoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.healthcare.helper.databinding.ActivityDoctorPatientLoginBinding binding;
    private java.util.concurrent.ScheduledExecutorService backgroundExecutor;
    private final kotlin.Lazy doctorDao$delegate = null;
    private final kotlin.Lazy context$delegate = null;
    
    private final daos.DoctorDao getDoctorDao() {
        return null;
    }
    
    private final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void showEtError(java.lang.String phone, java.lang.String password) {
    }
    
    public DoctorLoginActivity() {
        super();
    }
}