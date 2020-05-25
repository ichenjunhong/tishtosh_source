package com.p683ss.android.ugc.gamora.editor.p2460b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.gamora.editor.b.d */
final /* synthetic */ class C49245d implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C49231a f123702a;

    C49245d(C49231a aVar) {
        this.f123702a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f123702a.f123650p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
