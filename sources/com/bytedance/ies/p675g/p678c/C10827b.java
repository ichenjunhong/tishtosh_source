package com.bytedance.ies.p675g.p678c;

import java.util.HashMap;
import java.util.concurrent.Executor;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.g.c.b */
public final class C10827b {

    /* renamed from: a */
    public C10840i f29087a;

    /* renamed from: b */
    public int f29088b = 32;

    /* renamed from: c */
    public final HashMap<String, C52670a<Boolean>> f29089c = new HashMap<>();

    /* renamed from: d */
    private C10829d f29090d;

    /* renamed from: e */
    private Executor f29091e;

    /* renamed from: f */
    private C10830e f29092f;

    /* renamed from: g */
    private C10828c f29093g;

    /* renamed from: h */
    private boolean f29094h;

    /* renamed from: a */
    public final void mo19611a() {
        C10863s.m22028a(this.f29094h);
        C10840i iVar = this.f29087a;
        if (iVar != null) {
            C10833f.m21989a(iVar);
        }
        Executor executor = this.f29091e;
        if (executor == null) {
            C52711k.m112237a("workerExecutor");
        }
        C10828c cVar = this.f29093g;
        if (cVar == null) {
            C52711k.m112237a("configProvider");
        }
        C10825a aVar = new C10825a(executor, cVar);
        C10829d dVar = this.f29090d;
        if (dVar == null) {
            C52711k.m112237a("localStorage");
        }
        C10830e eVar = this.f29092f;
        if (eVar == null) {
            C52711k.m112237a("networkExecutor");
        }
        Executor executor2 = this.f29091e;
        if (executor2 == null) {
            C52711k.m112237a("workerExecutor");
        }
        C10863s.m22026a(new C10836h(new C10847l(dVar, eVar, executor2, this.f29088b), aVar, this.f29089c));
    }

    /* renamed from: a */
    public final C10827b mo19610a(boolean z) {
        this.f29094h = false;
        return this;
    }

    /* renamed from: a */
    public final C10827b mo19606a(C10828c cVar) {
        C52711k.m112240b(cVar, "configProvider");
        this.f29093g = cVar;
        return this;
    }

    /* renamed from: a */
    public final C10827b mo19607a(C10829d dVar) {
        C52711k.m112240b(dVar, "localStorage");
        this.f29090d = dVar;
        return this;
    }

    /* renamed from: a */
    public final C10827b mo19608a(C10830e eVar) {
        C52711k.m112240b(eVar, "networkExecutor");
        this.f29092f = eVar;
        return this;
    }

    /* renamed from: a */
    public final C10827b mo19609a(Executor executor) {
        C52711k.m112240b(executor, "workerExecutor");
        this.f29091e = executor;
        return this;
    }
}
