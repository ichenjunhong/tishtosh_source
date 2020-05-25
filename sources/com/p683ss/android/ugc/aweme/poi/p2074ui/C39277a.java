package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a */
final /* synthetic */ class C39277a implements OnClickListener {

    /* renamed from: a */
    private final AbsPoiAwemeFeedFragment f100406a;

    C39277a(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment) {
        this.f100406a = absPoiAwemeFeedFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f100406a.mo80024b(view);
    }
}
