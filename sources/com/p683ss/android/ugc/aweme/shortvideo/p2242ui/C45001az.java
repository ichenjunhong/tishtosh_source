package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.az */
final /* synthetic */ class C45001az implements Runnable {

    /* renamed from: a */
    private final VideoPublishActivity f113962a;

    /* renamed from: b */
    private final String f113963b;

    C45001az(VideoPublishActivity videoPublishActivity, String str) {
        this.f113962a = videoPublishActivity;
        this.f113963b = str;
    }

    public final void run() {
        VideoPublishActivity videoPublishActivity = this.f113962a;
        videoPublishActivity.runOnUiThread(new C45053bf(videoPublishActivity, C46994b.m102064a().queryDraft(this.f113963b)));
    }
}
