package diffUtilsRecyclerView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"LdiffUtilsRecyclerView/FilterDoctorDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lmodels/FilterModel;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_debug"})
public final class FilterDoctorDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
    private final java.util.List<models.FilterModel> oldList = null;
    private final java.util.List<models.FilterModel> newList = null;
    
    @java.lang.Override()
    public int getOldListSize() {
        return 0;
    }
    
    @java.lang.Override()
    public int getNewListSize() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
    
    public FilterDoctorDiffUtil(@org.jetbrains.annotations.NotNull()
    java.util.List<models.FilterModel> oldList, @org.jetbrains.annotations.NotNull()
    java.util.List<models.FilterModel> newList) {
        super();
    }
}