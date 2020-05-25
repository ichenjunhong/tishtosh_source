package com.bytedance.jedi.p725a.p743m;

import com.bytedance.jedi.p725a.p742l.C11729a;
import com.bytedance.jedi.p725a.p742l.C11730b;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.m.f */
public final class C11750f {

    /* renamed from: a */
    static boolean f31208a;

    /* renamed from: b */
    public static final C11750f f31209b = new C11750f();

    /* renamed from: c */
    private static final List<C11744c> f31210c = C52575l.m112101c(C11769k.f31262h);

    /* renamed from: d */
    private static final C11743b f31211d = new C11751a();

    /* renamed from: com.bytedance.jedi.a.m.f$a */
    public static final class C11751a implements C11743b {
        C11751a() {
        }
    }

    private C11750f() {
    }

    /* renamed from: a */
    public static void m24078a(C11729a<?> aVar, C11730b<?> bVar) {
        C52711k.m112240b(aVar, "tracePoint");
        C52711k.m112240b(bVar, "traceable");
        if (f31208a && bVar.mo22489b() != null) {
            for (C11744c a : f31210c) {
                a.mo22496a(aVar, bVar);
            }
        }
    }
}
