package com.p683ss.android.ugc.aweme.discover.api.p1638a;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.api.a.a */
public final class C28064a<T> {

    /* renamed from: a */
    public boolean f73735a;

    /* renamed from: b */
    public T f73736b;

    /* renamed from: c */
    public Exception f73737c;

    public C28064a(Exception exc) {
        C52711k.m112240b(exc, "e");
        this.f73737c = exc;
        this.f73735a = false;
    }

    public C28064a(T t) {
        this.f73735a = true;
        this.f73736b = t;
    }

    public C28064a(boolean z, T t) {
        this.f73735a = z;
        this.f73736b = t;
    }
}
