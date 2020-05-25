package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.animation.ScaleAnimation;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ez */
final /* synthetic */ class C30985ez implements Runnable {

    /* renamed from: a */
    private final C30966et f81141a;

    C30985ez(C30966et etVar) {
        this.f81141a = etVar;
    }

    public final void run() {
        C30966et etVar = this.f81141a;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.03f, 0.9f, 1.03f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        etVar.f81102r.startAnimation(scaleAnimation);
    }
}
