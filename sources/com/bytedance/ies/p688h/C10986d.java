package com.bytedance.ies.p688h;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ies.h.d */
public final class C10986d {

    /* renamed from: a */
    private static C10986d f29516a;

    /* renamed from: b */
    private Map<String, String> f29517b = new ConcurrentHashMap();

    private C10986d() {
    }

    /* renamed from: a */
    public static synchronized C10986d m22253a() {
        C10986d dVar;
        synchronized (C10986d.class) {
            if (f29516a == null) {
                f29516a = new C10986d();
            }
            dVar = f29516a;
        }
        return dVar;
    }

    /* renamed from: a */
    public final String mo19809a(String str) {
        return (String) this.f29517b.get(str);
    }
}
