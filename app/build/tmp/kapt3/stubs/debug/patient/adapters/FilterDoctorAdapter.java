package patient.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\r2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J$\u0010\u0018\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lpatient/adapters/FilterDoctorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpatient/adapters/FilterDoctorAdapter$ViewHolder;", "filters", "", "Lmodels/FilterModel;", "oldList", "", "(Ljava/util/List;Ljava/util/List;)V", "checkedList", "Ljava/util/ArrayList;", "", "clearCheckedTextView", "", "getCheckedResult", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateDataSet", "newList", "ViewHolder", "app_debug"})
public final class FilterDoctorAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<patient.adapters.FilterDoctorAdapter.ViewHolder> {
    private final java.util.ArrayList<java.lang.String> checkedList = null;
    private final java.util.List<models.FilterModel> filters = null;
    private final java.util.List<models.FilterModel> oldList = null;
    
    public final void clearCheckedTextView() {
    }
    
    private final void updateDataSet(java.util.List<models.FilterModel> oldList, java.util.List<models.FilterModel> newList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCheckedResult() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public patient.adapters.FilterDoctorAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    patient.adapters.FilterDoctorAdapter.ViewHolder holder, int position) {
    }
    
    public FilterDoctorAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<models.FilterModel> filters, @org.jetbrains.annotations.NotNull()
    java.util.List<models.FilterModel> oldList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lpatient/adapters/FilterDoctorAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listItemView", "Landroid/view/View;", "(Lpatient/adapters/FilterDoctorAdapter;Landroid/view/View;)V", "binding", "Lcom/healthcare/helper/databinding/FilterDoctorItemBinding;", "getBinding", "()Lcom/healthcare/helper/databinding/FilterDoctorItemBinding;", "checkedTxtView", "Landroid/widget/CheckedTextView;", "bind", "", "position", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.healthcare.helper.databinding.FilterDoctorItemBinding binding = null;
        private final android.widget.CheckedTextView checkedTxtView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.healthcare.helper.databinding.FilterDoctorItemBinding getBinding() {
            return null;
        }
        
        public final void bind(int position) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View listItemView) {
            super(null);
        }
    }
}