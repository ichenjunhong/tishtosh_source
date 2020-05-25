package com.google.android.gms.internal.ads;

final class bjv {

    /* renamed from: a */
    public final int f42711a;

    /* renamed from: b */
    public final long[] f42712b;

    /* renamed from: c */
    public final int[] f42713c;

    /* renamed from: d */
    public final long[] f42714d;

    /* renamed from: e */
    public final int[] f42715e;

    bjv(long[] jArr, int[] iArr, long[] jArr2, int[] iArr2) {
        boolean z = false;
        blg.m35999a(iArr.length == jArr2.length);
        blg.m35999a(jArr.length == jArr2.length);
        if (iArr2.length == jArr2.length) {
            z = true;
        }
        blg.m35999a(z);
        this.f42712b = jArr;
        this.f42713c = iArr;
        this.f42714d = jArr2;
        this.f42715e = iArr2;
        this.f42711a = jArr.length;
    }
}
