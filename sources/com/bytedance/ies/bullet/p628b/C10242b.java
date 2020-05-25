package com.bytedance.ies.bullet.p628b;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.bytedance.ies.bullet.b.b */
public final class C10242b {

    /* renamed from: a */
    public final boolean f27634a;

    /* renamed from: b */
    public final boolean f27635b;

    /* renamed from: c */
    public final boolean f27636c;

    public C10242b() {
        this(false, false, false, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10242b) {
                C10242b bVar = (C10242b) obj;
                if (this.f27634a == bVar.f27634a) {
                    if (this.f27635b == bVar.f27635b) {
                        if (this.f27636c == bVar.f27636c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f27634a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.f27635b;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f27636c;
        if (!z3) {
            i = z3;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Experiments(useSourceUrlLast=");
        sb.append(this.f27634a);
        sb.append(", convertToMapWhenUsingParamsBundle=");
        sb.append(this.f27635b);
        sb.append(", lazyLoadKits=");
        sb.append(this.f27636c);
        sb.append(")");
        return sb.toString();
    }

    public C10242b(boolean z, boolean z2, boolean z3) {
        this.f27634a = z;
        this.f27635b = z2;
        this.f27636c = z3;
    }

    public /* synthetic */ C10242b(boolean z, boolean z2, boolean z3, int i, C52707g gVar) {
        this(false, false, false);
    }
}
