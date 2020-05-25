package com.p683ss.android.ugc.aweme.flowfeed.p1759h;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31760g;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.u */
final /* synthetic */ class C31813u implements OnClickListener {

    /* renamed from: a */
    private final C31805p f83132a;

    C31813u(C31805p pVar) {
        this.f83132a = pVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C31805p pVar = this.f83132a;
        if (pVar.f83052g != null && (pVar.f83052g instanceof C31760g)) {
            ((C31760g) pVar.f83052g).mo64673d(view, pVar.itemView, pVar.f83048c);
        }
    }
}
