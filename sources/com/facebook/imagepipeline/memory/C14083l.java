package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.l */
public final class C14083l {

    /* renamed from: a */
    public static final int f36805a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static SparseIntArray m28815a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i4 = 131072; i4 <= 4194304; i4 *= 2) {
            sparseIntArray.put(i4, i3);
        }
        return sparseIntArray;
    }
}
