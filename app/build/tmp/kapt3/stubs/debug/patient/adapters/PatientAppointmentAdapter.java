package patient.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lpatient/adapters/PatientAppointmentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpatient/adapters/PatientAppointmentAdapter$ViewHolder;", "appointmentList", "", "Lrelations/PatientWithAppointments;", "pastOrUpcomingStatus", "", "(Ljava/util/List;Z)V", "context", "Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class PatientAppointmentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<patient.adapters.PatientAppointmentAdapter.ViewHolder> {
    private android.content.Context context;
    private final java.util.List<relations.PatientWithAppointments> appointmentList = null;
    private final boolean pastOrUpcomingStatus = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public patient.adapters.PatientAppointmentAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    patient.adapters.PatientAppointmentAdapter.ViewHolder holder, int position) {
    }
    
    public PatientAppointmentAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<relations.PatientWithAppointments> appointmentList, boolean pastOrUpcomingStatus) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lpatient/adapters/PatientAppointmentAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listItemView", "Landroid/view/View;", "(Lpatient/adapters/PatientAppointmentAdapter;Landroid/view/View;)V", "binding", "Lcom/healthcare/helper/databinding/AppointmentDetailRowItemBinding;", "getBinding", "()Lcom/healthcare/helper/databinding/AppointmentDetailRowItemBinding;", "dateTimeTxtView", "Landroid/widget/TextView;", "getDateTimeTxtView", "()Landroid/widget/TextView;", "docNameTxtView", "getDocNameTxtView", "imgView", "Landroid/widget/ImageView;", "getImgView", "()Landroid/widget/ImageView;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.healthcare.helper.databinding.AppointmentDetailRowItemBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imgView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView docNameTxtView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView dateTimeTxtView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.healthcare.helper.databinding.AppointmentDetailRowItemBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDocNameTxtView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDateTimeTxtView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View listItemView) {
            super(null);
        }
    }
}