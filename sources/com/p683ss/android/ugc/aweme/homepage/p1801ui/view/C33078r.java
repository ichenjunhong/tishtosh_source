package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.r */
final /* synthetic */ class C33078r implements AnimatorUpdateListener {

    /* renamed from: a */
    private final CircleImageView f85897a;

    C33078r(CircleImageView circleImageView) {
        this.f85897a = circleImageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        CircleImageView circleImageView = this.f85897a;
        circleImageView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * 100.0f);
        circleImageView.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
