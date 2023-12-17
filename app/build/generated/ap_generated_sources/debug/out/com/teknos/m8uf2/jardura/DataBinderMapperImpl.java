package com.teknos.m8uf2.jardura;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.teknos.m8uf2.jardura.databinding.ActivityAddNewMedicineBindingImpl;
import com.teknos.m8uf2.jardura.databinding.ActivityMedsListBindingImpl;
import com.teknos.m8uf2.jardura.databinding.MedicamentItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDNEWMEDICINE = 1;

  private static final int LAYOUT_ACTIVITYMEDSLIST = 2;

  private static final int LAYOUT_MEDICAMENTITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.teknos.m8uf2.jardura.R.layout.activity_add_new_medicine, LAYOUT_ACTIVITYADDNEWMEDICINE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.teknos.m8uf2.jardura.R.layout.activity_meds_list, LAYOUT_ACTIVITYMEDSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.teknos.m8uf2.jardura.R.layout.medicament_item, LAYOUT_MEDICAMENTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYADDNEWMEDICINE: {
          if ("layout/activity_add_new_medicine_0".equals(tag)) {
            return new ActivityAddNewMedicineBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_add_new_medicine is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMEDSLIST: {
          if ("layout/activity_meds_list_0".equals(tag)) {
            return new ActivityMedsListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_meds_list is invalid. Received: " + tag);
        }
        case  LAYOUT_MEDICAMENTITEM: {
          if ("layout/medicament_item_0".equals(tag)) {
            return new MedicamentItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for medicament_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickHandler");
      sKeys.put(2, "medicament");
      sKeys.put(3, "medicina");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_add_new_medicine_0", com.teknos.m8uf2.jardura.R.layout.activity_add_new_medicine);
      sKeys.put("layout/activity_meds_list_0", com.teknos.m8uf2.jardura.R.layout.activity_meds_list);
      sKeys.put("layout/medicament_item_0", com.teknos.m8uf2.jardura.R.layout.medicament_item);
    }
  }
}
