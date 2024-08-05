// Generated by view binder compiler. Do not edit!
package com.example.easygo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.easygo.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityDemoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout main;

  private ActivityDemoBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout main) {
    this.rootView = rootView;
    this.main = main;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDemoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDemoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_demo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDemoBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ConstraintLayout main = (ConstraintLayout) rootView;

    return new ActivityDemoBinding((ConstraintLayout) rootView, main);
  }
}
