package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w */
final /* synthetic */ class C44161w implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C44155r f111866a;

    /* renamed from: b */
    private final int f111867b;

    C44161w(C44155r rVar, int i) {
        this.f111866a = rVar;
        this.f111867b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f111866a.f111849c.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) this.f111867b));
    }
}
