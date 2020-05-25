package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.k */
public final class C14082k {

    /* renamed from: a */
    private static final SparseIntArray f36804a = new SparseIntArray(0);

    /* renamed from: a */
    public static C14068ad m28814a() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        return new C14068ad(0, i, f36804a);
    }
}
