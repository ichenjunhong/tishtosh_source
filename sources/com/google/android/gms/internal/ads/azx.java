package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class azx {

    /* renamed from: a */
    private static final azx f41690a = new azx();

    /* renamed from: b */
    private final bac f41691b = new ayy();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, bab<?>> f41692c = new ConcurrentHashMap();

    /* renamed from: a */
    public static azx m34942a() {
        return f41690a;
    }

    /* renamed from: a */
    public final <T> bab<T> mo29905a(Class<T> cls) {
        ayb.m34770a(cls, "messageType");
        bab<T> bab = (bab) this.f41692c.get(cls);
        if (bab != null) {
            return bab;
        }
        bab<T> a = this.f41691b.mo29869a(cls);
        ayb.m34770a(cls, "messageType");
        ayb.m34770a(a, "schema");
        bab bab2 = (bab) this.f41692c.putIfAbsent(cls, a);
        return bab2 != null ? bab2 : a;
    }

    /* renamed from: a */
    public final <T> bab<T> mo29906a(T t) {
        return mo29905a(t.getClass());
    }

    private azx() {
    }
}
