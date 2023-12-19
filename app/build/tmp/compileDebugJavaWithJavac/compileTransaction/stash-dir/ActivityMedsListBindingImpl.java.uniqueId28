package com.teknos.m8uf2.jardura.databinding;
import com.teknos.m8uf2.jardura.R;
import com.teknos.m8uf2.jardura.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMedsListBindingImpl extends ActivityMedsListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.meds_recyclerview, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mClickHandlerOnFABClickedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityMedsListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityMedsListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.addBtn.setTag(null);
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
        if (BR.clickHandler == variableId) {
            setClickHandler((com.teknos.m8uf2.jardura.handlers.MedsListClickHandlers) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickHandler(@Nullable com.teknos.m8uf2.jardura.handlers.MedsListClickHandlers ClickHandler) {
        this.mClickHandler = ClickHandler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickHandler);
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
        android.view.View.OnClickListener clickHandlerOnFABClickedAndroidViewViewOnClickListener = null;
        com.teknos.m8uf2.jardura.handlers.MedsListClickHandlers clickHandler = mClickHandler;

        if ((dirtyFlags & 0x3L) != 0) {



                if (clickHandler != null) {
                    // read clickHandler::onFABClicked
                    clickHandlerOnFABClickedAndroidViewViewOnClickListener = (((mClickHandlerOnFABClickedAndroidViewViewOnClickListener == null) ? (mClickHandlerOnFABClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClickHandlerOnFABClickedAndroidViewViewOnClickListener).setValue(clickHandler));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.addBtn.setOnClickListener(clickHandlerOnFABClickedAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.teknos.m8uf2.jardura.handlers.MedsListClickHandlers value;
        public OnClickListenerImpl setValue(com.teknos.m8uf2.jardura.handlers.MedsListClickHandlers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onFABClicked(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickHandler
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}