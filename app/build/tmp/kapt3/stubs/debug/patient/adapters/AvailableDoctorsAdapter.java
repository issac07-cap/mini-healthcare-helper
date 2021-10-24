package patient.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001\u001cB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0014\u0010\u001b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lpatient/adapters/AvailableDoctorsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpatient/adapters/AvailableDoctorsAdapter$ViewHolder;", "Landroid/widget/Filterable;", "availableDoctorItemInterface", "Lpatient/interfaces/AvailableDoctorItemInterface;", "(Lpatient/interfaces/AvailableDoctorItemInterface;)V", "availableDoctorFilterList", "", "Lmodels/Doctor;", "availableDoctorsList", "filteredDoctorsAdapterData", "", "availableDoctorList", "", "getAvailableDoctorsList", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAvailableDoctorsAdapterData", "ViewHolder", "app_debug"})
public final class AvailableDoctorsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<patient.adapters.AvailableDoctorsAdapter.ViewHolder> implements android.widget.Filterable {
    private java.util.List<models.Doctor> availableDoctorFilterList;
    private java.util.List<models.Doctor> availableDoctorsList;
    private final patient.interfaces.AvailableDoctorItemInterface availableDoctorItemInterface = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.Doctor> getAvailableDoctorsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public patient.adapters.AvailableDoctorsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    patient.adapters.AvailableDoctorsAdapter.ViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    public final void filteredDoctorsAdapterData(@org.jetbrains.annotations.NotNull()
    java.util.List<models.Doctor> availableDoctorList) {
    }
    
    public final void setAvailableDoctorsAdapterData(@org.jetbrains.annotations.NotNull()
    java.util.List<models.Doctor> availableDoctorList) {
    }
    
    public AvailableDoctorsAdapter(@org.jetbrains.annotations.NotNull()
    patient.interfaces.AvailableDoctorItemInterface availableDoctorItemInterface) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lpatient/adapters/AvailableDoctorsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listItemView", "Landroid/view/View;", "(Lpatient/adapters/AvailableDoctorsAdapter;Landroid/view/View;)V", "doctorDegreeTxtView", "Landroid/widget/TextView;", "getDoctorDegreeTxtView", "()Landroid/widget/TextView;", "doctorProfileImageView", "Landroid/widget/ImageView;", "getDoctorProfileImageView", "()Landroid/widget/ImageView;", "doctorUsernameTxtView", "getDoctorUsernameTxtView", "doctorVideoCallBtn", "Landroid/widget/ImageButton;", "getDoctorVideoCallBtn", "()Landroid/widget/ImageButton;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView doctorProfileImageView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView doctorUsernameTxtView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView doctorDegreeTxtView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageButton doctorVideoCallBtn = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getDoctorProfileImageView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDoctorUsernameTxtView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDoctorDegreeTxtView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageButton getDoctorVideoCallBtn() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View listItemView) {
            super(null);
        }
    }
}