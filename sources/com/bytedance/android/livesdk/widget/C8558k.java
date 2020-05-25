package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.widget.k */
final /* synthetic */ class C8558k implements AnimatorUpdateListener {

    /* renamed from: a */
    private final PKProgressBar f23480a;

    C8558k(PKProgressBar pKProgressBar) {
        this.f23480a = pKProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PKProgressBar pKProgressBar = this.f23480a;
        pKProgressBar.f23157b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pKProgressBar.invalidate();
    }
}
