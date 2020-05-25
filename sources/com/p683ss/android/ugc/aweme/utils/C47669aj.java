package com.p683ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: com.ss.android.ugc.aweme.utils.aj */
final /* synthetic */ class C47669aj implements AnimatorUpdateListener {

    /* renamed from: a */
    private final ViewGroup f120146a;

    /* renamed from: b */
    private final boolean f120147b;

    C47669aj(ViewGroup viewGroup, boolean z) {
        this.f120146a = viewGroup;
        this.f120147b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup = this.f120146a;
        boolean z = this.f120147b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
        if (z) {
            marginLayoutParams.bottomMargin = intValue;
        } else {
            marginLayoutParams.topMargin = intValue;
        }
        viewGroup.setLayoutParams(marginLayoutParams);
    }
}
