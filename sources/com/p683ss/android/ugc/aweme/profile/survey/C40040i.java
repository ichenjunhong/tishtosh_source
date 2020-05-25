package com.p683ss.android.ugc.aweme.profile.survey;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.i */
final /* synthetic */ class C40040i implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C40036g f102000a;

    C40040i(C40036g gVar) {
        this.f102000a = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C40036g gVar = this.f102000a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.0f) {
            gVar.f101981b.setAlpha(Math.abs(floatValue));
            return;
        }
        if (gVar.f101981b.getAlpha() > 0.0f) {
            gVar.f101981b.setAlpha(0.0f);
        }
        gVar.f101982c.setAlpha(floatValue);
    }
}
