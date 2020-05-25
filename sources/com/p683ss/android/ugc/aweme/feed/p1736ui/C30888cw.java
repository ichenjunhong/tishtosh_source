package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cw */
final /* synthetic */ class C30888cw implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C308823 f80892a;

    C30888cw(C308823 r1) {
        this.f80892a = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C308823 r0 = this.f80892a;
        C30879cr.this.f80867i.setVisibility(0);
        C30879cr.this.f80867i.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
