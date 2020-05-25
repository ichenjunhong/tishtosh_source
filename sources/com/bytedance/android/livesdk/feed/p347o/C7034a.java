package com.bytedance.android.livesdk.feed.p347o;

import com.bytedance.android.live.core.p230g.C3897k;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;

/* renamed from: com.bytedance.android.livesdk.feed.o.a */
public final class C7034a {
    /* renamed from: a */
    public static String m14680a(long j) {
        return m14681b(j);
    }

    /* renamed from: b */
    private static String m14681b(long j) {
        if (j >= 1000000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb.append(C3897k.m9852a("%.2f", Double.valueOf((d * 1.0d) / 1000000.0d)));
            sb.append("m");
            return sb.toString();
        } else if (j < 1000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(C3897k.m9852a("%.2f", Double.valueOf((d2 * 1.0d) / 1000.0d)));
            sb2.append(C43882k.f111137a);
            return sb2.toString();
        }
    }
}
