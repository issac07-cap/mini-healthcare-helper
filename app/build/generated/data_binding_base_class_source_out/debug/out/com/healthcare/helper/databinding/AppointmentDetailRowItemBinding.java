// Generated by view binder compiler. Do not edit!
package com.healthcare.helper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.healthcare.helper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AppointmentDetailRowItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView AppointmentHistoryCardBackground;

  @NonNull
  public final TextView appointmentDateTime;

  @NonNull
  public final TextView appointmentDoctorName;

  @NonNull
  public final ImageView appointmentTypeImgView;

  private AppointmentDetailRowItemBinding(@NonNull CardView rootView,
      @NonNull CardView AppointmentHistoryCardBackground, @NonNull TextView appointmentDateTime,
      @NonNull TextView appointmentDoctorName, @NonNull ImageView appointmentTypeImgView) {
    this.rootView = rootView;
    this.AppointmentHistoryCardBackground = AppointmentHistoryCardBackground;
    this.appointmentDateTime = appointmentDateTime;
    this.appointmentDoctorName = appointmentDoctorName;
    this.appointmentTypeImgView = appointmentTypeImgView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static AppointmentDetailRowItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AppointmentDetailRowItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.appointment_detail_row_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AppointmentDetailRowItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView AppointmentHistoryCardBackground = (CardView) rootView;

      id = R.id.appointmentDateTime;
      TextView appointmentDateTime = ViewBindings.findChildViewById(rootView, id);
      if (appointmentDateTime == null) {
        break missingId;
      }

      id = R.id.appointmentDoctorName;
      TextView appointmentDoctorName = ViewBindings.findChildViewById(rootView, id);
      if (appointmentDoctorName == null) {
        break missingId;
      }

      id = R.id.appointmentTypeImgView;
      ImageView appointmentTypeImgView = ViewBindings.findChildViewById(rootView, id);
      if (appointmentTypeImgView == null) {
        break missingId;
      }

      return new AppointmentDetailRowItemBinding((CardView) rootView,
          AppointmentHistoryCardBackground, appointmentDateTime, appointmentDoctorName,
          appointmentTypeImgView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
