package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.g */
public final class C35267g {

    /* renamed from: a */
    private static long f90599a;

    /* renamed from: a */
    public static synchronized long m79739a() {
        long currentTimeMillis;
        synchronized (C35267g.class) {
            currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis <= f90599a) {
                currentTimeMillis = f90599a + 1;
            }
            f90599a = currentTimeMillis;
        }
        return currentTimeMillis;
    }
}
