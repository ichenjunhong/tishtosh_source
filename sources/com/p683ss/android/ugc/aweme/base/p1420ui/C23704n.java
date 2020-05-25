package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p683ss.android.ugc.aweme.router.C41302w;

/* renamed from: com.ss.android.ugc.aweme.base.ui.n */
final /* synthetic */ class C23704n implements OnClickListener {

    /* renamed from: a */
    private final AwemeHybridLabelModel f63221a;

    C23704n(AwemeHybridLabelModel awemeHybridLabelModel) {
        this.f63221a = awemeHybridLabelModel;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C41302w.m91042a().mo83861a(this.f63221a.getRefUrl());
    }
}
