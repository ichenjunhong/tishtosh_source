package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.p920d.C13689i;

/* renamed from: com.facebook.imagepipeline.memory.ad */
public final class C14068ad {

    /* renamed from: a */
    public final int f36772a;

    /* renamed from: b */
    public final int f36773b;

    /* renamed from: c */
    public final SparseIntArray f36774c;

    /* renamed from: d */
    public final int f36775d;

    /* renamed from: e */
    public final int f36776e;

    /* renamed from: f */
    public boolean f36777f;

    /* renamed from: g */
    public final int f36778g;

    public C14068ad(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public C14068ad(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        boolean z;
        if (i < 0 || i2 < i) {
            z = false;
        } else {
            z = true;
        }
        C13689i.m27657b(z);
        this.f36773b = i;
        this.f36772a = i2;
        this.f36774c = sparseIntArray;
        this.f36775d = i3;
        this.f36776e = i4;
        this.f36778g = i5;
    }
}
