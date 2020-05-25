package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.am */
final /* synthetic */ class C33050am implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C33042ah f85853a;

    C33050am(C33042ah ahVar) {
        this.f85853a = ahVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C33042ah ahVar = this.f85853a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.66f) {
            float f = ((floatValue / 0.66f) * 0.04f) + 1.0f;
            ahVar.f85837b.setScaleX(f);
            ahVar.f85837b.setScaleY(f);
            return;
        }
        float f2 = 1.04f - (((floatValue - 0.66f) / 0.33f) * 0.04f);
        ahVar.f85837b.setScaleX(f2);
        ahVar.f85837b.setScaleY(f2);
    }
}
