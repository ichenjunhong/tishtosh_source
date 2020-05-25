package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cv */
final /* synthetic */ class C30887cv implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C308823 f80891a;

    C30887cv(C308823 r1) {
        this.f80891a = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C308823 r0 = this.f80891a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue > 0) {
            C30879cr.this.f80860b.setHeight(intValue);
        }
    }
}
