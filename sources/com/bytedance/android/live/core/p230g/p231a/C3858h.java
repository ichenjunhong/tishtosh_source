package com.bytedance.android.live.core.p230g.p231a;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.core.g.a.h */
public class C3858h {

    /* renamed from: b */
    private static C3858h f10883b;

    /* renamed from: a */
    public final ConcurrentHashMap<String, Integer> f10884a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final void mo9243b() {
        this.f10884a.clear();
    }

    private C3858h() {
    }

    /* renamed from: a */
    public static C3858h m9785a() {
        if (f10883b != null) {
            return f10883b;
        }
        synchronized (C3858h.class) {
            if (f10883b == null) {
                f10883b = new C3858h();
            }
        }
        return f10883b;
    }
}
