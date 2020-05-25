package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15215d;
import com.google.android.gms.common.internal.C15462p;

/* renamed from: com.google.android.gms.common.api.internal.cf */
public final class C15306cf<O extends C15215d> {

    /* renamed from: a */
    private final boolean f39489a;

    /* renamed from: b */
    private final int f39490b;

    /* renamed from: c */
    private final C15211a<O> f39491c;

    /* renamed from: d */
    private final O f39492d;

    private C15306cf(C15211a<O> aVar, O o) {
        this.f39491c = aVar;
        this.f39492d = o;
        this.f39490b = C15462p.m32118a(this.f39491c, this.f39492d);
    }

    public C15306cf(C15211a<O> aVar) {
        this.f39489a = true;
        this.f39491c = aVar;
        this.f39490b = System.identityHashCode(this);
    }

    /* renamed from: a */
    public static <O extends C15215d> C15306cf<O> m31735a(C15211a<O> aVar, O o) {
        return new C15306cf<>(aVar, o);
    }

    /* renamed from: a */
    public final String mo28232a() {
        return this.f39491c.f39277b;
    }

    public final int hashCode() {
        return this.f39490b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15306cf)) {
            return false;
        }
        C15306cf cfVar = (C15306cf) obj;
        return !this.f39489a && !cfVar.f39489a && C15462p.m32120a(this.f39491c, cfVar.f39491c) && C15462p.m32120a(this.f39492d, cfVar.f39492d);
    }
}
