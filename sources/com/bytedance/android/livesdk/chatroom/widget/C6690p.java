package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.p */
final /* synthetic */ class C6690p implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LayoutParams f18260a;

    /* renamed from: b */
    private final ViewGroup f18261b;

    C6690p(LayoutParams layoutParams, ViewGroup viewGroup) {
        this.f18260a = layoutParams;
        this.f18261b = viewGroup;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LayoutParams layoutParams = this.f18260a;
        ViewGroup viewGroup = this.f18261b;
        layoutParams.width = ((Integer) (valueAnimator != null ? valueAnimator.getAnimatedValue() : Integer.valueOf(0))).intValue();
        viewGroup.setLayoutParams(layoutParams);
    }
}
