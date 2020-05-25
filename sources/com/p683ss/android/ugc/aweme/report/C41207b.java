package com.p683ss.android.ugc.aweme.report;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;

/* renamed from: com.ss.android.ugc.aweme.report.b */
public final /* synthetic */ class C41207b implements OnClickListener {

    /* renamed from: a */
    private final Aweme f104647a;

    /* renamed from: b */
    private final ViewGroup f104648b;

    public C41207b(Aweme aweme, ViewGroup viewGroup) {
        this.f104647a = aweme;
        this.f104648b = viewGroup;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        Aweme aweme = this.f104647a;
        ViewGroup viewGroup = this.f104648b;
        C26890h.m65011a("info_bar_click", C23089d.m56640a().mo47829a("group_id", aweme.getAid()).mo47829a(C42311c.f106865i, aweme.getAwemeRiskModel().getContent()).f61491a);
        SmartRouter.buildRoute(viewGroup.getContext(), aweme.getAwemeRiskModel().getUrl()).open();
    }
}
