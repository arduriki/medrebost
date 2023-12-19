package com.teknos.m8uf2.jardura.databinding;
import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MedicamentItemBindingImpl extends MedicamentItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MedicamentItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private MedicamentItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvFabricant.setTag(null);
        this.tvNom.setTag(null);
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
        if (BR.medicament == variableId) {
            setMedicament((com.teknos.m8uf2.jardura.entitats.Medicaments) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMedicament(@Nullable com.teknos.m8uf2.jardura.entitats.Medicaments Medicament) {
        this.mMedicament = Medicament;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.medicament);
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
        com.teknos.m8uf2.jardura.entitats.Medicaments medicament = mMedicament;
        java.lang.String medicamentFabricantMedicament = null;
        java.lang.String medicamentNomMedicament = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (medicament != null) {
                    // read medicament.fabricantMedicament
                    medicamentFabricantMedicament = medicament.getFabricantMedicament();
                    // read medicament.nomMedicament
                    medicamentNomMedicament = medicament.getNomMedicament();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFabricant, medicamentFabricantMedicament);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNom, medicamentNomMedicament);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): medicament
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}