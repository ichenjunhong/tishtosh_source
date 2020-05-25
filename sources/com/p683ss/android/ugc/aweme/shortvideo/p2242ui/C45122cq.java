package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import com.p683ss.android.ugc.tools.utils.C50203g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cq */
final /* synthetic */ class C45122cq implements Runnable {

    /* renamed from: a */
    private final VideoRecordNewActivity f114242a;

    C45122cq(VideoRecordNewActivity videoRecordNewActivity) {
        this.f114242a = videoRecordNewActivity;
    }

    public final void run() {
        VideoRecordNewActivity videoRecordNewActivity = this.f114242a;
        if (videoRecordNewActivity.f113798x) {
            videoRecordNewActivity.f113798x = false;
            C50203g.m108358a("VideoRecordNewActivity => addFragment by postDelay");
            videoRecordNewActivity.mo78592d();
        }
    }
}
