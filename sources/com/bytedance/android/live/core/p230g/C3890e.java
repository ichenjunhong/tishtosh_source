package com.bytedance.android.live.core.p230g;

import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;

/* renamed from: com.bytedance.android.live.core.g.e */
public final class C3890e {
    /* renamed from: e */
    public static boolean m9837e(long j) {
        return j >= 1000;
    }

    /* renamed from: a */
    public static String m9833a(long j) {
        return m9836d(j);
    }

    /* renamed from: c */
    public static String m9835c(long j) {
        if (C8607a.f23572a) {
            return m9836d(j);
        }
        return m9839g(j);
    }

    /* renamed from: b */
    public static String m9834b(long j) {
        if (j < 10000) {
            return String.valueOf(j);
        }
        StringBuilder sb = new StringBuilder();
        double d = (double) j;
        Double.isNaN(d);
        sb.append(C4604n.m11050a("%.1f", Double.valueOf((d * 1.0d) / 10000.0d)));
        sb.append("万");
        return sb.toString();
    }

    /* renamed from: f */
    public static String m9838f(long j) {
        if (j < 10000000) {
            return String.valueOf(j);
        }
        StringBuilder sb = new StringBuilder();
        double d = (double) j;
        Double.isNaN(d);
        sb.append(C4604n.m11050a("%.0f", Double.valueOf((d * 1.0d) / 10000.0d)));
        sb.append("万");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m9836d(long j) {
        if (j >= 1000000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb.append(C4604n.m11050a("%.2f", Double.valueOf((d * 1.0d) / 1000000.0d)));
            sb.append("m");
            return sb.toString();
        } else if (j < 1000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(C4604n.m11050a("%.2f", Double.valueOf((d2 * 1.0d) / 1000.0d)));
            sb2.append(C43882k.f111137a);
            return sb2.toString();
        }
    }

    /* renamed from: g */
    private static String m9839g(long j) {
        if (j >= 100000000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb.append(C4604n.m11050a("%.2f", Double.valueOf((d * 1.0d) / 1.0E8d)));
            sb.append("亿");
            return sb.toString();
        } else if (j < 10000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(C4604n.m11050a("%.2f", Double.valueOf((d2 * 1.0d) / 10000.0d)));
            sb2.append("万");
            return sb2.toString();
        }
    }
}
