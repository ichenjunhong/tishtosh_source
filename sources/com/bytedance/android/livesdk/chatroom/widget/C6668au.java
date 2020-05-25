package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.au */
final /* synthetic */ class C6668au implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C6665as f18207a;

    C6668au(C6665as asVar) {
        this.f18207a = asVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C6665as asVar = this.f18207a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        asVar.mo12796a(asVar.f18191h, asVar.f18198o * floatValue);
        asVar.mo12796a(asVar.f18192i, floatValue * asVar.f18199p);
    }
}
