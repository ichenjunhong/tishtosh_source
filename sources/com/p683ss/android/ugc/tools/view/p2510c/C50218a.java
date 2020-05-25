package com.p683ss.android.ugc.tools.view.p2510c;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.ss.android.ugc.tools.view.c.a */
public class C50218a implements Interpolator {

    /* renamed from: a */
    protected final PointF f125793a = new PointF();

    /* renamed from: b */
    protected final PointF f125794b = new PointF();

    /* renamed from: c */
    private int f125795c;

    /* renamed from: a */
    private static double m108409a(double d, double d2, double d3, double d4, double d5) {
        double d6 = 1.0d - d;
        double d7 = d * d;
        double d8 = d6 * d6;
        return (d8 * d6 * ProfileUiInitOptimizeEnterThreshold.DEFAULT) + (d8 * 3.0d * d * d3) + (d6 * 3.0d * d7 * d4) + (d7 * d * 1.0d);
    }

    public float getInterpolation(float f) {
        int i = this.f125795c;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = (((float) i) * 1.0f) / 4096.0f;
            if (m108409a((double) f2, ProfileUiInitOptimizeEnterThreshold.DEFAULT, (double) this.f125793a.x, (double) this.f125794b.x, 1.0d) >= ((double) f)) {
                this.f125795c = i;
                break;
            }
            i++;
        }
        double a = m108409a((double) f2, ProfileUiInitOptimizeEnterThreshold.DEFAULT, (double) this.f125793a.y, (double) this.f125794b.y, 1.0d);
        if (a > 0.999d) {
            a = 1.0d;
            this.f125795c = 0;
        }
        return (float) a;
    }
}
