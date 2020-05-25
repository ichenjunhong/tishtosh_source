package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.b */
final /* synthetic */ class C39299b implements OnClickListener {

    /* renamed from: a */
    private final AbsPoiAwemeFeedFragment f100449a;

    C39299b(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment) {
        this.f100449a = absPoiAwemeFeedFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f100449a.mo80020a(view);
    }
}
