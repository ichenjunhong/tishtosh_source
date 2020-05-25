package com.google.android.gms.internal.ads;

public final class bsn {

    /* renamed from: a */
    public final brx f43779a;

    /* renamed from: b */
    public final bsk f43780b;

    /* renamed from: c */
    public final Object f43781c;

    /* renamed from: d */
    public final bmo[] f43782d;

    public bsn(brx brx, bsk bsk, Object obj, bmo[] bmoArr) {
        this.f43779a = brx;
        this.f43780b = bsk;
        this.f43781c = obj;
        this.f43782d = bmoArr;
    }

    /* renamed from: a */
    public final boolean mo30663a(bsn bsn, int i) {
        if (bsn != null && btw.m36762a((Object) this.f43780b.mo30659a(i), (Object) bsn.f43780b.mo30659a(i)) && btw.m36762a((Object) this.f43782d[i], (Object) bsn.f43782d[i])) {
            return true;
        }
        return false;
    }
}
