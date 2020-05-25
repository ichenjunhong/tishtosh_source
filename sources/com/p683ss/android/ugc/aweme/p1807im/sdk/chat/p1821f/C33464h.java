package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f.h */
public class C33464h {

    /* renamed from: a */
    private static Handler f86729a;

    /* renamed from: a */
    public static void m76692a(Runnable runnable) {
        synchronized (C33464h.class) {
            if (f86729a == null) {
                f86729a = new Handler(Looper.getMainLooper());
            }
        }
        f86729a.post(runnable);
    }

    /* renamed from: a */
    public static void m76693a(Runnable runnable, long j) {
        synchronized (C33464h.class) {
            if (f86729a == null) {
                f86729a = new Handler(Looper.getMainLooper());
            }
        }
        f86729a.postDelayed(runnable, j);
    }
}
