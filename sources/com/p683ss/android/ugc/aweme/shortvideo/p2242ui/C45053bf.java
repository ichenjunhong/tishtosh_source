package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43447bb;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45318u;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bf */
final /* synthetic */ class C45053bf implements Runnable {

    /* renamed from: a */
    private final VideoPublishActivity f114092a;

    /* renamed from: b */
    private final C29059c f114093b;

    C45053bf(VideoPublishActivity videoPublishActivity, C29059c cVar) {
        this.f114092a = videoPublishActivity;
        this.f114093b = cVar;
    }

    public final void run() {
        VideoPublishActivity videoPublishActivity = this.f114092a;
        C29059c cVar = this.f114093b;
        if (cVar != null) {
            new C43447bb("VideoPublishActivity");
            videoPublishActivity.f113735d = C43447bb.m95224a(cVar);
            videoPublishActivity.getIntent().putExtra("fromDraft", 1);
            C45318u.m98798b(videoPublishActivity.f113735d.creationId);
            videoPublishActivity.mo91166b();
            return;
        }
        C10691a.m21548c(videoPublishActivity.getApplicationContext(), (int) R.string.at3).mo19066a();
    }
}
