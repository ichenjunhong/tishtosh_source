package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bj */
public final class C45427bj {
    /* renamed from: a */
    public static void m98998a(View view, float f, float f2) {
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{view.getAlpha(), f2});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    /* renamed from: a */
    public static void m98999a(View view, float f, float f2, long j) {
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{view.getAlpha(), f2});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
