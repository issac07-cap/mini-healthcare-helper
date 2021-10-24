package helperFunctions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u001a\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r\u001aI\u0010\u0018\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u001b2#\b\u0002\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u001e\u00a2\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00140\u001d\u001a@\u0010\"\u001a\u00020\u0014\"\u0006\b\u0000\u0010#\u0018\u0001*\u00020\u00032\u0006\u0010$\u001a\u0002H#2\u0006\u0010%\u001a\u00020\b2\u0014\b\u0006\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u001dH\u0086\b\u00a2\u0006\u0002\u0010\'\u001a\n\u0010(\u001a\u00020)*\u00020\u0003\u001a\n\u0010*\u001a\u00020+*\u00020\u0003\u001a\n\u0010,\u001a\u00020)*\u00020\u0003\u001a\u001c\u0010-\u001a\u00020.*\u00020\u00032\u0006\u0010/\u001a\u00020\b2\b\b\u0002\u00100\u001a\u00020\u001b\u001a\u001a\u00101\u001a\u00020\u0014*\u00020\u00032\u0006\u00102\u001a\u0002032\u0006\u0010%\u001a\u00020\b\u001a9\u00104\u001a\u00020\u0014\"\u0004\b\u0000\u0010#*\u00020\u00032\f\u00105\u001a\b\u0012\u0004\u0012\u0002H#062\u0019\b\u0002\u00107\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00140\u001d\u00a2\u0006\u0002\b9\u00a8\u0006:"}, d2 = {"getDarkModeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "getDoctorSharedPreferences", "getLocalDateObject", "Ljava/time/LocalDate;", "dateStr", "", "getPatientSharedPreferences", "getSnackBar", "Lcom/google/android/material/snackbar/Snackbar;", "layout", "Landroid/view/View;", "message", "duration", "", "getToast", "Landroid/widget/Toast;", "makeVisibilityToGivenState", "", "view", "state", "showSoftKeyboard", "getAlertDialog", "error_type", "cancellable", "", "positiveButtonClickCallback", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "Lkotlin/ParameterName;", "name", "dialog", "getDatePickerDialog", "T", "DateOfAppointmentView", "viewTitle", "callBackFun", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getDoctorCredentials", "", "getLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getPatientCredentials", "getSupportActionBarView", "Landroidx/appcompat/app/ActionBar;", "title", "setHomeAsEnabled", "getTimePickerDialog", "timePickerView", "Lcom/google/android/material/button/MaterialButton;", "openActivity", "it", "Ljava/lang/Class;", "extras", "Landroid/os/Bundle;", "Lkotlin/ExtensionFunctionType;", "app_debug"})
public final class GetHelperViewKt {
    
    public static final void getAlertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getAlertDialog, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int error_type, boolean cancellable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.DialogInterface, kotlin.Unit> positiveButtonClickCallback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.recyclerview.widget.LinearLayoutManager getLinearLayoutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getLinearLayoutManager) {
        return null;
    }
    
    public static final long getDoctorCredentials(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDoctorCredentials) {
        return 0L;
    }
    
    public static final long getPatientCredentials(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getPatientCredentials) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.Toast getToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
        return null;
    }
    
    public static final void makeVisibilityToGivenState(@org.jetbrains.annotations.NotNull()
    android.view.View view, int state) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar getSnackBar(@org.jetbrains.annotations.NotNull()
    android.view.View layout, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.appcompat.app.ActionBar getSupportActionBarView(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getSupportActionBarView, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean setHomeAsEnabled) {
        return null;
    }
    
    public static final void showSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final void getTimePickerDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getTimePickerDialog, @org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton timePickerView, @org.jetbrains.annotations.NotNull()
    java.lang.String viewTitle) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.time.LocalDate getLocalDateObject(@org.jetbrains.annotations.NotNull()
    java.lang.String dateStr) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void openActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openActivity, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> it, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.os.Bundle, kotlin.Unit> extras) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.SharedPreferences getPatientSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.SharedPreferences getDoctorSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.SharedPreferences getDarkModeSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}