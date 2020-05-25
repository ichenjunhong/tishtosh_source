package com.airbnb.lottie.p108c;

import android.support.p030v4.p038f.C0794k;

/* renamed from: com.airbnb.lottie.c.h */
public final class C2401h<T> {

    /* renamed from: a */
    public T f7506a;

    /* renamed from: b */
    public T f7507b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f7506a == null) {
            i = 0;
        } else {
            i = this.f7506a.hashCode();
        }
        if (this.f7507b != null) {
            i2 = this.f7507b.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.f7506a));
        sb.append(" ");
        sb.append(String.valueOf(this.f7507b));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0794k)) {
            return false;
        }
        C0794k kVar = (C0794k) obj;
        if (!m7057a(kVar.f2711a, this.f7506a) || !m7057a(kVar.f2712b, this.f7507b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m7057a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
