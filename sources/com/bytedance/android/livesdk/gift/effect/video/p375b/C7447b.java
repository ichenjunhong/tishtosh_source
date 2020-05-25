package com.bytedance.android.livesdk.gift.effect.video.p375b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.b.b */
final /* synthetic */ class C7447b implements AnimatorUpdateListener {

    /* renamed from: a */
    private final View f20429a;

    C7447b(View view) {
        this.f20429a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f20429a;
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }
}
