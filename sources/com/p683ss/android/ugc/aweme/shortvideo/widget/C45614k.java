package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.k */
final /* synthetic */ class C45614k implements AnimatorUpdateListener {

    /* renamed from: a */
    private final TabHost f115379a;

    C45614k(TabHost tabHost) {
        this.f115379a = tabHost;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f115379a.f115285e.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
