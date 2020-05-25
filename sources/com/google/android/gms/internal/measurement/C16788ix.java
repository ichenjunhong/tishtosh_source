package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.ix */
final class C16788ix {

    /* renamed from: a */
    private static final C16788ix f47171a = new C16788ix();

    /* renamed from: b */
    private final C16794jc f47172b = new C16763hz();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, C16793jb<?>> f47173c = new ConcurrentHashMap();

    /* renamed from: a */
    public static C16788ix m40472a() {
        return f47171a;
    }

    /* renamed from: a */
    public final <T> C16793jb<T> mo32308a(Class<T> cls) {
        C16743hf.m40316a(cls, "messageType");
        C16793jb<T> jbVar = (C16793jb) this.f47173c.get(cls);
        if (jbVar != null) {
            return jbVar;
        }
        C16793jb<T> a = this.f47172b.mo32273a(cls);
        C16743hf.m40316a(cls, "messageType");
        C16743hf.m40316a(a, "schema");
        C16793jb jbVar2 = (C16793jb) this.f47173c.putIfAbsent(cls, a);
        return jbVar2 != null ? jbVar2 : a;
    }

    /* renamed from: a */
    public final <T> C16793jb<T> mo32309a(T t) {
        return mo32308a(t.getClass());
    }

    private C16788ix() {
    }
}
