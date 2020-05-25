package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cq */
final /* synthetic */ class C6060cq implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C6049cl f16217a;

    C6060cq(C6049cl clVar) {
        this.f16217a = clVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C6049cl clVar = this.f16217a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LayoutParams layoutParams = clVar.f16183h.getLayoutParams();
        layoutParams.width = intValue;
        clVar.f16183h.setLayoutParams(layoutParams);
    }
}
