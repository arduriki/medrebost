package com.teknos.m8uf2.jardura.databinding;
import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddNewMedicineBindingImpl extends ActivityAddNewMedicineBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.medImageView, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mClickHandlerOnSubmitBtnClickedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener addFabricantEtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of medicina.fabricantMedicament
            //         is medicina.setFabricantMedicament((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addFabricantEt);
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
    private androidx.databinding.InverseBindingListener addNameEtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of medicina.nomMedicament
            //         is medicina.setNomMedicament((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addNameEt);
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

    public ActivityAddNewMedicineBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityAddNewMedicineBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.Button) bindings[3]
            );
        this.addFabricantEt.setTag(null);
        this.addNameEt.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.submit.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.clickHandler == variableId) {
            setClickHandler((com.teknos.m8uf2.jardura.handlers.AddMedsClickHandler) variable);
        }
        else if (BR.medicina == variableId) {
            setMedicina((com.teknos.m8uf2.jardura.entitats.Medicaments) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickHandler(@Nullable com.teknos.m8uf2.jardura.handlers.AddMedsClickHandler ClickHandler) {
        this.mClickHandler = ClickHandler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickHandler);
        super.requestRebind();
    }
    public void setMedicina(@Nullable com.teknos.m8uf2.jardura.entitats.Medicaments Medicina) {
        this.mMedicina = Medicina;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        android.view.View.OnClickListener clickHandlerOnSubmitBtnClickedAndroidViewViewOnClickListener = null;
        com.teknos.m8uf2.jardura.handlers.AddMedsClickHandler clickHandler = mClickHandler;
        com.teknos.m8uf2.jardura.entitats.Medicaments medicina = mMedicina;
        java.lang.String medicinaFabricantMedicament = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (clickHandler != null) {
                    // read clickHandler::onSubmitBtnClicked
                    clickHandlerOnSubmitBtnClickedAndroidViewViewOnClickListener = (((mClickHandlerOnSubmitBtnClickedAndroidViewViewOnClickListener == null) ? (mClickHandlerOnSubmitBtnClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClickHandlerOnSubmitBtnClickedAndroidViewViewOnClickListener).setValue(clickHandler));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (medicina != null) {
                    // read medicina.nomMedicament
                    medicinaNomMedicament = medicina.getNomMedicament();
                    // read medicina.fabricantMedicament
                    medicinaFabricantMedicament = medicina.getFabricantMedicament();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addFabricantEt, medicinaFabricantMedicament);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addNameEt, medicinaNomMedicament);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addFabricantEt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addFabricantEtandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addNameEt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addNameEtandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.submit.setOnClickListener(clickHandlerOnSubmitBtnClickedAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.teknos.m8uf2.jardura.handlers.AddMedsClickHandler value;
        public OnClickListenerImpl setValue(com.teknos.m8uf2.jardura.handlers.AddMedsClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onSubmitBtnClicked(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickHandler
        flag 1 (0x2L): medicina
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}