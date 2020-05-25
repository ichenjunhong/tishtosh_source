package com.bytedance.ies.bullet.p628b.p637g.p640c;

import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.g.c.a */
public final class C10330a<T> implements C10332c<T> {
    /* renamed from: a */
    public final void mo18403a(boolean z, C10333d<T> dVar, T t, C52682m<? super C10342h, ? super T, C52860x> mVar, C52671b<? super Throwable, C52860x> bVar) {
        C52711k.m112240b(dVar, "processor");
        C52711k.m112240b(mVar, "resolve");
        C52711k.m112240b(bVar, "reject");
        mVar.invoke(C10342h.BREAK, t);
    }

    /* renamed from: a */
    public final void mo18404a(boolean z, C10333d<T> dVar, T t, Throwable th, C52686q<? super C10342h, ? super T, ? super Throwable, C52860x> qVar, C52671b<? super Throwable, C52860x> bVar) {
        C52711k.m112240b(dVar, "processor");
        C52711k.m112240b(th, "t");
        C52711k.m112240b(qVar, "resolve");
        C52711k.m112240b(bVar, "reject");
        if (z) {
            qVar.invoke(C10342h.CONTINUE, t, th);
        } else {
            bVar.invoke(th);
        }
    }
}
