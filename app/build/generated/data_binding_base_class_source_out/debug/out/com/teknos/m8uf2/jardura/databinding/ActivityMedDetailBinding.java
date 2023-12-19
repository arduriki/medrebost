// Generated by data binding compiler. Do not edit!
package com.teknos.m8uf2.jardura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.entitats.Medicaments;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMedDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView detailFabricantTv;

  @NonNull
  public final TextView detailNameTv;

  @NonNull
  public final Button editBtn;

  @NonNull
  public final FloatingActionButton scanBtn;

  @Bindable
  protected Medicaments mMedicina;

  protected ActivityMedDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView detailFabricantTv, TextView detailNameTv, Button editBtn,
      FloatingActionButton scanBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.detailFabricantTv = detailFabricantTv;
    this.detailNameTv = detailNameTv;
    this.editBtn = editBtn;
    this.scanBtn = scanBtn;
  }

  public abstract void setMedicina(@Nullable Medicaments medicina);

  @Nullable
  public Medicaments getMedicina() {
    return mMedicina;
  }

  @NonNull
  public static ActivityMedDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_med_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMedDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMedDetailBinding>inflateInternal(inflater, R.layout.activity_med_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMedDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_med_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMedDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMedDetailBinding>inflateInternal(inflater, R.layout.activity_med_detail, null, false, component);
  }

  public static ActivityMedDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMedDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMedDetailBinding)bind(component, view, R.layout.activity_med_detail);
  }
}
