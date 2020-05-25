package com.bytedance.jedi.p725a.p726a;

import com.bytedance.jedi.p725a.p742l.C11729a;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.a.g */
public final class C11552g {

    /* renamed from: a */
    public static final C11552g f30933a = new C11552g();

    /* renamed from: b */
    private static final Map<C11729a<?>, AtomicBoolean> f30934b = Collections.synchronizedMap(new WeakHashMap());

    private C11552g() {
    }

    /* renamed from: b */
    public final void mo22306b(C11729a<?> aVar) {
        C52711k.m112240b(aVar, "$this$unlock");
        m23659c(aVar).set(false);
    }

    /* renamed from: c */
    private static AtomicBoolean m23659c(C11729a<?> aVar) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) f30934b.get(aVar);
        if (atomicBoolean != null) {
            return atomicBoolean;
        }
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        Map<C11729a<?>, AtomicBoolean> map = f30934b;
        C52711k.m112236a((Object) map, "_map");
        map.put(aVar, atomicBoolean2);
        return atomicBoolean2;
    }

    /* renamed from: a */
    public final void mo22305a(C11729a<?> aVar) {
        C52711k.m112240b(aVar, "$this$lock");
        do {
        } while (!m23659c(aVar).compareAndSet(false, true));
    }
}
