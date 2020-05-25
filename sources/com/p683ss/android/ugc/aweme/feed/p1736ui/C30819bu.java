package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bu */
final /* synthetic */ class C30819bu implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C30808bm f80736a;

    C30819bu(C30808bm bmVar) {
        this.f80736a = bmVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C30808bm bmVar = this.f80736a;
        bmVar.f80708b.setVisibility(0);
        bmVar.f80708b.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
