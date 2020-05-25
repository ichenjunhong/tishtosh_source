package com.bytedance.ies.dmt.p664ui.p667c;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.bytedance.ies.dmt.ui.c.a */
public class C10671a implements Interpolator {

    /* renamed from: a */
    protected final PointF f28428a = new PointF();

    /* renamed from: b */
    protected final PointF f28429b = new PointF();

    /* renamed from: c */
    private int f28430c;

    /* renamed from: a */
    private static double m21493a(double d, double d2, double d3, double d4, double d5) {
        double d6 = 1.0d - d;
        double d7 = d * d;
        double d8 = d6 * d6;
        return (d8 * d6 * ProfileUiInitOptimizeEnterThreshold.DEFAULT) + (d8 * 3.0d * d * d3) + (d6 * 3.0d * d7 * d4) + (d7 * d * 1.0d);
    }

    public float getInterpolation(float f) {
        int i = this.f28430c;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = (((float) i) * 1.0f) / 4096.0f;
            if (m21493a((double) f2, ProfileUiInitOptimizeEnterThreshold.DEFAULT, (double) this.f28428a.x, (double) this.f28429b.x, 1.0d) >= ((double) f)) {
                this.f28430c = i;
                break;
            }
            i++;
        }
        double a = m21493a((double) f2, ProfileUiInitOptimizeEnterThreshold.DEFAULT, (double) this.f28428a.y, (double) this.f28429b.y, 1.0d);
        if (a > 0.999d) {
            a = 1.0d;
            this.f28430c = 0;
        }
        return (float) a;
    }
}
