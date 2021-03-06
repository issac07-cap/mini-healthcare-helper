// Generated by view binder compiler. Do not edit!
package com.healthcare.helper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.healthcare.helper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPatientLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton PatientLoginBtn;

  @NonNull
  public final TextInputLayout PatientLoginPasswordEt;

  @NonNull
  public final TextInputLayout PatientLoginPhoneEt;

  @NonNull
  public final ConstraintLayout SnackBarLinearLayout;

  private FragmentPatientLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton PatientLoginBtn, @NonNull TextInputLayout PatientLoginPasswordEt,
      @NonNull TextInputLayout PatientLoginPhoneEt,
      @NonNull ConstraintLayout SnackBarLinearLayout) {
    this.rootView = rootView;
    this.PatientLoginBtn = PatientLoginBtn;
    this.PatientLoginPasswordEt = PatientLoginPasswordEt;
    this.PatientLoginPhoneEt = PatientLoginPhoneEt;
    this.SnackBarLinearLayout = SnackBarLinearLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPatientLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPatientLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_patient_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPatientLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.PatientLoginBtn;
      MaterialButton PatientLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (PatientLoginBtn == null) {
        break missingId;
      }

      id = R.id.PatientLoginPasswordEt;
      TextInputLayout PatientLoginPasswordEt = ViewBindings.findChildViewById(rootView, id);
      if (PatientLoginPasswordEt == null) {
        break missingId;
      }

      id = R.id.PatientLoginPhoneEt;
      TextInputLayout PatientLoginPhoneEt = ViewBindings.findChildViewById(rootView, id);
      if (PatientLoginPhoneEt == null) {
        break missingId;
      }

      ConstraintLayout SnackBarLinearLayout = (ConstraintLayout) rootView;

      return new FragmentPatientLoginBinding((ConstraintLayout) rootView, PatientLoginBtn,
          PatientLoginPasswordEt, PatientLoginPhoneEt, SnackBarLinearLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
