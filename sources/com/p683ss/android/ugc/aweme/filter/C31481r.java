package com.p683ss.android.ugc.aweme.filter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;

/* renamed from: com.ss.android.ugc.aweme.filter.r */
final /* synthetic */ class C31481r implements OnClickListener {

    /* renamed from: a */
    private final FilterScrollerModule f82381a;

    C31481r(FilterScrollerModule filterScrollerModule) {
        this.f82381a = filterScrollerModule;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        FilterScrollerModule filterScrollerModule = this.f82381a;
        filterScrollerModule.mo64260a(true);
        filterScrollerModule.f82156j = null;
        if (filterScrollerModule.f82153g != null) {
            C39629l.m88232a().mo58567E().mo49430a("select_filter", C42438az.m93209a().mo86526a("creation_id", filterScrollerModule.f82153g.getCreationId()).mo86526a("shoot_way", filterScrollerModule.f82153g.getShootWay()).mo86523a("draft_id", filterScrollerModule.f82153g.getDraftId()).mo86526a("filter_name", "empty").mo86526a("filter_id", "0").mo86526a("content_source", filterScrollerModule.f82153g.getContentSource()).mo86526a("content_type", filterScrollerModule.f82153g.getContentType()).mo86526a("enter_from", "video_shoot_page").f107329a);
        }
    }
}
