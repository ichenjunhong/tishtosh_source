package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.aa */
final /* synthetic */ class C6439aa implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C6264a f17733a;

    /* renamed from: b */
    private final int f17734b;

    /* renamed from: c */
    private final int f17735c;

    C6439aa(C6264a aVar, int i, int i2) {
        this.f17733a = aVar;
        this.f17734b = i;
        this.f17735c = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C6264a aVar = this.f17733a;
        int i = this.f17734b;
        int i2 = this.f17735c;
        float intValue = ((float) ((Integer) valueAnimator.getAnimatedValue()).intValue()) / 10.0f;
        int i3 = aVar.f16901a + ((int) (((float) i) * intValue));
        int i4 = aVar.f16902b + ((int) (((float) i2) * intValue));
        aVar.f16904d.getLayoutParams().width = i3;
        aVar.f16904d.getLayoutParams().height = i4;
        aVar.f16904d.requestLayout();
    }
}
