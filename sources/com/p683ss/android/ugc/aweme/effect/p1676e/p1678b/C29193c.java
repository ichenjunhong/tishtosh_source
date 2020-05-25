package com.p683ss.android.ugc.aweme.effect.p1676e.p1678b;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.e.b.c */
public abstract class C29193c<Param, Target> {

    /* renamed from: a */
    private final C29191a f76500a;

    public C29193c() {
        this(null, 1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C29192b<Param, Target> mo59087a(Param param, String str);

    private C29193c(C29191a aVar) {
        C52711k.m112240b(aVar, "idGenerator");
        this.f76500a = aVar;
    }

    /* renamed from: a */
    public final C29192b<Param, Target> mo59086a(Param param) {
        return mo59087a(param, this.f76500a.mo59079a());
    }

    public /* synthetic */ C29193c(C29191a aVar, int i, C52707g gVar) {
        this(new C29196f());
    }
}
