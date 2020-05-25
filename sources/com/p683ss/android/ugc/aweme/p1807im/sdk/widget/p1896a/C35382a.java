package com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1896a;

import android.view.animation.Interpolator;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.a.a */
public final class C35382a implements Interpolator {
    public final float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        double d = (double) (f - 0.1f);
        Double.isNaN(d);
        return (float) ((pow * Math.sin((d * 6.283185307179586d) / 0.4000000059604645d)) + 1.0d);
    }
}
