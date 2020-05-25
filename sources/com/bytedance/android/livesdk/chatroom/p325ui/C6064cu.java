package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.base.model.user.C3014m;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cu */
final /* synthetic */ class C6064cu implements Runnable {

    /* renamed from: a */
    private final C6049cl f16221a;

    C6064cu(C6049cl clVar) {
        this.f16221a = clVar;
    }

    public final void run() {
        C6049cl clVar = this.f16221a;
        int width = clVar.f16182g.getWidth();
        C3014m userHonor = clVar.f16188m.getUserHonor();
        float h = ((float) ((userHonor.mo8153h() - userHonor.mo8164s()) + 1)) / ((float) ((userHonor.mo8163r() - userHonor.mo8164s()) + 1));
        if (h >= 1.0f) {
            h = 0.99f;
        }
        C6049cl.m13213a(clVar.f16186k);
        clVar.f16186k = ValueAnimator.ofInt(new int[]{0, (int) (((float) width) * h)});
        ((ValueAnimator) clVar.f16186k).addUpdateListener(new C6060cq(clVar));
        clVar.f16186k.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C6049cl.this.f16180e.setClickable(true);
                C6049cl.this.f16182g.setClickable(true);
            }

            public final void onAnimationStart(Animator animator, boolean z) {
                C6049cl.this.f16180e.setClickable(false);
                C6049cl.this.f16182g.setClickable(false);
            }
        });
        clVar.f16186k.setInterpolator(new LinearInterpolator());
        clVar.f16186k.setDuration(1000);
        clVar.f16186k.start();
    }
}
