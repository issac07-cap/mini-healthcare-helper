package patient.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lpatient/adapters/AvailableDoctorTimingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpatient/adapters/AvailableDoctorTimingAdapter$ViewHolder;", "availableTimingList", "", "Ljava/time/LocalTime;", "(Ljava/util/List;)V", "checkedPosition", "", "context", "Landroid/content/Context;", "getItemCount", "getSelected", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AvailableDoctorTimingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<patient.adapters.AvailableDoctorTimingAdapter.ViewHolder> {
    private android.content.Context context;
    private int checkedPosition = -1;
    private final java.util.List<java.time.LocalTime> availableTimingList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public patient.adapters.AvailableDoctorTimingAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    patient.adapters.AvailableDoctorTimingAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalTime getSelected() {
        return null;
    }
    
    public AvailableDoctorTimingAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.time.LocalTime> availableTimingList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lpatient/adapters/AvailableDoctorTimingAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listItemView", "Landroid/view/View;", "(Lpatient/adapters/AvailableDoctorTimingAdapter;Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "textView", "Landroid/widget/TextView;", "bind", "", "timing", "Ljava/time/LocalTime;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView textView;
        private android.widget.ImageView imageView;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.time.LocalTime timing) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View listItemView) {
            super(null);
        }
    }
}