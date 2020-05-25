package com.google.firebase.components;

import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.firebase.components.e */
public final class C17869e {

    /* renamed from: a */
    public final Class<?> f49661a;

    /* renamed from: b */
    final int f49662b = 1;

    /* renamed from: c */
    private final int f49663c = 0;

    /* renamed from: a */
    public final boolean mo34701a() {
        if (this.f49663c == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49661a.hashCode() ^ 1000003) * 1000003) ^ this.f49662b) * 1000003) ^ this.f49663c;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f49661a);
        sb.append(", required=");
        boolean z2 = false;
        if (this.f49662b == 1) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", direct=");
        if (this.f49663c == 0) {
            z2 = true;
        }
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static C17869e m43817a(Class<?> cls) {
        return new C17869e(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17869e)) {
            return false;
        }
        C17869e eVar = (C17869e) obj;
        if (this.f49661a == eVar.f49661a && this.f49662b == eVar.f49662b && this.f49663c == eVar.f49663c) {
            return true;
        }
        return false;
    }

    private C17869e(Class<?> cls, int i, int i2) {
        this.f49661a = (Class) C15464q.m32124a(cls, (Object) "Null dependency anInterface.");
    }
}
