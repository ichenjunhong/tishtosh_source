package com.bytedance.ies.uikit.imageview.imagezoom.p700a;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.a.a */
public final class C11114a implements C11115b {
    /* renamed from: a */
    public final double mo20203a(double d, double d2, double d3, double d4) {
        double d5 = (d / d4) - 1.0d;
        return (d3 * ((d5 * d5 * d5) + 1.0d)) + ProfileUiInitOptimizeEnterThreshold.DEFAULT;
    }

    /* renamed from: b */
    public final double mo20204b(double d, double d2, double d3, double d4) {
        double d5 = d / (d4 / 2.0d);
        if (d5 < 1.0d) {
            return ((d3 / 2.0d) * d5 * d5 * d5) + ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
        double d6 = d5 - 2.0d;
        return ((d3 / 2.0d) * ((d6 * d6 * d6) + 2.0d)) + ProfileUiInitOptimizeEnterThreshold.DEFAULT;
    }
}
