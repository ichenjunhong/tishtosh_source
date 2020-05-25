package com.p683ss.android.ugc.aweme.feed.p1736ui;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.fl */
final /* synthetic */ class C30999fl implements Runnable {

    /* renamed from: a */
    private final VideoShareViewV1 f81176a;

    C30999fl(VideoShareViewV1 videoShareViewV1) {
        this.f81176a = videoShareViewV1;
    }

    public final void run() {
        VideoShareViewV1 videoShareViewV1 = this.f81176a;
        videoShareViewV1.mShareContainerView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(350).withEndAction(new C31000fm(videoShareViewV1)).start();
    }
}
