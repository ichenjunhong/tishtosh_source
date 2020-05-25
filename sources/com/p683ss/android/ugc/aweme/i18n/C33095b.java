package com.p683ss.android.ugc.aweme.i18n;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: com.ss.android.ugc.aweme.i18n.b */
public final class C33095b {
    /* renamed from: a */
    public static String m76068a(long j) {
        return m76072c(j);
    }

    /* renamed from: b */
    public static String m76071b(long j) {
        return m76072c(j);
    }

    /* renamed from: c */
    private static String m76072c(long j) {
        if (j < 0) {
            return "0";
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return m76070a(j, 1000, "K", "1000.0", "1.0M");
        } else if (j >= 1000000000) {
            return m76069a(j, 1000000000, "B");
        } else {
            return m76070a(j, 1000000, "M", "1000.0", "1.0B");
        }
    }

    /* renamed from: a */
    private static String m76069a(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(bigDecimal);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m76070a(long j, long j2, String str, String str2, String str3) {
        String a = m76069a(j, j2, "");
        if (a.equals(str2)) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(str);
        return sb.toString();
    }
}
