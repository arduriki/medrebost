// Generated by data binding compiler. Do not edit!
package com.teknos.m8uf2.jardura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.entitats.Medicaments;
import com.teknos.m8uf2.jardura.handlers.AddMedsClickHandler;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAddNewMedicineBinding extends ViewDataBinding {
  @NonNull
  public final EditText addFabricantEt;

  @NonNull
  public final EditText addNameEt;

  @NonNull
  public final FloatingActionButton scanBtn;

  @NonNull
  public final Button submit;

  @Bindable
  protected Medicaments mMedicina;

  @Bindable
  protected AddMedsClickHandler mClickHandler;

  protected ActivityAddNewMedicineBinding(Object _bindingComponent, View _root,
      int _localFieldCount, EditText addFabricantEt, EditText addNameEt,
      FloatingActionButton scanBtn, Button submit) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addFabricantEt = addFabricantEt;
    this.addNameEt = addNameEt;
    this.scanBtn = scanBtn;
    this.submit = submit;
  }

  public abstract void setMedicina(@Nullable Medicaments medicina);

  @Nullable
  public Medicaments getMedicina() {
    return mMedicina;
  }

  public abstract void setClickHandler(@Nullable AddMedsClickHandler clickHandler);

  @Nullable
  public AddMedsClickHandler getClickHandler() {
    return mClickHandler;
  }

  @NonNull
  public static ActivityAddNewMedicineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_add_new_medicine, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddNewMedicineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAddNewMedicineBinding>inflateInternal(inflater, R.layout.activity_add_new_medicine, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAddNewMedicineBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_add_new_medicine, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddNewMedicineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAddNewMedicineBinding>inflateInternal(inflater, R.layout.activity_add_new_medicine, null, false, component);
  }

  public static ActivityAddNewMedicineBinding bind(@NonNull View view) {
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
  public static ActivityAddNewMedicineBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAddNewMedicineBinding)bind(component, view, R.layout.activity_add_new_medicine);
  }
}