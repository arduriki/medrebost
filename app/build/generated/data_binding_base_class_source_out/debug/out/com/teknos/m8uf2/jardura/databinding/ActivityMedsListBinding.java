// Generated by data binding compiler. Do not edit!
package com.teknos.m8uf2.jardura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.handlers.MedsListClickHandlers;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMedsListBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton addBtn;

  @NonNull
  public final RecyclerView medsRecyclerview;

  @Bindable
  protected MedsListClickHandlers mClickHandler;

  protected ActivityMedsListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton addBtn, RecyclerView medsRecyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addBtn = addBtn;
    this.medsRecyclerview = medsRecyclerview;
  }

  public abstract void setClickHandler(@Nullable MedsListClickHandlers clickHandler);

  @Nullable
  public MedsListClickHandlers getClickHandler() {
    return mClickHandler;
  }

  @NonNull
  public static ActivityMedsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_meds_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMedsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMedsListBinding>inflateInternal(inflater, R.layout.activity_meds_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMedsListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_meds_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMedsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMedsListBinding>inflateInternal(inflater, R.layout.activity_meds_list, null, false, component);
  }

  public static ActivityMedsListBinding bind(@NonNull View view) {
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
  public static ActivityMedsListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMedsListBinding)bind(component, view, R.layout.activity_meds_list);
  }
}