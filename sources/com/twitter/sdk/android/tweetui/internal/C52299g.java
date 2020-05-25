package com.twitter.sdk.android.tweetui.internal;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.twitter.sdk.android.tweetui.internal.g */
final /* synthetic */ class C52299g implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C52296f f130246a;

    C52299g(C52296f fVar) {
        this.f130246a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C52296f fVar = this.f130246a;
        ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
