package com.p683ss.android.ugc.aweme.feed.utils;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.ad */
public final class C31179ad implements Interpolator {

    /* renamed from: b */
    public static final C31180a f81598b = new C31180a(null);

    /* renamed from: a */
    public final Interpolator f81599a = new AccelerateInterpolator();

    /* renamed from: com.ss.android.ugc.aweme.feed.utils.ad$a */
    public static final class C31180a {
        private C31180a() {
        }

        public /* synthetic */ C31180a(C52707g gVar) {
            this();
        }
    }

    public final float getInterpolation(float f) {
        if (f < 0.1f) {
            return this.f81599a.getInterpolation(f) / 0.1f;
        }
        float f2 = (f - 0.1f) / 0.9f;
        double pow = Math.pow((double) (1.0f - f2), 4.0d);
        double d = (double) (f2 * 8.0f);
        Double.isNaN(d);
        return (float) ((Math.sin(d * 3.141592653589793d) * pow) + 1.0d);
    }
}
