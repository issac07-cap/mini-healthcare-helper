// Generated by view binder compiler. Do not edit!
package com.healthcare.helper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.healthcare.helper.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPatientBookAppointmentBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final RecyclerView AvailableTimingsRcyView;

  @NonNull
  public final MaterialButton BookAppointmentBtnForPatient;

  @NonNull
  public final TextView ChooseTimingTxtViewForUser;

  @NonNull
  public final MaterialButton DateOfAppointmentBtn;

  @NonNull
  public final CircleImageView DoctorProfileImgViewForPatient;

  @NonNull
  public final TextView DoctorProfileUsernameForPatient;

  @NonNull
  public final LinearLayout FutureDatesLayout;

  @NonNull
  public final HorizontalScrollView FutureDatesScrollView;

  @NonNull
  public final TextView NoTimeAvailableTxtView;

  @NonNull
  public final LinearLayout SnackBarLayout;

  private ActivityPatientBookAppointmentBinding(@NonNull ScrollView rootView,
      @NonNull RecyclerView AvailableTimingsRcyView,
      @NonNull MaterialButton BookAppointmentBtnForPatient,
      @NonNull TextView ChooseTimingTxtViewForUser, @NonNull MaterialButton DateOfAppointmentBtn,
      @NonNull CircleImageView DoctorProfileImgViewForPatient,
      @NonNull TextView DoctorProfileUsernameForPatient, @NonNull LinearLayout FutureDatesLayout,
      @NonNull HorizontalScrollView FutureDatesScrollView, @NonNull TextView NoTimeAvailableTxtView,
      @NonNull LinearLayout SnackBarLayout) {
    this.rootView = rootView;
    this.AvailableTimingsRcyView = AvailableTimingsRcyView;
    this.BookAppointmentBtnForPatient = BookAppointmentBtnForPatient;
    this.ChooseTimingTxtViewForUser = ChooseTimingTxtViewForUser;
    this.DateOfAppointmentBtn = DateOfAppointmentBtn;
    this.DoctorProfileImgViewForPatient = DoctorProfileImgViewForPatient;
    this.DoctorProfileUsernameForPatient = DoctorProfileUsernameForPatient;
    this.FutureDatesLayout = FutureDatesLayout;
    this.FutureDatesScrollView = FutureDatesScrollView;
    this.NoTimeAvailableTxtView = NoTimeAvailableTxtView;
    this.SnackBarLayout = SnackBarLayout;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPatientBookAppointmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPatientBookAppointmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_patient_book_appointment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPatientBookAppointmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AvailableTimingsRcyView;
      RecyclerView AvailableTimingsRcyView = ViewBindings.findChildViewById(rootView, id);
      if (AvailableTimingsRcyView == null) {
        break missingId;
      }

      id = R.id.BookAppointmentBtnForPatient;
      MaterialButton BookAppointmentBtnForPatient = ViewBindings.findChildViewById(rootView, id);
      if (BookAppointmentBtnForPatient == null) {
        break missingId;
      }

      id = R.id.ChooseTimingTxtViewForUser;
      TextView ChooseTimingTxtViewForUser = ViewBindings.findChildViewById(rootView, id);
      if (ChooseTimingTxtViewForUser == null) {
        break missingId;
      }

      id = R.id.DateOfAppointmentBtn;
      MaterialButton DateOfAppointmentBtn = ViewBindings.findChildViewById(rootView, id);
      if (DateOfAppointmentBtn == null) {
        break missingId;
      }

      id = R.id.DoctorProfileImgViewForPatient;
      CircleImageView DoctorProfileImgViewForPatient = ViewBindings.findChildViewById(rootView, id);
      if (DoctorProfileImgViewForPatient == null) {
        break missingId;
      }

      id = R.id.DoctorProfileUsernameForPatient;
      TextView DoctorProfileUsernameForPatient = ViewBindings.findChildViewById(rootView, id);
      if (DoctorProfileUsernameForPatient == null) {
        break missingId;
      }

      id = R.id.FutureDatesLayout;
      LinearLayout FutureDatesLayout = ViewBindings.findChildViewById(rootView, id);
      if (FutureDatesLayout == null) {
        break missingId;
      }

      id = R.id.FutureDatesScrollView;
      HorizontalScrollView FutureDatesScrollView = ViewBindings.findChildViewById(rootView, id);
      if (FutureDatesScrollView == null) {
        break missingId;
      }

      id = R.id.NoTimeAvailableTxtView;
      TextView NoTimeAvailableTxtView = ViewBindings.findChildViewById(rootView, id);
      if (NoTimeAvailableTxtView == null) {
        break missingId;
      }

      id = R.id.SnackBarLayout;
      LinearLayout SnackBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (SnackBarLayout == null) {
        break missingId;
      }

      return new ActivityPatientBookAppointmentBinding((ScrollView) rootView,
          AvailableTimingsRcyView, BookAppointmentBtnForPatient, ChooseTimingTxtViewForUser,
          DateOfAppointmentBtn, DoctorProfileImgViewForPatient, DoctorProfileUsernameForPatient,
          FutureDatesLayout, FutureDatesScrollView, NoTimeAvailableTxtView, SnackBarLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}