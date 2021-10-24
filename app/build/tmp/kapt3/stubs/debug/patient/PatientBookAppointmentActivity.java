package patient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0002J\u0012\u0010\'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020 H\u0002J\b\u0010.\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lpatient/PatientBookAppointmentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lpatient/adapters/AvailableDoctorTimingAdapter;", "availableTimeList", "Ljava/util/ArrayList;", "Ljava/time/LocalTime;", "getAvailableTimeList", "()Ljava/util/ArrayList;", "availableTimeList$delegate", "Lkotlin/Lazy;", "binding", "Lcom/healthcare/helper/databinding/ActivityPatientBookAppointmentBinding;", "bookingBtn", "Lcom/google/android/material/button/MaterialButton;", "context", "getContext", "()Lpatient/PatientBookAppointmentActivity;", "context$delegate", "dateOfAppointment", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "doctorId", "", "isPageLoadedForFirstTime", "", "patCredential", "previousBtn", "viewModel", "Lpatient/viewModels/BookingAppointmentViewModel;", "closeActivity", "", "getAvailabilityOnADate", "selectedDate", "handleDatePickerDialog", "handleFutureDates", "hideNoSlotAvailableView", "hideTimeSlotRecyclerView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "showNoSlotAvailableView", "showTimeSlotRecyclerView", "app_debug"})
public final class PatientBookAppointmentActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.healthcare.helper.databinding.ActivityPatientBookAppointmentBinding binding;
    private patient.adapters.AvailableDoctorTimingAdapter adapter;
    private final kotlin.Lazy availableTimeList$delegate = null;
    private long doctorId = 0L;
    private long patCredential = 0L;
    private com.google.android.material.button.MaterialButton bookingBtn;
    private com.google.android.material.button.MaterialButton previousBtn;
    private java.time.LocalDate dateOfAppointment;
    private boolean isPageLoadedForFirstTime = true;
    private final kotlin.Lazy context$delegate = null;
    private patient.viewModels.BookingAppointmentViewModel viewModel;
    
    private final java.util.ArrayList<java.time.LocalTime> getAvailableTimeList() {
        return null;
    }
    
    private final patient.PatientBookAppointmentActivity getContext() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getAvailabilityOnADate(java.time.LocalDate selectedDate) {
    }
    
    private final void handleFutureDates() {
    }
    
    private final void closeActivity() {
    }
    
    private final void handleDatePickerDialog() {
    }
    
    private final void showNoSlotAvailableView() {
    }
    
    private final void showTimeSlotRecyclerView() {
    }
    
    private final void hideTimeSlotRecyclerView() {
    }
    
    private final void hideNoSlotAvailableView() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public PatientBookAppointmentActivity() {
        super();
    }
}