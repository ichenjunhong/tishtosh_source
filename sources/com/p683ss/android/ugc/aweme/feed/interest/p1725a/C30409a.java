package com.p683ss.android.ugc.aweme.feed.interest.p1725a;

import android.view.animation.Interpolator;

/* renamed from: com.ss.android.ugc.aweme.feed.interest.a.a */
public final class C30409a implements Interpolator {

    /* renamed from: a */
    private final float f79483a = 0.61f;

    public C30409a(float f) {
    }

    public final float getInterpolation(float f) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        double d = (double) f;
        double d2 = (double) this.f79483a;
        Double.isNaN(d2);
        double d3 = d2 / 4.0d;
        Double.isNaN(d);
        double d4 = (d - d3) * 6.283185307179586d;
        double d5 = (double) this.f79483a;
        Double.isNaN(d5);
        return (float) ((pow * Math.sin(d4 / d5)) + 1.0d);
    }
}
