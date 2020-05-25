package com.bytedance.jedi.arch.ext.list.p744a;

import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11849a;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.f */
public final class C11851f {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C11848e m24206a(C11850b bVar, boolean z, int i) {
        C52711k.m112240b(bVar, "$this$asPrefetcher");
        C11849a aVar = new C11849a(bVar);
        aVar.f31437b = z;
        aVar.f31436a = i;
        if (!aVar.f31437b || aVar.f31436a > 0) {
            return new C11848e(aVar.f31438c, aVar.f31437b, aVar.f31436a, null);
        }
        throw new IllegalArgumentException("Prefetch distance must be a positive number when prefetch is enabled");
    }
}
