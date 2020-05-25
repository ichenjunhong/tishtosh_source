package p2674it.sephiroth.android.library.p2675a;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: it.sephiroth.android.library.a.a */
public final class C53175a implements C53176b {
    /* renamed from: a */
    public final double mo110683a(double d, double d2, double d3, double d4) {
        double d5 = (d / d4) - 1.0d;
        return (d3 * ((d5 * d5 * d5) + 1.0d)) + ProfileUiInitOptimizeEnterThreshold.DEFAULT;
    }

    /* renamed from: b */
    public final double mo110684b(double d, double d2, double d3, double d4) {
        double d5 = d / (d4 / 2.0d);
        if (d5 < 1.0d) {
            return ((d3 / 2.0d) * d5 * d5 * d5) + ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
        double d6 = d5 - 2.0d;
        return ((d3 / 2.0d) * ((d6 * d6 * d6) + 2.0d)) + ProfileUiInitOptimizeEnterThreshold.DEFAULT;
    }
}
