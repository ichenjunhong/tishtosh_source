package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.base.model.user.C3003c;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cv */
final /* synthetic */ class C6065cv implements Runnable {

    /* renamed from: a */
    private final C6049cl f16222a;

    C6065cv(C6049cl clVar) {
        this.f16222a = clVar;
    }

    public final void run() {
        C6049cl clVar = this.f16222a;
        int width = clVar.f16184i.getWidth();
        C3003c anchorLevel = clVar.f16188m.getAnchorLevel();
        float b = ((float) ((anchorLevel.mo8135b() - anchorLevel.mo8136c()) + 1)) / ((float) ((anchorLevel.mo8137d() - anchorLevel.mo8136c()) + 1));
        if (b >= 1.0f) {
            b = 0.99f;
        }
        C6049cl.m13213a(clVar.f16187l);
        clVar.f16187l = ValueAnimator.ofInt(new int[]{0, (int) (((float) width) * b)});
        ((ValueAnimator) clVar.f16187l).addUpdateListener(new C6061cr(clVar));
        clVar.f16187l.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C6049cl.this.f16181f.setClickable(true);
                C6049cl.this.f16184i.setClickable(true);
            }

            public final void onAnimationStart(Animator animator, boolean z) {
                C6049cl.this.f16181f.setClickable(false);
                C6049cl.this.f16184i.setClickable(false);
            }
        });
        clVar.f16187l.setInterpolator(new LinearInterpolator());
        clVar.f16187l.setDuration(1000);
        clVar.f16187l.start();
    }
}
