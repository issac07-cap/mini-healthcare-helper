// Generated by view binder compiler. Do not edit!
package com.healthcare.helper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.healthcare.helper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterRoleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AutoCompleteTextView AutoCompleteDegreeDropDown;

  @NonNull
  public final MaterialButton DoctorDegreeExpiryDateBtn;

  @NonNull
  public final MaterialButton RoleSignUpBtn;

  @NonNull
  public final TextInputEditText RoleSignUpPasswordEt;

  @NonNull
  public final TextInputEditText RoleSignUpPhoneEt;

  @NonNull
  public final TextInputEditText RoleSignUpUsernameEt;

  @NonNull
  public final LinearLayout linearLayout1;

  @NonNull
  public final TextView roleHeadingTxtView;

  private ActivityRegisterRoleBinding(@NonNull LinearLayout rootView,
      @NonNull AutoCompleteTextView AutoCompleteDegreeDropDown,
      @NonNull MaterialButton DoctorDegreeExpiryDateBtn, @NonNull MaterialButton RoleSignUpBtn,
      @NonNull TextInputEditText RoleSignUpPasswordEt, @NonNull TextInputEditText RoleSignUpPhoneEt,
      @NonNull TextInputEditText RoleSignUpUsernameEt, @NonNull LinearLayout linearLayout1,
      @NonNull TextView roleHeadingTxtView) {
    this.rootView = rootView;
    this.AutoCompleteDegreeDropDown = AutoCompleteDegreeDropDown;
    this.DoctorDegreeExpiryDateBtn = DoctorDegreeExpiryDateBtn;
    this.RoleSignUpBtn = RoleSignUpBtn;
    this.RoleSignUpPasswordEt = RoleSignUpPasswordEt;
    this.RoleSignUpPhoneEt = RoleSignUpPhoneEt;
    this.RoleSignUpUsernameEt = RoleSignUpUsernameEt;
    this.linearLayout1 = linearLayout1;
    this.roleHeadingTxtView = roleHeadingTxtView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterRoleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterRoleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register_role, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterRoleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AutoCompleteDegreeDropDown;
      AutoCompleteTextView AutoCompleteDegreeDropDown = ViewBindings.findChildViewById(rootView, id);
      if (AutoCompleteDegreeDropDown == null) {
        break missingId;
      }

      id = R.id.DoctorDegreeExpiryDateBtn;
      MaterialButton DoctorDegreeExpiryDateBtn = ViewBindings.findChildViewById(rootView, id);
      if (DoctorDegreeExpiryDateBtn == null) {
        break missingId;
      }

      id = R.id.RoleSignUpBtn;
      MaterialButton RoleSignUpBtn = ViewBindings.findChildViewById(rootView, id);
      if (RoleSignUpBtn == null) {
        break missingId;
      }

      id = R.id.RoleSignUpPasswordEt;
      TextInputEditText RoleSignUpPasswordEt = ViewBindings.findChildViewById(rootView, id);
      if (RoleSignUpPasswordEt == null) {
        break missingId;
      }

      id = R.id.RoleSignUpPhoneEt;
      TextInputEditText RoleSignUpPhoneEt = ViewBindings.findChildViewById(rootView, id);
      if (RoleSignUpPhoneEt == null) {
        break missingId;
      }

      id = R.id.RoleSignUpUsernameEt;
      TextInputEditText RoleSignUpUsernameEt = ViewBindings.findChildViewById(rootView, id);
      if (RoleSignUpUsernameEt == null) {
        break missingId;
      }

      LinearLayout linearLayout1 = (LinearLayout) rootView;

      id = R.id.roleHeadingTxtView;
      TextView roleHeadingTxtView = ViewBindings.findChildViewById(rootView, id);
      if (roleHeadingTxtView == null) {
        break missingId;
      }

      return new ActivityRegisterRoleBinding((LinearLayout) rootView, AutoCompleteDegreeDropDown,
          DoctorDegreeExpiryDateBtn, RoleSignUpBtn, RoleSignUpPasswordEt, RoleSignUpPhoneEt,
          RoleSignUpUsernameEt, linearLayout1, roleHeadingTxtView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
