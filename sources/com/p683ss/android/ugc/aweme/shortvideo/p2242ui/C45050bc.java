package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bc */
final /* synthetic */ class C45050bc implements OnClickListener {

    /* renamed from: a */
    private final VideoPublishActivity f114089a;

    C45050bc(VideoPublishActivity videoPublishActivity) {
        this.f114089a = videoPublishActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        VideoPublishActivity videoPublishActivity = this.f114089a;
        C46994b.m102064a().setPublishFormDraftCancel(true);
        videoPublishActivity.mo91169e();
        C26890h.m65011a("video_post_page_cancel", C23089d.m56640a().mo47829a("creation_id", videoPublishActivity.f113735d.creationId).mo47829a("shoot_way", videoPublishActivity.f113735d.mShootWay).mo47826a("draft_id", videoPublishActivity.f113735d.draftId).f61491a);
    }
}
