// Generated by view binder compiler. Do not edit!
package com.example.easygo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.easygo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView facebook;

  @NonNull
  public final TextView forgetTextview;

  @NonNull
  public final ImageView google;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final ImageView logoImage;

  @NonNull
  public final EditText passwordEdittext;

  @NonNull
  public final TextView passwordTextview;

  @NonNull
  public final TextView signupTextview;

  @NonNull
  public final TextView signuporTextview;

  @NonNull
  public final ImageView twitter;

  @NonNull
  public final EditText userEdittext;

  @NonNull
  public final TextView userTextview;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView facebook,
      @NonNull TextView forgetTextview, @NonNull ImageView google, @NonNull Button loginButton,
      @NonNull ImageView logoImage, @NonNull EditText passwordEdittext,
      @NonNull TextView passwordTextview, @NonNull TextView signupTextview,
      @NonNull TextView signuporTextview, @NonNull ImageView twitter,
      @NonNull EditText userEdittext, @NonNull TextView userTextview) {
    this.rootView = rootView;
    this.facebook = facebook;
    this.forgetTextview = forgetTextview;
    this.google = google;
    this.loginButton = loginButton;
    this.logoImage = logoImage;
    this.passwordEdittext = passwordEdittext;
    this.passwordTextview = passwordTextview;
    this.signupTextview = signupTextview;
    this.signuporTextview = signuporTextview;
    this.twitter = twitter;
    this.userEdittext = userEdittext;
    this.userTextview = userTextview;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.facebook;
      ImageView facebook = ViewBindings.findChildViewById(rootView, id);
      if (facebook == null) {
        break missingId;
      }

      id = R.id.forget_textview;
      TextView forgetTextview = ViewBindings.findChildViewById(rootView, id);
      if (forgetTextview == null) {
        break missingId;
      }

      id = R.id.google;
      ImageView google = ViewBindings.findChildViewById(rootView, id);
      if (google == null) {
        break missingId;
      }

      id = R.id.login_button;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.logo_image;
      ImageView logoImage = ViewBindings.findChildViewById(rootView, id);
      if (logoImage == null) {
        break missingId;
      }

      id = R.id.password_edittext;
      EditText passwordEdittext = ViewBindings.findChildViewById(rootView, id);
      if (passwordEdittext == null) {
        break missingId;
      }

      id = R.id.password_textview;
      TextView passwordTextview = ViewBindings.findChildViewById(rootView, id);
      if (passwordTextview == null) {
        break missingId;
      }

      id = R.id.signup_textview;
      TextView signupTextview = ViewBindings.findChildViewById(rootView, id);
      if (signupTextview == null) {
        break missingId;
      }

      id = R.id.signupor_textview;
      TextView signuporTextview = ViewBindings.findChildViewById(rootView, id);
      if (signuporTextview == null) {
        break missingId;
      }

      id = R.id.twitter;
      ImageView twitter = ViewBindings.findChildViewById(rootView, id);
      if (twitter == null) {
        break missingId;
      }

      id = R.id.user_edittext;
      EditText userEdittext = ViewBindings.findChildViewById(rootView, id);
      if (userEdittext == null) {
        break missingId;
      }

      id = R.id.user_textview;
      TextView userTextview = ViewBindings.findChildViewById(rootView, id);
      if (userTextview == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, facebook, forgetTextview, google,
          loginButton, logoImage, passwordEdittext, passwordTextview, signupTextview,
          signuporTextview, twitter, userEdittext, userTextview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
