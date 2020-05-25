package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.n */
final /* synthetic */ class C33074n implements AnimatorUpdateListener {

    /* renamed from: a */
    private final CircleImageView f85893a;

    C33074n(CircleImageView circleImageView) {
        this.f85893a = circleImageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        CircleImageView circleImageView = this.f85893a;
        circleImageView.setVisibility(0);
        circleImageView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * 50.0f);
        circleImageView.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
