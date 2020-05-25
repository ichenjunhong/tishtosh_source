package com.p683ss.android.ugc.aweme.choosemusic.p1514h;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.e */
public final class C24965e {
    /* renamed from: a */
    public static String m60742a(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(bigDecimal);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m60743a(long j, long j2, String str, String str2, String str3) {
        String a = m60742a(j, j2, "");
        if (a.equals(str2)) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(str);
        return sb.toString();
    }
}
