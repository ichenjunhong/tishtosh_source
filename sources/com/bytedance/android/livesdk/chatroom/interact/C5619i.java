package com.bytedance.android.livesdk.chatroom.interact;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.i */
final /* synthetic */ class C5619i implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C5249a f14714a;

    /* renamed from: b */
    private final LayoutParams f14715b;

    C5619i(C5249a aVar, LayoutParams layoutParams) {
        this.f14714a = aVar;
        this.f14715b = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C5249a aVar = this.f14714a;
        LayoutParams layoutParams = this.f14715b;
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        aVar.f14022b.setLayoutParams(layoutParams);
    }
}
