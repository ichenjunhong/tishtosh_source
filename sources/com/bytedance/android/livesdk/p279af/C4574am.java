package com.bytedance.android.livesdk.p279af;

import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.bytedance.android.livesdk.af.am */
public class C4574am {

    /* renamed from: a */
    private static final SimpleDateFormat f12537a = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: b */
    private static final SimpleDateFormat f12538b = new SimpleDateFormat("HH:mm");

    /* renamed from: c */
    private static volatile long f12539c = 0;

    private C4574am() {
    }

    /* renamed from: a */
    public static long m10977a() {
        return System.currentTimeMillis() + f12539c;
    }

    /* renamed from: c */
    public static void m10980c(long j) {
        f12539c = j;
    }

    /* renamed from: b */
    public static String m10979b(long j) {
        return f12537a.format(new Date(j));
    }

    /* renamed from: a */
    public static int m10976a(int i) {
        boolean z;
        if (i <= 0) {
            return 1;
        }
        if (i % 60 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (i / 60) + 1;
        }
        return i / 60;
    }

    /* renamed from: a */
    public static String m10978a(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60;
        long j3 = j - (60 * j2);
        if (j2 < 10) {
            sb.append("0");
        }
        sb.append(j2);
        sb.append(":");
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3);
        return sb.toString();
    }
}
