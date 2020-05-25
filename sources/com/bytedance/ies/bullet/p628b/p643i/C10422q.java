package com.bytedance.ies.bullet.p628b.p643i;

import com.bytedance.ies.bullet.p628b.p643i.C10422q;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.i.q */
public abstract class C10422q<T extends C10422q<T, S, R>, S extends C10423r, R> implements C10384e<R> {

    /* renamed from: b */
    public final R f27840b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract S mo18387a();

    public C10422q(R r) {
        this.f27840b = r;
    }

    /* renamed from: a */
    public final R mo18492a(Class<R> cls) {
        C52711k.m112240b(cls, "inputType");
        C10423r a = mo18387a();
        R r = this.f27840b;
        C52711k.m112240b(cls, "inputType");
        for (C10385f b : a.mo18322a()) {
            r = b.mo18458b(cls, r);
        }
        return r;
    }
}
