package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cr */
final /* synthetic */ class C6061cr implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C6049cl f16218a;

    C6061cr(C6049cl clVar) {
        this.f16218a = clVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C6049cl clVar = this.f16218a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LayoutParams layoutParams = clVar.f16185j.getLayoutParams();
        layoutParams.width = intValue;
        clVar.f16185j.setLayoutParams(layoutParams);
    }
}
