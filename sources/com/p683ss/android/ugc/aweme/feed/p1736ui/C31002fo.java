package com.p683ss.android.ugc.aweme.feed.p1736ui;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.fo */
final /* synthetic */ class C31002fo implements Runnable {

    /* renamed from: a */
    private final VideoShareViewV1 f81180a;

    C31002fo(VideoShareViewV1 videoShareViewV1) {
        this.f81180a = videoShareViewV1;
    }

    public final void run() {
        VideoShareViewV1 videoShareViewV1 = this.f81180a;
        videoShareViewV1.mShareContainerView.animate().scaleX(1.03f).scaleY(1.03f).setDuration(130).withEndAction(new C30999fl(videoShareViewV1)).start();
    }
}
