package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bt */
final /* synthetic */ class C30818bt implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C30808bm f80735a;

    C30818bt(C30808bm bmVar) {
        this.f80735a = bmVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C30808bm bmVar = this.f80735a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue > 0) {
            bmVar.f80707a.setHeight(intValue);
        }
    }
}
