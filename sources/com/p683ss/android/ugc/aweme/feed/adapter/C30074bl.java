package com.p683ss.android.ugc.aweme.feed.adapter;

import com.C2240a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bl */
final class C30074bl {
    /* renamed from: a */
    static boolean m70502a(int i, int i2, int i3, int i4) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i3;
        double d5 = (double) i4;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        try {
            double parseDouble = Double.parseDouble(C2240a.m6773a(Locale.US, "%.2f", new Object[]{Double.valueOf(d3)}));
            double parseDouble2 = Double.parseDouble(C2240a.m6773a(Locale.US, "%.2f", new Object[]{Double.valueOf(d6)}));
            if (parseDouble <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || parseDouble2 <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || parseDouble == parseDouble2) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
    }
}
