package com.p683ss.android.ugc.aweme.account.base.p1268a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.base.a.b */
final /* synthetic */ class C20920b implements OnClickListener {

    /* renamed from: a */
    private final C20917a f56907a;

    C20920b(C20917a aVar) {
        this.f56907a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f56907a.hide();
    }
}
