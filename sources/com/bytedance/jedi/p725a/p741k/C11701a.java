package com.bytedance.jedi.p725a.p741k;

import p064c.p065a.p072e.p087j.C2139l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.k.a */
public final class C11701a implements C11703c {

    /* renamed from: a */
    public final C2139l<C11703c> f31151a = new C2139l<>(32);

    public final void aZ_() {
        T[] tArr = this.f31151a.f6900e;
        C52711k.m112236a((Object) tArr, "hashSet.keys()");
        for (T t : tArr) {
            if (t instanceof C11703c) {
                ((C11703c) t).aZ_();
                this.f31151a.mo6436b(t);
            }
        }
    }
}
