package com.bytedance.android.livesdk.honor;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.honor.d */
final /* synthetic */ class C7665d implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C7661b f21117a;

    C7665d(C7661b bVar) {
        this.f21117a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C7661b bVar = this.f21117a;
        if (!bVar.f21108m) {
            bVar.f21096a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
