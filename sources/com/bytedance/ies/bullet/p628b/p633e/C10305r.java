package com.bytedance.ies.bullet.p628b.p633e;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.r */
public final class C10305r implements C10295n {

    /* renamed from: a */
    private final Map<Class<? extends C10284d<?, ?, ?, ?>>, C10290i> f27707a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo18295a() {
        Map<Class<? extends C10284d<?, ?, ?, ?>>, C10290i> map = this.f27707a;
        for (Entry value : map.entrySet()) {
            ((C10290i) value.getValue()).mo18342a((Throwable) null);
        }
        map.clear();
    }

    /* renamed from: a */
    public final <T extends C10284d<?, ?, ?, ?>> C10290i mo18260a(Class<? extends T> cls) {
        C52711k.m112240b(cls, "clazz");
        return (C10290i) this.f27707a.get(cls);
    }

    /* renamed from: a */
    public final C10290i mo18261a(String str) {
        C52711k.m112240b(str, "sessionId");
        for (Entry entry : this.f27707a.entrySet()) {
            if (C52711k.m112239a((Object) ((C10290i) entry.getValue()).mo18352k_().f27674a, (Object) str)) {
                return (C10290i) entry.getValue();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final <T extends C10284d<?, ?, ?, ?>> void mo18357a(Class<? extends T> cls, C10290i iVar) {
        C52711k.m112240b(cls, "clazz");
        C52711k.m112240b(iVar, "instance");
        this.f27707a.put(cls, iVar);
    }
}
