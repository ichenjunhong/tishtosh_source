package com.bytedance.p502b.p503a.p504a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.b.a.a.e */
final class C9216e {

    /* renamed from: a */
    final Map<String, C9214c> f25194a = new HashMap();

    /* renamed from: a */
    public final Collection<C9214c> mo16579a() {
        return this.f25194a.values();
    }

    C9216e() {
    }

    /* renamed from: a */
    public final boolean mo16581a(String str) {
        return this.f25194a.containsKey(str);
    }

    /* renamed from: a */
    public final void mo16580a(String str, C9214c cVar) {
        this.f25194a.put(str, cVar);
    }
}
