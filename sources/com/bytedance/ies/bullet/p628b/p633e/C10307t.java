package com.bytedance.ies.bullet.p628b.p633e;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.t */
public final class C10307t {

    /* renamed from: a */
    public final C10290i f27708a;

    /* renamed from: b */
    public final boolean f27709b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10307t) {
                C10307t tVar = (C10307t) obj;
                if (C52711k.m112239a((Object) this.f27708a, (Object) tVar.f27708a)) {
                    if (this.f27709b == tVar.f27709b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C10290i iVar = this.f27708a;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        boolean z = this.f27709b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KitProcessResult(instance=");
        sb.append(this.f27708a);
        sb.append(", isNewInstance=");
        sb.append(this.f27709b);
        sb.append(")");
        return sb.toString();
    }

    public C10307t(C10290i iVar, boolean z) {
        C52711k.m112240b(iVar, "instance");
        this.f27708a = iVar;
        this.f27709b = z;
    }
}
