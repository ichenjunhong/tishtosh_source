package com.bytedance.jedi.p725a.p726a;

import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p742l.C11729a;
import java.util.List;
import p2628d.C52857u;

/* renamed from: com.bytedance.jedi.a.a.f */
public final class C11551f {
    /* renamed from: a */
    public static final <K, V> C11544e<K, V> m23658a(C11574e<K, List<V>> eVar) {
        C11729a c = eVar.mo22311c();
        if (c != null) {
            return (C11544e) c;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.model.cache.IListCache<K, V>");
    }
}
