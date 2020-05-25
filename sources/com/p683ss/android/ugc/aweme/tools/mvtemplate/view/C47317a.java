package com.p683ss.android.ugc.aweme.tools.mvtemplate.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.a */
final /* synthetic */ class C47317a implements AnimatorUpdateListener {

    /* renamed from: a */
    private final MvThemeListViewPager f119436a;

    C47317a(MvThemeListViewPager mvThemeListViewPager) {
        this.f119436a = mvThemeListViewPager;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f119436a.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
