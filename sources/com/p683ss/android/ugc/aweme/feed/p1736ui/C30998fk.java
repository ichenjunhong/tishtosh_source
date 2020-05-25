package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.animation.ScaleAnimation;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.fk */
final /* synthetic */ class C30998fk implements Runnable {

    /* renamed from: a */
    private final VideoShareViewV1 f81173a;

    /* renamed from: b */
    private final float f81174b;

    /* renamed from: c */
    private final float f81175c;

    C30998fk(VideoShareViewV1 videoShareViewV1, float f, float f2) {
        this.f81173a = videoShareViewV1;
        this.f81174b = f;
        this.f81175c = f2;
    }

    public final void run() {
        VideoShareViewV1 videoShareViewV1 = this.f81173a;
        float f = this.f81174b;
        float f2 = this.f81175c;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        videoShareViewV1.mShareContainerView.startAnimation(scaleAnimation);
    }
}
