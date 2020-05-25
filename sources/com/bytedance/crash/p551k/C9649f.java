package com.bytedance.crash.p551k;

import android.os.HandlerThread;

/* renamed from: com.bytedance.crash.k.f */
public class C9649f {

    /* renamed from: a */
    private static volatile C9656j f26337a;

    /* renamed from: b */
    public static C9656j m19247b() {
        if (f26337a == null) {
            m19246a();
        }
        return f26337a;
    }

    /* renamed from: a */
    public static HandlerThread m19246a() {
        if (f26337a == null) {
            synchronized (C9649f.class) {
                if (f26337a == null) {
                    C9656j jVar = new C9656j("default_npth_thread");
                    f26337a = jVar;
                    jVar.f26360a.start();
                }
            }
        }
        return f26337a.f26360a;
    }
}
