package patient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lpatient/PatientSearchResultActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lpatient/interfaces/AvailableDoctorItemInterface;", "()V", "availableDoctorsAdapter", "Lpatient/adapters/AvailableDoctorsAdapter;", "getAvailableDoctorsAdapter", "()Lpatient/adapters/AvailableDoctorsAdapter;", "availableDoctorsAdapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/healthcare/helper/databinding/ActivityPatientSearchResultBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "doctor", "Lmodels/Doctor;", "app_debug"})
public final class PatientSearchResultActivity extends androidx.appcompat.app.AppCompatActivity implements patient.interfaces.AvailableDoctorItemInterface {
    private com.healthcare.helper.databinding.ActivityPatientSearchResultBinding binding;
    private final kotlin.Lazy availableDoctorsAdapter$delegate = null;
    
    private final patient.adapters.AvailableDoctorsAdapter getAvailableDoctorsAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    models.Doctor doctor) {
    }
    
    public PatientSearchResultActivity() {
        super();
    }
}