package com.teknos.m8uf2.jardura.databinding;
import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditMedBindingImpl extends ActivityEditMedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.saveBtn, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editFabricantEtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of medicina.fabricantMedicament
            //         is medicina.setFabricantMedicament((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editFabricantEt);
            // localize variables for thread safety
            // medicina != null
            boolean medicinaJavaLangObjectNull = false;
            // medicina
            com.teknos.m8uf2.jardura.entitats.Medicaments medicina = mMedicina;
            // medicina.fabricantMedicament
            java.lang.String medicinaFabricantMedicament = null;



            medicinaJavaLangObjectNull = (medicina) != (null);
            if (medicinaJavaLangObjectNull) {




                medicina.setFabricantMedicament(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener editNameEtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of medicina.nomMedicament
            //         is medicina.setNomMedicament((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editNameEt);
            // localize variables for thread safety
            // medicina.nomMedicament
            java.lang.String medicinaNomMedicament = null;
            // medicina != null
            boolean medicinaJavaLangObjectNull = false;
            // medicina
            com.teknos.m8uf2.jardura.entitats.Medicaments medicina = mMedicina;



            medicinaJavaLangObjectNull = (medicina) != (null);
            if (medicinaJavaLangObjectNull) {




                medicina.setNomMedicament(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityEditMedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityEditMedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.Button) bindings[3]
            );
        this.editFabricantEt.setTag(null);
        this.editNameEt.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.medicina == variableId) {
            setMedicina((com.teknos.m8uf2.jardura.entitats.Medicaments) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMedicina(@Nullable com.teknos.m8uf2.jardura.entitats.Medicaments Medicina) {
        this.mMedicina = Medicina;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.medicina);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String medicinaNomMedicament = null;
        com.teknos.m8uf2.jardura.entitats.Medicaments medicina = mMedicina;
        java.lang.String medicinaFabricantMedicament = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (medicina != null) {
                    // read medicina.nomMedicament
                    medicinaNomMedicament = medicina.getNomMedicament();
                    // read medicina.fabricantMedicament
                    medicinaFabricantMedicament = medicina.getFabricantMedicament();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editFabricantEt, medicinaFabricantMedicament);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editNameEt, medicinaNomMedicament);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editFabricantEt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editFabricantEtandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editNameEt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editNameEtandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): medicina
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}