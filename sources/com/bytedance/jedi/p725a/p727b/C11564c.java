package com.bytedance.jedi.p725a.p727b;

import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p072e.p074b.C1745b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.a.b.c */
public final class C11564c {

    /* renamed from: a */
    public static final C11564c f30949a = new C11564c();

    /* renamed from: com.bytedance.jedi.a.b.c$a */
    public static final class C11565a extends C52712l implements C52682m<C2201v<V>, C2201v<V>, C2201v<V>> {
        public static final C11565a INSTANCE = new C11565a();

        C11565a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C2201v vVar = (C2201v) obj;
            C2201v vVar2 = (C2201v) obj2;
            C52711k.m112240b(vVar, "fetcher");
            C52711k.m112240b(vVar2, "cache");
            C2201v b = vVar2.mo6532b((C2206z<? extends T>) C2201v.m6610b());
            C2206z zVar = vVar;
            C1745b.m6050a(zVar, "other is null");
            C2201v a = C2201v.m6602a((C2206z<? extends T>) b, zVar);
            C52711k.m112236a((Object) a, "cache.onExceptionResumeN…     .concatWith(fetcher)");
            return a;
        }
    }

    private C11564c() {
    }
}
