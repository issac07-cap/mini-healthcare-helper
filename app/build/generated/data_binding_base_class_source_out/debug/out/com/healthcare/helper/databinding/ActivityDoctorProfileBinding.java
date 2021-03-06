// Generated by view binder compiler. Do not edit!
package com.healthcare.helper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.healthcare.helper.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDoctorProfileBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final LinearLayout AddDateTimingSlotsLayout;

  @NonNull
  public final MaterialButton AddNewDateTimeBtn;

  @NonNull
  public final MaterialButton AddNewDegreeBtn;

  @NonNull
  public final LinearLayout DoctorDegreeLinearLayout;

  @NonNull
  public final CircleImageView DoctorProfileImgView;

  @NonNull
  public final TextView DoctorProfilePhoneNumber;

  @NonNull
  public final TextView DoctorProfileUsername;

  @NonNull
  public final MaterialButton UpdateDegreeDetailsBtn;

  @NonNull
  public final MaterialButton UpdateTimingDetailBtn;

  private ActivityDoctorProfileBinding(@NonNull ScrollView rootView,
      @NonNull LinearLayout AddDateTimingSlotsLayout, @NonNull MaterialButton AddNewDateTimeBtn,
      @NonNull MaterialButton AddNewDegreeBtn, @NonNull LinearLayout DoctorDegreeLinearLayout,
      @NonNull CircleImageView DoctorProfileImgView, @NonNull TextView DoctorProfilePhoneNumber,
      @NonNull TextView DoctorProfileUsername, @NonNull MaterialButton UpdateDegreeDetailsBtn,
      @NonNull MaterialButton UpdateTimingDetailBtn) {
    this.rootView = rootView;
    this.AddDateTimingSlotsLayout = AddDateTimingSlotsLayout;
    this.AddNewDateTimeBtn = AddNewDateTimeBtn;
    this.AddNewDegreeBtn = AddNewDegreeBtn;
    this.DoctorDegreeLinearLayout = DoctorDegreeLinearLayout;
    this.DoctorProfileImgView = DoctorProfileImgView;
    this.DoctorProfilePhoneNumber = DoctorProfilePhoneNumber;
    this.DoctorProfileUsername = DoctorProfileUsername;
    this.UpdateDegreeDetailsBtn = UpdateDegreeDetailsBtn;
    this.UpdateTimingDetailBtn = UpdateTimingDetailBtn;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AddDateTimingSlotsLayout;
      LinearLayout AddDateTimingSlotsLayout = ViewBindings.findChildViewById(rootView, id);
      if (AddDateTimingSlotsLayout == null) {
        break missingId;
      }

      id = R.id.AddNewDateTimeBtn;
      MaterialButton AddNewDateTimeBtn = ViewBindings.findChildViewById(rootView, id);
      if (AddNewDateTimeBtn == null) {
        break missingId;
      }

      id = R.id.AddNewDegreeBtn;
      MaterialButton AddNewDegreeBtn = ViewBindings.findChildViewById(rootView, id);
      if (AddNewDegreeBtn == null) {
        break missingId;
      }

      id = R.id.DoctorDegreeLinearLayout;
      LinearLayout DoctorDegreeLinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (DoctorDegreeLinearLayout == null) {
        break missingId;
      }

      id = R.id.DoctorProfileImgView;
      CircleImageView DoctorProfileImgView = ViewBindings.findChildViewById(rootView, id);
      if (DoctorProfileImgView == null) {
        break missingId;
      }

      id = R.id.DoctorProfilePhoneNumber;
      TextView DoctorProfilePhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (DoctorProfilePhoneNumber == null) {
        break missingId;
      }

      id = R.id.DoctorProfileUsername;
      TextView DoctorProfileUsername = ViewBindings.findChildViewById(rootView, id);
      if (DoctorProfileUsername == null) {
        break missingId;
      }

      id = R.id.UpdateDegreeDetailsBtn;
      MaterialButton UpdateDegreeDetailsBtn = ViewBindings.findChildViewById(rootView, id);
      if (UpdateDegreeDetailsBtn == null) {
        break missingId;
      }

      id = R.id.UpdateTimingDetailBtn;
      MaterialButton UpdateTimingDetailBtn = ViewBindings.findChildViewById(rootView, id);
      if (UpdateTimingDetailBtn == null) {
        break missingId;
      }

      return new ActivityDoctorProfileBinding((ScrollView) rootView, AddDateTimingSlotsLayout,
          AddNewDateTimeBtn, AddNewDegreeBtn, DoctorDegreeLinearLayout, DoctorProfileImgView,
          DoctorProfilePhoneNumber, DoctorProfileUsername, UpdateDegreeDetailsBtn,
          UpdateTimingDetailBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
