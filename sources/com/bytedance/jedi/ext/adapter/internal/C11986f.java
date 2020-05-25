package com.bytedance.jedi.ext.adapter.internal;

import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.f */
public final class C11986f {

    /* renamed from: a */
    public final C52670a<JediViewHolderProxy> f31711a = C11987a.f31715a;

    /* renamed from: b */
    public final C11978b f31712b;

    /* renamed from: c */
    public final C11988g f31713c;

    /* renamed from: d */
    public final C11982d f31714d;

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.f$a */
    static final class C11987a extends C52712l implements C52670a<JediViewHolderProxy> {

        /* renamed from: a */
        public static final C11987a f31715a = new C11987a();

        C11987a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new JediViewHolderProxy();
        }
    }

    public C11986f(C11982d dVar) {
        C52711k.m112240b(dVar, "proxyManager");
        this.f31714d = dVar;
        C11978b bVar = new C11978b();
        this.f31714d.f31705b = bVar;
        this.f31712b = bVar;
        C11988g gVar = new C11988g(this.f31714d);
        this.f31714d.f31706c = gVar;
        this.f31713c = gVar;
    }
}
