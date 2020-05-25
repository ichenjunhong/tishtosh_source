package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.k */
public final class C2475k<V> {

    /* renamed from: a */
    public final V f7660a;

    /* renamed from: b */
    public final Throwable f7661b;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7660a, this.f7661b});
    }

    public C2475k(V v) {
        this.f7660a = v;
    }

    public C2475k(Throwable th) {
        this.f7661b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2475k)) {
            return false;
        }
        C2475k kVar = (C2475k) obj;
        if (this.f7660a != null && this.f7660a.equals(kVar.f7660a)) {
            return true;
        }
        if (this.f7661b == null || kVar.f7661b == null) {
            return false;
        }
        return this.f7661b.toString().equals(this.f7661b.toString());
    }
}
