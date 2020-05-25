package com.bytedance.scene.p842d;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: com.bytedance.scene.d.b */
public final class C12884b extends C12885c {
    public C12884b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }
}
