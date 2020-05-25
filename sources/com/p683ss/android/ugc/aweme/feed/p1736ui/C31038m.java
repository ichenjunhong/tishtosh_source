package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.m */
final /* synthetic */ class C31038m implements OnClickListener {

    /* renamed from: a */
    private final C31013k f81275a;

    C31038m(C31013k kVar) {
        this.f81275a = kVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f81275a.cancel();
    }
}
