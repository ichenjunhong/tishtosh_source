package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40247c;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.am */
final /* synthetic */ class C40227am implements OnClickListener {

    /* renamed from: a */
    private final C40212af f102760a;

    C40227am(C40212af afVar) {
        this.f102760a = afVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40212af afVar = this.f102760a;
        afVar.mo82459q();
        C40247c.m89518a("weblink", afVar.f103081w);
    }
}
