package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ag */
final /* synthetic */ class C40221ag implements OnClickListener {

    /* renamed from: a */
    private final C40212af f102750a;

    C40221ag(C40212af afVar) {
        this.f102750a = afVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f102750a.onMore(view);
    }
}
