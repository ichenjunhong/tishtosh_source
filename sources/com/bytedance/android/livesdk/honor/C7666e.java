package com.bytedance.android.livesdk.honor;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.honor.e */
final /* synthetic */ class C7666e implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C7661b f21118a;

    C7666e(C7661b bVar) {
        this.f21118a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C7661b bVar = this.f21118a;
        if (!bVar.f21108m) {
            bVar.f21096a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
