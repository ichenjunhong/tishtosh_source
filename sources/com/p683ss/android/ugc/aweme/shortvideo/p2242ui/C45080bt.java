package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bt */
final /* synthetic */ class C45080bt implements OnClickListener {

    /* renamed from: a */
    private final C45054bg f114177a;

    C45080bt(C45054bg bgVar) {
        this.f114177a = bgVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C45054bg bgVar = this.f114177a;
        C26890h.m65011a("click_privacy_setting", C23089d.m56640a().mo47829a("creation_id", bgVar.f114131q.creationId).mo47829a("enter_from", "video_post_page").mo47829a("content_type", bgVar.mo91430l()).mo47829a("content_source", bgVar.f114131q.getAvetParameter().getContentSource()).mo47829a("shoot_way", bgVar.f114131q.mShootWay).f61491a);
    }
}
