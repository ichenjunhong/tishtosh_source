package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.widget.m */
final /* synthetic */ class C8560m implements AnimatorUpdateListener {

    /* renamed from: a */
    private final PKProgressBar f23482a;

    C8560m(PKProgressBar pKProgressBar) {
        this.f23482a = pKProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PKProgressBar pKProgressBar = this.f23482a;
        pKProgressBar.f23156a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pKProgressBar.invalidate();
    }
}
