package com.p683ss.android.ugc.aweme.filter;

import com.p683ss.android.ugc.tools.utils.C50203g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.h */
public final class C31460h {
    /* renamed from: a */
    public static final String m73281a(C31459g gVar) {
        C52711k.m112240b(gVar, "$this$getFilterFolder");
        return gVar.f82332i;
    }

    /* renamed from: b */
    public static final float m73283b(C31459g gVar, C31406ai aiVar) {
        C52711k.m112240b(gVar, "$this$getSafeInternalDefaultIntensity");
        C52711k.m112240b(aiVar, "getter");
        m73282a(gVar, aiVar);
        return gVar.f82334k;
    }

    /* renamed from: a */
    public static final void m73282a(C31459g gVar, C31406ai aiVar) {
        float f;
        C52711k.m112240b(gVar, "$this$setInternalDefaultIntensity");
        C52711k.m112240b(aiVar, "getter");
        if (-1.0f == gVar.f82334k) {
            String str = gVar.f82332i;
            if (str != null) {
                f = aiVar.mo49450a(str);
            } else {
                f = 0.8f;
            }
            gVar.f82334k = f;
            if (-1.0f == gVar.f82334k) {
                StringBuilder sb = new StringBuilder("[FilterBean.setInternalDefaultIntensity] filterFolder:");
                sb.append(gVar.f82332i);
                sb.append(" internalDefaultIntensity == -1");
                C50203g.m108361b(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static final float m73279a(C31459g gVar, C31405ah ahVar, C31406ai aiVar) {
        C52711k.m112240b(gVar, "$this$getStoreIntensity");
        C52711k.m112240b(ahVar, "iFilterIntensityStore");
        C52711k.m112240b(aiVar, "getter");
        return m73278a(gVar, ahVar.mo64304a(gVar, aiVar), aiVar);
    }

    /* renamed from: a */
    public static final float m73278a(C31459g gVar, int i, C31406ai aiVar) {
        double d;
        C52711k.m112240b(gVar, "$this$progress2Intensity");
        C52711k.m112240b(aiVar, "getter");
        m73282a(gVar, aiVar);
        if (gVar.f82334k == 1.0f) {
            double d2 = (double) i;
            Double.isNaN(d2);
            d = d2 / 100.0d;
        } else if (gVar.f82334k <= 0.8f) {
            double d3 = (double) gVar.f82334k;
            Double.isNaN(d3);
            double d4 = d3 / 80.0d;
            double d5 = (double) i;
            Double.isNaN(d5);
            d = d5 * d4;
        } else {
            double d6 = (double) gVar.f82334k;
            Double.isNaN(d6);
            double d7 = d6 / 80.0d;
            double d8 = (double) gVar.f82334k;
            Double.isNaN(d8);
            double d9 = (1.0d - d8) / 20.0d;
            if (i <= 80) {
                double d10 = (double) i;
                Double.isNaN(d10);
                d = d10 * d7;
            } else {
                double d11 = (double) gVar.f82334k;
                double d12 = (double) (i - 80);
                Double.isNaN(d12);
                double d13 = d9 * d12;
                Double.isNaN(d11);
                d = d11 + d13;
            }
        }
        return (float) d;
    }

    /* renamed from: a */
    public static final int m73280a(C31459g gVar, float f, C31406ai aiVar) {
        C52711k.m112240b(gVar, "$this$intensity2Progress");
        C52711k.m112240b(aiVar, "getter");
        m73282a(gVar, aiVar);
        if (gVar.f82334k == 1.0f) {
            return (int) (f * 100.0f);
        }
        if (gVar.f82334k <= 0.8f) {
            return (int) (f / (gVar.f82334k / 80.0f));
        }
        float f2 = gVar.f82334k / 80.0f;
        float f3 = (1.0f - gVar.f82334k) / 20.0f;
        if (f <= gVar.f82334k) {
            return (int) (f / f2);
        }
        return ((int) ((f - gVar.f82334k) / f3)) + 80;
    }
}
