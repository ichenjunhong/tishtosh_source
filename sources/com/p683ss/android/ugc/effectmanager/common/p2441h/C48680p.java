package com.p683ss.android.ugc.effectmanager.common.p2441h;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.p */
public final class C48680p {
    /* renamed from: a */
    public static long m105351a(String str, long j) {
        long j2 = -1;
        if (str == null || str.isEmpty()) {
            return -1;
        }
        try {
            j2 = Long.valueOf(str).longValue();
        } catch (NumberFormatException unused) {
        }
        return j2;
    }
}
