package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.bytedance.android.live.uikit.p257c.C4206c;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ct */
final /* synthetic */ class C6063ct implements Runnable {

    /* renamed from: a */
    private final C6049cl f16220a;

    C6063ct(C6049cl clVar) {
        this.f16220a = clVar;
    }

    public final void run() {
        ObjectAnimator objectAnimator;
        C6049cl clVar = this.f16220a;
        if (clVar.mo8452l() && !clVar.f16199x) {
            clVar.f16199x = true;
            clVar.f16177b.setVisibility(0);
            float x = clVar.f16141a.getX() + ((float) clVar.f16141a.getWidth());
            if (C4206c.m10426a(clVar.getContext())) {
                objectAnimator = ObjectAnimator.ofFloat(clVar.f16177b, "translationX", new float[]{x, clVar.f16141a.getX()});
            } else {
                objectAnimator = ObjectAnimator.ofFloat(clVar.f16177b, "translationX", new float[]{clVar.f16141a.getX(), x});
            }
            objectAnimator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C6049cl.this.f16177b.setVisibility(8);
                }
            });
            objectAnimator.setDuration(1000);
            objectAnimator.start();
        }
    }
}
