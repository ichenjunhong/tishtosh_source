package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ab */
final /* synthetic */ class C6440ab implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C6264a f17736a;

    /* renamed from: b */
    private final int f17737b;

    /* renamed from: c */
    private final int f17738c;

    C6440ab(C6264a aVar, int i, int i2) {
        this.f17736a = aVar;
        this.f17737b = i;
        this.f17738c = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C6264a aVar = this.f17736a;
        int i = this.f17737b;
        int i2 = this.f17738c;
        float intValue = ((float) ((Integer) valueAnimator.getAnimatedValue()).intValue()) / 10.0f;
        int i3 = aVar.f16901a - ((int) (((float) i) * intValue));
        int i4 = aVar.f16902b - ((int) (((float) i2) * intValue));
        aVar.f16904d.getLayoutParams().width = i3;
        aVar.f16904d.getLayoutParams().height = i4;
        aVar.f16904d.requestLayout();
    }
}
