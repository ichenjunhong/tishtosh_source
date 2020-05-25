package com.bytedance.jedi.arch.ext.list;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.ext.list.l */
public class C11865l {

    /* renamed from: a */
    public final C11853b f31449a;

    /* renamed from: b */
    public final int f31450b;

    public C11865l() {
        this(false, 0, 3, null);
    }

    public int hashCode() {
        return (this.f31449a.hashCode() * 31) + this.f31450b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11865l)) {
            return false;
        }
        C11865l lVar = (C11865l) obj;
        if (!(!C52711k.m112239a((Object) this.f31449a, (Object) lVar.f31449a)) && this.f31450b == lVar.f31450b) {
            return true;
        }
        return false;
    }

    public C11865l(boolean z, int i) {
        this.f31450b = i;
        this.f31449a = new C11853b(z);
    }

    public /* synthetic */ C11865l(boolean z, int i, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        this(z, 0);
    }
}
