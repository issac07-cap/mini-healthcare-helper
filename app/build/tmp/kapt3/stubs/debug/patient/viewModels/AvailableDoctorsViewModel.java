package patient.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u0014J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u0014J\u0014\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lpatient/viewModels/AvailableDoctorsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "availableDegrees", "", "", "getAvailableDegrees", "()Ljava/util/List;", "availableDegrees$delegate", "Lkotlin/Lazy;", "availableDoctorsList", "", "Lrelations/DoctorWithCertifications;", "availableDoctorsLiveData", "Landroidx/lifecycle/MutableLiveData;", "patientDao", "Ldaos/PatientDao;", "filterAvailableDoctorData", "Landroidx/lifecycle/LiveData;", "filters", "getAllAvailableDoctorsList", "loadDegreeDetailsForAdapter", "Lmodels/FilterModel;", "restoreAvailableDoctorsList", "updateAvailableDoctorList", "", "l", "app_debug"})
public final class AvailableDoctorsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.util.List<relations.DoctorWithCertifications> availableDoctorsList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<relations.DoctorWithCertifications>> availableDoctorsLiveData = null;
    private final kotlin.Lazy availableDegrees$delegate = null;
    private final daos.PatientDao patientDao = null;
    
    private final java.util.List<java.lang.String> getAvailableDegrees() {
        return null;
    }
    
    public final boolean updateAvailableDoctorList(@org.jetbrains.annotations.NotNull()
    java.util.List<relations.DoctorWithCertifications> l) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.FilterModel> loadDegreeDetailsForAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<relations.DoctorWithCertifications>> getAllAvailableDoctorsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<relations.DoctorWithCertifications>> restoreAvailableDoctorsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<relations.DoctorWithCertifications>> filterAvailableDoctorData(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> filters) {
        return null;
    }
    
    public AvailableDoctorsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}