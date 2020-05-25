package com.p683ss.android.ugc.aweme.feed.p1736ui;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.fp */
final /* synthetic */ class C31003fp implements Runnable {

    /* renamed from: a */
    private final VideoShareViewV1 f81181a;

    /* renamed from: b */
    private final float f81182b;

    /* renamed from: c */
    private final float f81183c;

    C31003fp(VideoShareViewV1 videoShareViewV1, float f, float f2) {
        this.f81181a = videoShareViewV1;
        this.f81182b = f;
        this.f81183c = f2;
    }

    public final void run() {
        VideoShareViewV1 videoShareViewV1 = this.f81181a;
        videoShareViewV1.mShareContainerView.animate().scaleX(1.08f).scaleY(1.08f).setDuration(150).withEndAction(new C31004fq(videoShareViewV1, this.f81182b, this.f81183c)).start();
    }
}
