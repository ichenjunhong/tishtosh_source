package com.bytedance.ies.dmt.p664ui.p666b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: com.bytedance.ies.dmt.ui.b.m */
final /* synthetic */ class C10655m implements AnimatorUpdateListener {

    /* renamed from: a */
    private final int f28308a;

    /* renamed from: b */
    private final View f28309b;

    /* renamed from: c */
    private final boolean f28310c;

    C10655m(int i, View view, boolean z) {
        this.f28308a = i;
        this.f28309b = view;
        this.f28310c = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f28308a;
        View view = this.f28309b;
        boolean z = this.f28310c;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = (float) i;
        view.setTranslationY(z ? (float) ((int) (f - (f * animatedFraction))) : animatedFraction * ((float) (-i)));
    }
}
