package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.GradientDrawable;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ed */
final /* synthetic */ class C30932ed implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C30931ec f81010a;

    C30932ed(C30931ec ecVar) {
        this.f81010a = ecVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C30931ec ecVar = this.f81010a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (ecVar.f81007a != null && (ecVar.f81007a.getBackground() instanceof GradientDrawable)) {
            ((GradientDrawable) ecVar.f81007a.getBackground()).setColor(intValue);
        }
    }
}
