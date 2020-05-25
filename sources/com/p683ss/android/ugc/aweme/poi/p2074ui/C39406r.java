package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.r */
final /* synthetic */ class C39406r implements OnClickListener {

    /* renamed from: a */
    private final C39405q f100793a;

    C39406r(C39405q qVar) {
        this.f100793a = qVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C39405q qVar = this.f100793a;
        qVar.mo80378a("click");
        qVar.dismiss();
    }
}
