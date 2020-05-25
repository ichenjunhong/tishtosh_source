package com.p683ss.android.sdk.webview;

import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.sdk.webview.d */
public final class C19749d {

    /* renamed from: a */
    private final Map<Class<?>, C19760h<?>> f54413a = new LinkedHashMap();

    /* renamed from: a */
    public final <T> T mo41177a(Class<T> cls) {
        C52711k.m112240b(cls, "clazz");
        C19760h hVar = (C19760h) this.f54413a.get(cls);
        if (hVar != null) {
            T a = hVar.mo41189a();
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
    public final <T> void mo41178a(Class<T> cls, C19760h<T> hVar) {
        C52711k.m112240b(cls, "clazz");
        C52711k.m112240b(hVar, "provider");
        this.f54413a.get(cls);
        this.f54413a.put(cls, hVar);
    }
}
