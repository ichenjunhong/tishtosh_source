package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.widget.l */
final /* synthetic */ class C8559l implements AnimatorUpdateListener {

    /* renamed from: a */
    private final PKProgressBar f23481a;

    C8559l(PKProgressBar pKProgressBar) {
        this.f23481a = pKProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PKProgressBar pKProgressBar = this.f23481a;
        pKProgressBar.f23158c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pKProgressBar.invalidate();
    }
}
