package com.bytedance.android.livesdk.p279af;

import android.os.SystemClock;

/* renamed from: com.bytedance.android.livesdk.af.aj */
public final class C4570aj {

    /* renamed from: a */
    private static long f12535a;

    /* renamed from: a */
    public static boolean m10971a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - f12535a;
        f12535a = uptimeMillis;
        if (j > 500) {
            return true;
        }
        return false;
    }
}
