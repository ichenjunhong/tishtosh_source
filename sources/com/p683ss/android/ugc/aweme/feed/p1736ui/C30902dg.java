package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dg */
final /* synthetic */ class C30902dg implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C30890cy f80937a;

    C30902dg(C30890cy cyVar) {
        this.f80937a = cyVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C30890cy cyVar = this.f80937a;
        cyVar.f80905q.setVisibility(0);
        cyVar.f80905q.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
