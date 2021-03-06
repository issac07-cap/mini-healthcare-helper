// Generated by view binder compiler. Do not edit!
package com.healthcare.helper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.healthcare.helper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AppointmentDateItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView DateOfAppointmentHistoryRowTxtView;

  private AppointmentDateItemBinding(@NonNull LinearLayout rootView,
      @NonNull TextView DateOfAppointmentHistoryRowTxtView) {
    this.rootView = rootView;
    this.DateOfAppointmentHistoryRowTxtView = DateOfAppointmentHistoryRowTxtView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AppointmentDateItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AppointmentDateItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.appointment_date_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AppointmentDateItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DateOfAppointmentHistoryRowTxtView;
      TextView DateOfAppointmentHistoryRowTxtView = ViewBindings.findChildViewById(rootView, id);
      if (DateOfAppointmentHistoryRowTxtView == null) {
        break missingId;
      }

      return new AppointmentDateItemBinding((LinearLayout) rootView,
          DateOfAppointmentHistoryRowTxtView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
