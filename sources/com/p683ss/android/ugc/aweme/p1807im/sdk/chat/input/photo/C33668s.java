package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.s */
final /* synthetic */ class C33668s implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C33640a f87295a;

    C33668s(C33640a aVar) {
        this.f87295a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C33640a aVar = this.f87295a;
        aVar.f87231b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) aVar.f87236g));
    }
}
