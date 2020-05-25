package com.bytedance.jedi.p725a.p728c;

import com.bytedance.jedi.p725a.p742l.C11729a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.c.d */
public final class C11573d {
    /* renamed from: a */
    private static String m23677a(C11729a<?> aVar) {
        C52711k.m112240b(aVar, "$this$key");
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.getClass());
        sb.append('_');
        sb.append(aVar.hashCode());
        return sb.toString();
    }

    /* renamed from: a */
    public static final void m23678a(C11729a<?> aVar, C11574e<?, ?> eVar) {
        C52711k.m112240b(aVar, "$this$record");
        C52711k.m112240b(eVar, "ds");
        C11572c.f30955a.mo22312a(m23677a(aVar), eVar);
    }
}
