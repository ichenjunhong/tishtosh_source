package com.p683ss.android.ugc.vcd;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.vcd.k */
public final class C50512k {

    /* renamed from: a */
    public final boolean f126623a;

    /* renamed from: b */
    public final boolean f126624b;

    /* renamed from: c */
    public final int f126625c;

    /* renamed from: d */
    public final String f126626d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C50512k) {
                C50512k kVar = (C50512k) obj;
                if (this.f126623a == kVar.f126623a) {
                    if (this.f126624b == kVar.f126624b) {
                        if (!(this.f126625c == kVar.f126625c) || !C52711k.m112239a((Object) this.f126626d, (Object) kVar.f126626d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f126623a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.f126624b;
        if (!z2) {
            i = z2;
        }
        int i3 = (((i2 + i) * 31) + this.f126625c) * 31;
        String str = this.f126626d;
        return i3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VcdGuideResult(success=");
        sb.append(this.f126623a);
        sb.append(", cancelled=");
        sb.append(this.f126624b);
        sb.append(", errorCode=");
        sb.append(this.f126625c);
        sb.append(", errorMessage=");
        sb.append(this.f126626d);
        sb.append(")");
        return sb.toString();
    }
}
