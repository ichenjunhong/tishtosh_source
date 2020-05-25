package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.animation.Interpolator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.al */
public final class C43500al implements Interpolator {

    /* renamed from: a */
    private float f109990a = 1.8f;

    public C43500al(float f) {
    }

    public final float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        double d = (double) (f - (this.f109990a / 4.0f));
        Double.isNaN(d);
        double d2 = d * 6.283185307179586d;
        double d3 = (double) this.f109990a;
        Double.isNaN(d3);
        return (float) ((pow * Math.sin(d2 / d3)) + 1.0d);
    }
}
