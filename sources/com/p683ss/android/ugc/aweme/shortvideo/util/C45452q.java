package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.os.HandlerThread;
import android.os.Looper;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.q */
public final class C45452q {

    /* renamed from: a */
    public static final C45452q f114869a = new C45452q();

    /* renamed from: b */
    private static HandlerThread f114870b;

    private C45452q() {
    }

    /* renamed from: a */
    public static final Looper m99043a() {
        Looper looper = f114870b.getLooper();
        C52711k.m112236a((Object) looper, "thread.looper");
        return looper;
    }

    static {
        HandlerThread handlerThread = new HandlerThread("AVUtilThread");
        f114870b = handlerThread;
        handlerThread.start();
    }
}
