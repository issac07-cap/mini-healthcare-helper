package doctor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0002J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020\u0018H\u0002J\u0010\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\'2\u0006\u00100\u001a\u00020.H\u0002J\b\u00101\u001a\u00020\'H\u0002J\u0012\u00102\u001a\u00020\'2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J(\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020EH\u0002J \u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020>2\u0006\u0010H\u001a\u00020>2\u0006\u0010I\u001a\u00020BH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\bj\b\u0012\u0004\u0012\u00020!`\"X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"}, d2 = {"Ldoctor/DoctorProfileActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addNewDateTimeBtn", "Landroid/widget/Button;", "binding", "Lcom/healthcare/helper/databinding/ActivityDoctorProfileBinding;", "certificationList", "Ljava/util/ArrayList;", "Lentities/CertificationEnt;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "dateTimeLinearLayout", "Landroid/widget/LinearLayout;", "dateTimeSlotMap", "Ljava/util/HashMap;", "Ljava/time/LocalDate;", "Lmodels/AvailableTimingSlot;", "degreeList", "", "", "doctorCredential", "", "doctorDao", "Ldaos/DoctorDao;", "getDoctorDao", "()Ldaos/DoctorDao;", "doctorDao$delegate", "doctorDegreeList", "Lmodels/Certification;", "Lkotlin/collections/ArrayList;", "alreadyExistsCheck", "", "certificationEnt", "deleteDegreeView", "", "view", "Landroid/view/View;", "finishActivity", "message", "handleClickListeners", "doctorEnt", "Lentities/DoctorEnt;", "handleDegreeClickListeners", "doctor", "handleTimingClickListeners", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "removeDateTimeSlot", "storeDataInMap", "datePickerBtn", "Lcom/google/android/material/button/MaterialButton;", "fromTimePickerBtn", "toTimePickerBtn", "timeSlotEt", "Landroid/widget/EditText;", "validateAndStoreData", "count", "", "validateTimeSlotLayout", "fromTimePicker", "toTimePicker", "slotEt", "app_debug"})
public final class DoctorProfileActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.healthcare.helper.databinding.ActivityDoctorProfileBinding binding;
    private android.widget.Button addNewDateTimeBtn;
    private android.widget.LinearLayout dateTimeLinearLayout;
    private final java.util.HashMap<java.time.LocalDate, java.util.ArrayList<models.AvailableTimingSlot>> dateTimeSlotMap = null;
    private long doctorCredential = 0L;
    private final java.util.ArrayList<entities.CertificationEnt> certificationList = null;
    private final java.util.List<java.lang.String> degreeList = null;
    private final kotlin.Lazy context$delegate = null;
    private final kotlin.Lazy doctorDao$delegate = null;
    private java.util.ArrayList<models.Certification> doctorDegreeList;
    
    private final android.content.Context getContext() {
        return null;
    }
    
    private final daos.DoctorDao getDoctorDao() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void finishActivity(java.lang.String message) {
    }
    
    private final void deleteDegreeView(android.view.View view) {
    }
    
    private final void handleClickListeners(entities.DoctorEnt doctorEnt) {
    }
    
    private final void handleTimingClickListeners() {
    }
    
    private final void handleDegreeClickListeners(entities.DoctorEnt doctor) {
    }
    
    private final boolean alreadyExistsCheck(entities.CertificationEnt certificationEnt) {
        return false;
    }
    
    private final boolean validateAndStoreData(int count) {
        return false;
    }
    
    private final boolean storeDataInMap(com.google.android.material.button.MaterialButton datePickerBtn, com.google.android.material.button.MaterialButton fromTimePickerBtn, com.google.android.material.button.MaterialButton toTimePickerBtn, android.widget.EditText timeSlotEt) {
        return false;
    }
    
    private final boolean validateTimeSlotLayout(com.google.android.material.button.MaterialButton fromTimePicker, com.google.android.material.button.MaterialButton toTimePicker, android.widget.EditText slotEt) {
        return false;
    }
    
    private final void removeDateTimeSlot(android.view.View view) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public DoctorProfileActivity() {
        super();
    }
}