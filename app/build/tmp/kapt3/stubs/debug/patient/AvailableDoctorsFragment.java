package patient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0$H\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\u0012\u0010+\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0018\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J&\u00103\u001a\u0004\u0018\u0001042\u0006\u00101\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00108\u001a\u00020)H\u0016J\u0010\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020%H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001eH\u0016J\u001a\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u0002042\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0016\u0010@\u001a\u00020)2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\'0$H\u0002J\u0018\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020DH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lpatient/AvailableDoctorsFragment;", "Landroidx/fragment/app/Fragment;", "Lpatient/interfaces/AvailableDoctorItemInterface;", "()V", "_binding", "Lcom/healthcare/helper/databinding/AvailableDoctorsFragmentBinding;", "_filterBinding", "Lcom/healthcare/helper/databinding/DoctorFilterDialogBinding;", "adapter", "Lpatient/adapters/AvailableDoctorsAdapter;", "getAdapter", "()Lpatient/adapters/AvailableDoctorsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lcom/healthcare/helper/databinding/AvailableDoctorsFragmentBinding;", "dialog", "Landroid/app/Dialog;", "filterAdapter", "Lpatient/adapters/FilterDoctorAdapter;", "getFilterAdapter", "()Lpatient/adapters/FilterDoctorAdapter;", "filterAdapter$delegate", "filterBinding", "getFilterBinding", "()Lcom/healthcare/helper/databinding/DoctorFilterDialogBinding;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "searchIconItem", "Landroid/view/MenuItem;", "searchView", "Landroidx/appcompat/widget/SearchView;", "viewModel", "Lpatient/viewModels/AvailableDoctorsViewModel;", "convertToDoctorEnt", "", "Lmodels/Doctor;", "docWithCerts", "Lrelations/DoctorWithCertifications;", "inflateFilterDoctorDialog", "", "initListeners", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onItemClick", "doctor", "onOptionsItemSelected", "", "item", "onViewCreated", "view", "organizeTheAvailableDocList", "list", "toggleViewState", "rcyViewState", "", "txtViewState", "Companion", "app_debug"})
public final class AvailableDoctorsFragment extends androidx.fragment.app.Fragment implements patient.interfaces.AvailableDoctorItemInterface {
    private patient.viewModels.AvailableDoctorsViewModel viewModel;
    private android.view.MenuItem searchIconItem;
    private com.healthcare.helper.databinding.AvailableDoctorsFragmentBinding _binding;
    private android.app.Dialog dialog;
    private com.healthcare.helper.databinding.DoctorFilterDialogBinding _filterBinding;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private androidx.appcompat.widget.SearchView searchView;
    private final kotlin.Lazy adapter$delegate = null;
    private final kotlin.Lazy filterAdapter$delegate = null;
    public static final patient.AvailableDoctorsFragment.Companion Companion = null;
    
    private final com.healthcare.helper.databinding.AvailableDoctorsFragmentBinding getBinding() {
        return null;
    }
    
    private final com.healthcare.helper.databinding.DoctorFilterDialogBinding getFilterBinding() {
        return null;
    }
    
    private final patient.adapters.AvailableDoctorsAdapter getAdapter() {
        return null;
    }
    
    private final patient.adapters.FilterDoctorAdapter getFilterAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void inflateFilterDoctorDialog() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void initListeners() {
    }
    
    private final java.util.List<models.Doctor> convertToDoctorEnt(java.util.List<relations.DoctorWithCertifications> docWithCerts) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void organizeTheAvailableDocList(java.util.List<relations.DoctorWithCertifications> list) {
    }
    
    private final void toggleViewState(int rcyViewState, int txtViewState) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    models.Doctor doctor) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    public AvailableDoctorsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lpatient/AvailableDoctorsFragment$Companion;", "", "()V", "newInstance", "Lpatient/AvailableDoctorsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final patient.AvailableDoctorsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}