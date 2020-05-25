package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.p */
final /* synthetic */ class C33076p implements AnimatorUpdateListener {

    /* renamed from: a */
    private final CircleImageView f85895a;

    C33076p(CircleImageView circleImageView) {
        this.f85895a = circleImageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        CircleImageView circleImageView = this.f85895a;
        circleImageView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * 100.0f);
        circleImageView.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
