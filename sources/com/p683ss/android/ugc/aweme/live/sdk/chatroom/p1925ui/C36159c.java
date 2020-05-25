package com.p683ss.android.ugc.aweme.live.sdk.chatroom.p1925ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.c */
final /* synthetic */ class C36159c implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C36157b f92598a;

    C36159c(C36157b bVar) {
        this.f92598a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C36157b bVar = this.f92598a;
        bVar.f92592b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (bVar.f92591a != 0) {
            bVar.mo74894a((1.0f - bVar.f92592b) / 0.5f);
            bVar.f92594d.setAlpha(1.0f - ((1.0f - bVar.f92592b) / 0.5f));
        }
    }
}
