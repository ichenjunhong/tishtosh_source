package com.p683ss.android.ugc.aweme.discover.mob;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.aa */
public final class C28380aa {

    /* renamed from: a */
    public String f74509a;

    /* renamed from: b */
    public boolean f74510b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28380aa) {
                C28380aa aaVar = (C28380aa) obj;
                if (C52711k.m112239a((Object) this.f74509a, (Object) aaVar.f74509a)) {
                    if (this.f74510b == aaVar.f74510b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f74509a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f74510b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(id=");
        sb.append(this.f74509a);
        sb.append(", isAladdin=");
        sb.append(this.f74510b);
        sb.append(")");
        return sb.toString();
    }

    public C28380aa(String str, boolean z) {
        C52711k.m112240b(str, "id");
        this.f74509a = str;
        this.f74510b = z;
    }

    public /* synthetic */ C28380aa(String str, boolean z, int i, C52707g gVar) {
        this(str, false);
    }
}
