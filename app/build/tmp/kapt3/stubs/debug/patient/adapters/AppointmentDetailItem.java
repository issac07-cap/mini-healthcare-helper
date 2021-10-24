package patient.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lpatient/adapters/AppointmentDetailItem;", "Lpatient/adapters/AppointmentListItem;", "appointmentDetails", "Lmodels/AppointmentDetails;", "(Lmodels/AppointmentDetails;)V", "getAppointmentDetails", "()Lmodels/AppointmentDetails;", "getType", "", "app_debug"})
public final class AppointmentDetailItem extends patient.adapters.AppointmentListItem {
    @org.jetbrains.annotations.NotNull()
    private final models.AppointmentDetails appointmentDetails = null;
    
    @java.lang.Override()
    public int getType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.AppointmentDetails getAppointmentDetails() {
        return null;
    }
    
    public AppointmentDetailItem(@org.jetbrains.annotations.NotNull()
    models.AppointmentDetails appointmentDetails) {
        super();
    }
}