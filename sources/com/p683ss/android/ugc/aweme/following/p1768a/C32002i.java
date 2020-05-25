package com.p683ss.android.ugc.aweme.following.p1768a;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.a.i */
public final class C32002i {

    /* renamed from: a */
    public final int f83558a;

    /* renamed from: b */
    public final boolean f83559b;

    /* renamed from: c */
    public final String f83560c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32002i) {
                C32002i iVar = (C32002i) obj;
                if (this.f83558a == iVar.f83558a) {
                    if (!(this.f83559b == iVar.f83559b) || !C52711k.m112239a((Object) this.f83560c, (Object) iVar.f83560c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f83558a) * 31;
        boolean z = this.f83559b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f83560c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationStatusItem(type=");
        sb.append(this.f83558a);
        sb.append(", isMySelf=");
        sb.append(this.f83559b);
        sb.append(", des=");
        sb.append(this.f83560c);
        sb.append(")");
        return sb.toString();
    }

    public C32002i(int i, boolean z, String str) {
        C52711k.m112240b(str, "des");
        this.f83558a = i;
        this.f83559b = z;
        this.f83560c = str;
    }

    public /* synthetic */ C32002i(int i, boolean z, String str, int i2, C52707g gVar) {
        this(i, z, "");
    }
}
