package com.bytedance.als;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.bytedance.als.l */
public final class C2768l {

    /* renamed from: a */
    private static final Handler f8330a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m7874a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            final IllegalStateException illegalStateException = new IllegalStateException("This method must call on main thread");
            f8330a.post(new Runnable() {
                public final void run() {
                    throw illegalStateException;
                }
            });
        }
    }
}
