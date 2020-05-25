package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ee */
final /* synthetic */ class C30933ee implements OnClickListener {

    /* renamed from: a */
    private final C30931ec f81011a;

    C30933ee(C30931ec ecVar) {
        this.f81011a = ecVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C30931ec ecVar = this.f81011a;
        C31208r.m72878a(ecVar.f81198r, ecVar.f81192l);
        C31208r.m72881a(ecVar.f81192l, "livesdk_topview_click", C22858c.f61207c);
    }
}
