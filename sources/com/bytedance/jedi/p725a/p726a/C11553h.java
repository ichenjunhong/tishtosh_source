package com.bytedance.jedi.p725a.p726a;

import com.bytedance.jedi.p725a.p742l.C11729a;
import com.bytedance.jedi.p725a.p742l.C11730b;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.bytedance.jedi.a.a.h */
public final class C11553h {

    /* renamed from: a */
    public static final Map<C11729a<?>, Map<?, C11730b<?>>> f30935a;

    static {
        Map<C11729a<?>, Map<?, C11730b<?>>> synchronizedMap = Collections.synchronizedMap(new WeakHashMap());
        C52711k.m112236a((Object) synchronizedMap, "Collections.synchronizedMap(WeakHashMap())");
        f30935a = synchronizedMap;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, C11730b<C52847n<K, V>>> m23662a(Map<?, ?> map) {
        if (map != null) {
            return C52731z.m112270f(map);
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableMap<K, com.bytedance.jedi.model.traceable.ITraceable<kotlin.Pair<K, V?>>?>");
    }
}
