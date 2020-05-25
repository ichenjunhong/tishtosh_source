package com.bytedance.android.livesdk.p279af;

import com.bytedance.android.live.core.p230g.C3897k;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;

/* renamed from: com.bytedance.android.livesdk.af.w */
public final class C4622w {
    /* renamed from: a */
    public static String m11084a(long j) {
        return m11085b(j);
    }

    /* renamed from: b */
    private static String m11085b(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < LeakDetectorInstaller.MAX_POLL_TIME) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb.append(C3897k.m9852a("%.1f", Double.valueOf((d * 1.0d) / 1000.0d)));
            sb.append(C43882k.f111137a);
            return sb.toString();
        } else if (j < 1000000) {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(C3897k.m9852a("%.0f", Double.valueOf((d2 * 1.0d) / 1000.0d)));
            sb2.append(C43882k.f111137a);
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            double d3 = (double) j;
            Double.isNaN(d3);
            sb3.append(C3897k.m9852a("%.1f", Double.valueOf((d3 * 1.0d) / 1000000.0d)));
            sb3.append("m");
            return sb3.toString();
        }
    }
}
