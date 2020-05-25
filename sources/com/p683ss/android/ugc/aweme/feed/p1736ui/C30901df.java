package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.df */
final /* synthetic */ class C30901df implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C30890cy f80936a;

    C30901df(C30890cy cyVar) {
        this.f80936a = cyVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C30890cy cyVar = this.f80936a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue > 0) {
            cyVar.f80904p.setHeight(intValue);
        }
    }
}
