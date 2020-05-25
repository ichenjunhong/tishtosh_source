package com.bytedance.ies.p688h.p692d;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.bytedance.ies.h.d.a */
public final class C10987a {

    /* renamed from: a */
    private static C10987a f29518a = new C10987a();

    /* renamed from: b */
    private Handler f29519b;

    /* renamed from: a */
    public static C10987a m22255a() {
        return f29518a;
    }

    private C10987a() {
        HandlerThread handlerThread = new HandlerThread("web-offline-io");
        handlerThread.setPriority(2);
        handlerThread.start();
        this.f29519b = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public final void mo19810a(Runnable runnable) {
        this.f29519b.post(runnable);
    }
}
