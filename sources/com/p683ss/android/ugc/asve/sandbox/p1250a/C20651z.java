package com.p683ss.android.ugc.asve.sandbox.p1250a;

import android.util.SparseArray;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20709q.C20710a;
import com.p683ss.android.vesdk.C50601ah.C50621i;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.z */
public final class C20651z extends C20710a {

    /* renamed from: a */
    private final WeakReference<C50621i> f56503a;

    public C20651z(C50621i iVar) {
        C52711k.m112240b(iVar, "listener");
        this.f56503a = new WeakReference<>(iVar);
    }

    /* renamed from: a */
    public final void mo43785a(int[] iArr, long[] jArr, float f) {
        C52711k.m112240b(iArr, "var1");
        C52711k.m112240b(jArr, "var2");
        SparseArray sparseArray = new SparseArray();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sparseArray.put(iArr[i], Long.valueOf(jArr[i]));
        }
        C50621i iVar = (C50621i) this.f56503a.get();
        if (iVar != null) {
            iVar.mo43758a(sparseArray, f);
        }
    }
}
