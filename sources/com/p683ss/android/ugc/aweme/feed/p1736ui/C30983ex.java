package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.animation.ScaleAnimation;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ex */
final /* synthetic */ class C30983ex implements Runnable {

    /* renamed from: a */
    private final C30966et f81137a;

    /* renamed from: b */
    private final float f81138b;

    /* renamed from: c */
    private final float f81139c;

    C30983ex(C30966et etVar, float f, float f2) {
        this.f81137a = etVar;
        this.f81138b = f;
        this.f81139c = f2;
    }

    public final void run() {
        C30966et etVar = this.f81137a;
        float f = this.f81138b;
        float f2 = this.f81139c;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        etVar.f81102r.startAnimation(scaleAnimation);
    }
}
