package com.bytedance.bdlocation.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.bytedance.bdlocation.utils.e */
public final class C9274e {

    /* renamed from: a */
    public static HandlerThread f25379a;

    /* renamed from: b */
    public static Handler f25380b;

    /* renamed from: c */
    private static HandlerThread f25381c;

    /* renamed from: a */
    public static Looper m18392a() {
        if (f25381c == null) {
            HandlerThread handlerThread = new HandlerThread("LocationScheduleWorker");
            f25381c = handlerThread;
            handlerThread.start();
        }
        return f25381c.getLooper();
    }
}
