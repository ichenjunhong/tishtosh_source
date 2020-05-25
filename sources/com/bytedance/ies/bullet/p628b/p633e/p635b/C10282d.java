package com.bytedance.ies.bullet.p628b.p633e.p635b;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.b.d */
public final class C10282d<T> implements C10280b<T> {

    /* renamed from: a */
    private boolean f27676a;

    /* renamed from: b */
    private T f27677b;

    public C10282d() {
        this(null, false, 3, null);
    }

    /* renamed from: a */
    public final boolean mo18325a() {
        return this.f27676a;
    }

    /* renamed from: b */
    public final T mo18326b() {
        return this.f27677b;
    }

    /* renamed from: a */
    private void m20794a(T t) {
        this.f27676a = true;
        this.f27677b = t;
    }

    private C10282d(T t, boolean z) {
        boolean z2;
        if (!z || t != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f27676a = z2;
        this.f27677b = t;
    }

    /* renamed from: a */
    public final void mo18324a(C10280b<T> bVar, boolean z) {
        C52711k.m112240b(bVar, "other");
        if (mo18325a()) {
            if (bVar.mo18325a() && z) {
                m20794a(bVar.mo18326b());
            }
        } else if (bVar.mo18325a()) {
            m20794a(bVar.mo18326b());
        }
    }

    public /* synthetic */ C10282d(Object obj, boolean z, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        this(obj, z);
    }
}
