package com.p683ss.android.ugc.network.observer.bean;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.network.observer.bean.b */
public final class C50093b {

    /* renamed from: a */
    public final String f125467a;

    /* renamed from: b */
    public final int f125468b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C50093b) {
                C50093b bVar = (C50093b) obj;
                if (C52711k.m112239a((Object) this.f125467a, (Object) bVar.f125467a)) {
                    if (this.f125468b == bVar.f125468b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f125467a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f125468b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IPPort(ip=");
        sb.append(this.f125467a);
        sb.append(", port=");
        sb.append(this.f125468b);
        sb.append(")");
        return sb.toString();
    }

    public C50093b(String str, int i) {
        C52711k.m112240b(str, "ip");
        this.f125467a = str;
        this.f125468b = i;
    }
}
