// Generated by view binder compiler. Do not edit!
package com.healthcare.helper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.healthcare.helper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddNewDegreeItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton DeleteDegreeBtn;

  @NonNull
  public final AutoCompleteTextView DoctorDegreeDrpDown;

  @NonNull
  public final MaterialButton DoctorDegreeExpDateBtn;

  private AddNewDegreeItemBinding(@NonNull LinearLayout rootView,
      @NonNull ImageButton DeleteDegreeBtn, @NonNull AutoCompleteTextView DoctorDegreeDrpDown,
      @NonNull MaterialButton DoctorDegreeExpDateBtn) {
    this.rootView = rootView;
    this.DeleteDegreeBtn = DeleteDegreeBtn;
    this.DoctorDegreeDrpDown = DoctorDegreeDrpDown;
    this.DoctorDegreeExpDateBtn = DoctorDegreeExpDateBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddNewDegreeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddNewDegreeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_new_degree_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddNewDegreeItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DeleteDegreeBtn;
      ImageButton DeleteDegreeBtn = ViewBindings.findChildViewById(rootView, id);
      if (DeleteDegreeBtn == null) {
        break missingId;
      }

      id = R.id.DoctorDegreeDrpDown;
      AutoCompleteTextView DoctorDegreeDrpDown = ViewBindings.findChildViewById(rootView, id);
      if (DoctorDegreeDrpDown == null) {
        break missingId;
      }

      id = R.id.DoctorDegreeExpDateBtn;
      MaterialButton DoctorDegreeExpDateBtn = ViewBindings.findChildViewById(rootView, id);
      if (DoctorDegreeExpDateBtn == null) {
        break missingId;
      }

      return new AddNewDegreeItemBinding((LinearLayout) rootView, DeleteDegreeBtn,
          DoctorDegreeDrpDown, DoctorDegreeExpDateBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
