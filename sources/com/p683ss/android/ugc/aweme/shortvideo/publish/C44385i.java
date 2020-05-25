package com.p683ss.android.ugc.aweme.shortvideo.publish;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.i */
public final class C44385i {

    /* renamed from: a */
    public final String f112307a;

    /* renamed from: b */
    public final String f112308b;

    /* renamed from: c */
    public final boolean f112309c;

    /* renamed from: d */
    public final Throwable f112310d;

    /* renamed from: e */
    public final Object f112311e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("errorCode:");
        sb.append(this.f112307a);
        sb.append(" stage:");
        sb.append(this.f112308b);
        return sb.toString();
    }

    public C44385i(String str, String str2, boolean z, Throwable th, Object obj) {
        C52711k.m112240b(str, "errorCode");
        C52711k.m112240b(str2, "stage");
        this.f112307a = str;
        this.f112308b = str2;
        this.f112309c = z;
        this.f112310d = th;
        this.f112311e = obj;
    }
}
