package com.bytedance.ies.geckoclient.p686e;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.bytedance.ies.geckoclient.e.h */
public final class C10944h {

    /* renamed from: a */
    public static C10944h f29357a = new C10944h();

    /* renamed from: b */
    public Handler f29358b;

    private C10944h() {
        HandlerThread handlerThread = new HandlerThread("gecko-io-thread");
        handlerThread.start();
        this.f29358b = new Handler(handlerThread.getLooper());
    }
}
