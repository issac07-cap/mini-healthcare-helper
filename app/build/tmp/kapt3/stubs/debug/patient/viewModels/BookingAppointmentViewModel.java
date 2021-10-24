package patient.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lpatient/viewModels/BookingAppointmentViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "patientDao", "Ldaos/PatientDao;", "alreadyBookedAvailabilityOnADate", "Landroidx/lifecycle/LiveData;", "", "Lentities/AppointmentEnt;", "doctorId", "", "selectedDate", "Ljava/time/LocalDate;", "bookAnAppointment", "appointmentEnt", "(Lentities/AppointmentEnt;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailabilityOnADate", "Lrelations/DoctorWithAvailabilities;", "app_debug"})
public final class BookingAppointmentViewModel extends androidx.lifecycle.AndroidViewModel {
    private final daos.PatientDao patientDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<relations.DoctorWithAvailabilities>> getAvailabilityOnADate(long doctorId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate selectedDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<entities.AppointmentEnt>> alreadyBookedAvailabilityOnADate(long doctorId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate selectedDate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object bookAnAppointment(@org.jetbrains.annotations.NotNull()
    entities.AppointmentEnt appointmentEnt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    public BookingAppointmentViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}