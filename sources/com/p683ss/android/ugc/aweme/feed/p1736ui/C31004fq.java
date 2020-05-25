package com.p683ss.android.ugc.aweme.feed.p1736ui;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.fq */
final /* synthetic */ class C31004fq implements Runnable {

    /* renamed from: a */
    private final VideoShareViewV1 f81184a;

    /* renamed from: b */
    private final float f81185b;

    /* renamed from: c */
    private final float f81186c;

    C31004fq(VideoShareViewV1 videoShareViewV1, float f, float f2) {
        this.f81184a = videoShareViewV1;
        this.f81185b = f;
        this.f81186c = f2;
    }

    public final void run() {
        VideoShareViewV1 videoShareViewV1 = this.f81184a;
        float f = this.f81185b;
        videoShareViewV1.mShareContainerView.animate().scaleX(f).scaleY(f).setDuration(150).withEndAction(new C30998fk(videoShareViewV1, f, this.f81186c)).start();
    }
}
