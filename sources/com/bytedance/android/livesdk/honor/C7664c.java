package com.bytedance.android.livesdk.honor;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.honor.c */
final /* synthetic */ class C7664c implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C7661b f21116a;

    C7664c(C7661b bVar) {
        this.f21116a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C7661b bVar = this.f21116a;
        if (!bVar.f21108m) {
            bVar.f21096a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
