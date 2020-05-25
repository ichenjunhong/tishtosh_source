package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.at */
final /* synthetic */ class C6667at implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C6665as f18206a;

    C6667at(C6665as asVar) {
        this.f18206a = asVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C6665as asVar = this.f18206a;
        if (asVar.f18184a != null) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - (0.6727273f * floatValue);
            asVar.f18184a.setScaleX(f);
            float f2 = 1.0f - (floatValue * 0.625f);
            asVar.f18184a.setScaleY(f2);
            asVar.f18196m.setScaleX(f);
            asVar.f18196m.setScaleY(f2);
        }
    }
}
