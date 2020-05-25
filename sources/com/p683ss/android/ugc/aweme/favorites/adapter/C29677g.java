package com.p683ss.android.ugc.aweme.favorites.adapter;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.g */
public final class C29677g {

    /* renamed from: a */
    public final int f77570a;

    /* renamed from: b */
    public final Object f77571b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29677g) {
                C29677g gVar = (C29677g) obj;
                if (!(this.f77570a == gVar.f77570a) || !C52711k.m112239a(this.f77571b, gVar.f77571b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f77570a * 31;
        Object obj = this.f77571b;
        return i + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypePoiStruct(type=");
        sb.append(this.f77570a);
        sb.append(", data=");
        sb.append(this.f77571b);
        sb.append(")");
        return sb.toString();
    }

    public C29677g(int i, Object obj) {
        this.f77570a = i;
        this.f77571b = obj;
    }
}
