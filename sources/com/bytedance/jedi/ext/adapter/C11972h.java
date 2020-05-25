package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0174g;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.ext.adapter.h */
public final class C11972h {

    /* renamed from: a */
    public static final C11973a f31676a = new C11973a(null);

    /* renamed from: b */
    private final C0212b f31677b;

    /* renamed from: c */
    private final C0174g f31678c;

    /* renamed from: com.bytedance.jedi.ext.adapter.h$a */
    public static final class C11973a {
        private C11973a() {
        }

        public /* synthetic */ C11973a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C11972h m24361a(C0212b bVar, C0174g gVar) {
            C52711k.m112240b(bVar, "factory");
            C52711k.m112240b(gVar, "store");
            return new C11972h(bVar, gVar);
        }
    }

    public C11972h(C0212b bVar, C0174g gVar) {
        C52711k.m112240b(bVar, "factory");
        C52711k.m112240b(gVar, "store");
        this.f31677b = bVar;
        this.f31678c = gVar;
    }

    /* renamed from: a */
    public final <VM extends C0209x> VM mo22706a(String str, Class<VM> cls) {
        VM a;
        C52711k.m112240b(str, "key");
        C52711k.m112240b(cls, "clazz");
        C0174g gVar = this.f31678c;
        C52711k.m112240b(str, "key");
        VM vm = (C0209x) gVar.mo320a().get(str);
        if (!cls.isInstance(vm)) {
            synchronized (cls) {
                a = this.f31677b.mo361a(cls);
            }
            C0174g gVar2 = this.f31678c;
            C52711k.m112236a((Object) a, "it");
            gVar2.mo321a(str, a);
            C52711k.m112236a((Object) a, "synchronized(clazz) {\n  …so { store.put(key, it) }");
            return a;
        } else if (vm != null) {
            return vm;
        } else {
            throw new C52857u("null cannot be cast to non-null type VM");
        }
    }
}
