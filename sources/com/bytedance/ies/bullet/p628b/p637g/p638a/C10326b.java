package com.bytedance.ies.bullet.p628b.p637g.p638a;

import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.g.a.b */
public final class C10326b {

    /* renamed from: a */
    private final Map<Class<?>, C10327c<?>> f27737a = new LinkedHashMap();

    /* renamed from: a */
    public final Iterable<Class<?>> mo18393a() {
        return this.f27737a.keySet();
    }

    /* renamed from: b */
    public final C10326b mo18398b() {
        C10326b bVar = new C10326b();
        bVar.mo18394a(this);
        return bVar;
    }

    /* renamed from: a */
    public final void mo18394a(C10326b bVar) {
        C52711k.m112240b(bVar, "other");
        this.f27737a.putAll(bVar.f27737a);
    }

    /* renamed from: b */
    public final <T> C10327c<T> mo18399b(Class<T> cls) {
        C52711k.m112240b(cls, "clazz");
        C10327c<T> cVar = (C10327c) this.f27737a.get(cls);
        if (cVar == null) {
            return null;
        }
        if (cVar != null) {
            return cVar;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.core.model.context.IContextProvider<T>");
    }

    /* renamed from: a */
    public final <T> void mo18395a(Class<T> cls) {
        C52711k.m112240b(cls, "clazz");
        C10327c cVar = (C10327c) this.f27737a.get(cls);
        if (cVar != null) {
            cVar.mo18295a();
        }
        this.f27737a.remove(cls);
    }

    /* renamed from: c */
    public final <T> T mo18401c(Class<T> cls) {
        C52711k.m112240b(cls, "clazz");
        C10327c cVar = (C10327c) this.f27737a.get(cls);
        if (cVar != null) {
            T b = cVar.mo18392b();
            if (b != null) {
                if (!cls.isAssignableFrom(b.getClass())) {
                    b = null;
                }
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final <T> void mo18400b(Class<T> cls, T t) {
        C52711k.m112240b(cls, "clazz");
        mo18396a(cls, (C10327c<? extends T>) new C10325a<Object>(t));
    }

    /* renamed from: a */
    public final <T> void mo18396a(Class<T> cls, C10327c<? extends T> cVar) {
        boolean z;
        C52711k.m112240b(cls, "clazz");
        C52711k.m112240b(cVar, "provider");
        C10327c<? extends T> cVar2 = (C10327c) this.f27737a.get(cls);
        if (cVar2 != null) {
            if (cVar2 == cVar) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cVar2 = null;
            }
            if (cVar2 != null) {
                cVar2.mo18295a();
            }
        }
        this.f27737a.put(cls, cVar);
    }

    /* renamed from: a */
    public final <T> void mo18397a(Class<T> cls, T t) {
        C52711k.m112240b(cls, "clazz");
        mo18396a(cls, (C10327c<? extends T>) new C10328d<Object>(t));
    }
}
