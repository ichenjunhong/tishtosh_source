package com.p683ss.android.ugc.asve;

import android.app.Application;
import com.p683ss.android.ugc.asve.context.C20358e;
import com.p683ss.android.ugc.asve.sandbox.C20652b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.a */
public final class C20315a {

    /* renamed from: a */
    public static final String f55811a = f55811a;

    /* renamed from: b */
    public static Application f55812b;

    /* renamed from: c */
    public static final C20315a f55813c = new C20315a();

    /* renamed from: d */
    private static C20358e f55814d;

    private C20315a() {
    }

    /* renamed from: a */
    public static C20358e m50092a() {
        C20358e eVar = f55814d;
        if (eVar == null) {
            C52711k.m112237a("context");
        }
        return eVar;
    }

    /* renamed from: b */
    public static Application m50093b() {
        Application application = f55812b;
        if (application == null) {
            C52711k.m112237a("applicationContext");
        }
        return application;
    }

    /* renamed from: a */
    public final void mo42958a(C20358e eVar) {
        C52711k.m112240b(eVar, "context");
        f55814d = eVar;
        eVar.mo43158l().mkdirs();
        eVar.mo43163q().mkdirs();
        C20400f.f55930a.mo43228a();
        if (eVar.mo43169w() && !C20652b.f56510g.mo43788c()) {
            C20652b.f56510g.mo43787b();
        }
    }
}
