// Generated by view binder compiler. Do not edit!
package com.healthcare.helper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.healthcare.helper.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDoctorPatientLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton DoctorLoginBtn;

  @NonNull
  public final TextInputLayout DoctorLoginPasswordEt;

  @NonNull
  public final TextInputLayout DoctorLoginPhoneEt;

  @NonNull
  public final ConstraintLayout SnackBarLinearLayout;

  @NonNull
  public final CircleImageView imgViewLoginIcon;

  @NonNull
  public final TextView roleLoginHeadingTxtView;

  @NonNull
  public final View topView;

  private ActivityDoctorPatientLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton DoctorLoginBtn, @NonNull TextInputLayout DoctorLoginPasswordEt,
      @NonNull TextInputLayout DoctorLoginPhoneEt, @NonNull ConstraintLayout SnackBarLinearLayout,
      @NonNull CircleImageView imgViewLoginIcon, @NonNull TextView roleLoginHeadingTxtView,
      @NonNull View topView) {
    this.rootView = rootView;
    this.DoctorLoginBtn = DoctorLoginBtn;
    this.DoctorLoginPasswordEt = DoctorLoginPasswordEt;
    this.DoctorLoginPhoneEt = DoctorLoginPhoneEt;
    this.SnackBarLinearLayout = SnackBarLinearLayout;
    this.imgViewLoginIcon = imgViewLoginIcon;
    this.roleLoginHeadingTxtView = roleLoginHeadingTxtView;
    this.topView = topView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorPatientLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorPatientLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor_patient_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorPatientLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DoctorLoginBtn;
      MaterialButton DoctorLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (DoctorLoginBtn == null) {
        break missingId;
      }

      id = R.id.DoctorLoginPasswordEt;
      TextInputLayout DoctorLoginPasswordEt = ViewBindings.findChildViewById(rootView, id);
      if (DoctorLoginPasswordEt == null) {
        break missingId;
      }

      id = R.id.DoctorLoginPhoneEt;
      TextInputLayout DoctorLoginPhoneEt = ViewBindings.findChildViewById(rootView, id);
      if (DoctorLoginPhoneEt == null) {
        break missingId;
      }

      ConstraintLayout SnackBarLinearLayout = (ConstraintLayout) rootView;

      id = R.id.imgViewLoginIcon;
      CircleImageView imgViewLoginIcon = ViewBindings.findChildViewById(rootView, id);
      if (imgViewLoginIcon == null) {
        break missingId;
      }

      id = R.id.roleLoginHeadingTxtView;
      TextView roleLoginHeadingTxtView = ViewBindings.findChildViewById(rootView, id);
      if (roleLoginHeadingTxtView == null) {
        break missingId;
      }

      id = R.id.topView;
      View topView = ViewBindings.findChildViewById(rootView, id);
      if (topView == null) {
        break missingId;
      }

      return new ActivityDoctorPatientLoginBinding((ConstraintLayout) rootView, DoctorLoginBtn,
          DoctorLoginPasswordEt, DoctorLoginPhoneEt, SnackBarLinearLayout, imgViewLoginIcon,
          roleLoginHeadingTxtView, topView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}