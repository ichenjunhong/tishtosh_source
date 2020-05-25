package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ba */
public final class C35219ba {

    /* renamed from: a */
    private static long f90513a;

    /* renamed from: b */
    private static long f90514b;

    /* renamed from: c */
    private static Map<String, Long> f90515c = new HashMap(10);

    /* renamed from: b */
    public static void m79607b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        f90514b = currentTimeMillis;
        f90513a = currentTimeMillis;
    }

    /* renamed from: c */
    public static Long m79608c(String str) {
        return (Long) f90515c.get(str);
    }

    /* renamed from: a */
    public static void m79606a(String str) {
        f90513a = System.currentTimeMillis();
        f90515c.put(str, Long.valueOf(f90513a));
    }
}
