package com.bytedance.lobby.p777a;

import android.support.p030v4.p038f.C0777a;
import java.util.Map;

/* renamed from: com.bytedance.lobby.a.a */
public final class C12312a {

    /* renamed from: a */
    private static volatile C12312a f32451a;

    /* renamed from: b */
    private Map<String, C12313b> f32452b = new C0777a();

    private C12312a() {
    }

    /* renamed from: a */
    public static C12312a m24777a() {
        if (f32451a == null) {
            synchronized (C12312a.class) {
                if (f32451a == null) {
                    f32451a = new C12312a();
                }
            }
        }
        return f32451a;
    }

    /* renamed from: a */
    public final synchronized void mo23292a(C12313b bVar) {
        this.f32452b.put(bVar.mo23339e().f32487b, bVar);
    }
}
