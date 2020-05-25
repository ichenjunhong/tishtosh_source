package com.twitter.sdk.android.tweetui.internal;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.twitter.sdk.android.tweetui.internal.d */
final /* synthetic */ class C52293d implements AnimatorUpdateListener {

    /* renamed from: a */
    private final MultiTouchImageView f130232a;

    /* renamed from: b */
    private final float f130233b;

    /* renamed from: c */
    private final float f130234c;

    C52293d(MultiTouchImageView multiTouchImageView, float f, float f2) {
        this.f130232a = multiTouchImageView;
        this.f130233b = f;
        this.f130234c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MultiTouchImageView multiTouchImageView = this.f130232a;
        multiTouchImageView.mo109038a(((Float) valueAnimator.getAnimatedValue()).floatValue() / multiTouchImageView.getScale(), this.f130233b, this.f130234c);
        multiTouchImageView.mo109036a();
    }
}
