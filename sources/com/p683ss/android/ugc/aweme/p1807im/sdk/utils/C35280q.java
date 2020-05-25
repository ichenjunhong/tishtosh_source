package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import com.ss.android.ugc.trill.R;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.q */
public final class C35280q {
    /* renamed from: a */
    public static String m79766a(long j) {
        return m79769b(j);
    }

    /* renamed from: a */
    public static void m79768a(C10723a aVar) {
        if (!C35279p.m79763a()) {
            aVar.mo19277a((int) R.drawable.ayq);
        }
    }

    /* renamed from: b */
    private static String m79769b(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return m79767a(j, 1000, C43882k.f111137a);
        }
        if (j < 1000000000) {
            return m79767a(j, 1000000, "m");
        }
        return m79767a(j, 1000000000, "b");
    }

    /* renamed from: a */
    private static String m79767a(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        if ('0' == bigDecimal.charAt(bigDecimal.length() - 1)) {
            StringBuilder sb = new StringBuilder();
            sb.append(bigDecimal.substring(0, bigDecimal.length() - 2));
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bigDecimal);
        sb2.append(str);
        return sb2.toString();
    }
}
