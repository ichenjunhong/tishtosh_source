package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.C23183v;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.f */
final /* synthetic */ class C40378f implements OnClickListener {

    /* renamed from: a */
    private final View f103042a;

    C40378f(View view) {
        this.f103042a = view;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        View view2 = this.f103042a;
        C23183v.m56778a().mo47906b().mo47776a(Boolean.valueOf(true));
        view2.setVisibility(8);
    }
}
