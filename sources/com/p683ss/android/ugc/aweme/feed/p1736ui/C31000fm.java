package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.animation.ScaleAnimation;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.fm */
final /* synthetic */ class C31000fm implements Runnable {

    /* renamed from: a */
    private final VideoShareViewV1 f81177a;

    C31000fm(VideoShareViewV1 videoShareViewV1) {
        this.f81177a = videoShareViewV1;
    }

    public final void run() {
        VideoShareViewV1 videoShareViewV1 = this.f81177a;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.03f, 0.9f, 1.03f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        videoShareViewV1.mShareContainerView.startAnimation(scaleAnimation);
    }
}
