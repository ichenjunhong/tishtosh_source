package com.google.android.gms.internal.ads;

final class bqb {

    /* renamed from: a */
    public final int f43526a;

    /* renamed from: b */
    public final long[] f43527b;

    /* renamed from: c */
    public final int[] f43528c;

    /* renamed from: d */
    public final int f43529d;

    /* renamed from: e */
    public final long[] f43530e;

    /* renamed from: f */
    public final int[] f43531f;

    public bqb(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = false;
        bti.m36699a(iArr.length == jArr2.length);
        bti.m36699a(jArr.length == jArr2.length);
        if (iArr2.length == jArr2.length) {
            z = true;
        }
        bti.m36699a(z);
        this.f43527b = jArr;
        this.f43528c = iArr;
        this.f43529d = i;
        this.f43530e = jArr2;
        this.f43531f = iArr2;
        this.f43526a = jArr.length;
    }

    /* renamed from: a */
    public final int mo30546a(long j) {
        for (int a = btw.m36757a(this.f43530e, j, true, false); a >= 0; a--) {
            if ((this.f43531f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo30547b(long j) {
        for (int b = btw.m36766b(this.f43530e, j, true, false); b < this.f43530e.length; b++) {
            if ((this.f43531f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
