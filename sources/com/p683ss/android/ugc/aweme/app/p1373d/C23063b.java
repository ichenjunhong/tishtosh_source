package com.p683ss.android.ugc.aweme.app.p1373d;

/* renamed from: com.ss.android.ugc.aweme.app.d.b */
final class C23063b {
    /* renamed from: a */
    static int m56601a() {
        int i = 0;
        try {
            String[] split = "16.0.41".split("\\.");
            int i2 = 0;
            while (i < split.length) {
                try {
                    i2 = (i2 * 100) + Integer.valueOf(split[i]).intValue();
                    i++;
                } catch (Throwable unused) {
                    return i2;
                }
            }
            return i2;
        } catch (Throwable unused2) {
            return 0;
        }
    }
}
