package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.af.a.g */
public final class C22509g {

    /* renamed from: a */
    private final Map<Class<?>, C22523m<?>> f60635a = new LinkedHashMap();

    /* renamed from: a */
    public final <T> T mo46846a(Class<T> cls) {
        C52711k.m112240b(cls, "clazz");
        C22523m mVar = (C22523m) this.f60635a.get(cls);
        if (mVar != null) {
            T a = mVar.mo46830a();
            if (a != null) {
                if (!cls.isAssignableFrom(a.getClass())) {
                    a = null;
                }
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final <T> void mo46847a(Class<T> cls, C22523m<? extends T> mVar) {
        C52711k.m112240b(cls, "clazz");
        C52711k.m112240b(mVar, "provider");
        C22523m mVar2 = (C22523m) this.f60635a.get(cls);
        if (mVar2 != null) {
            mVar2.mo46831b();
        }
        this.f60635a.put(cls, mVar);
    }
}
