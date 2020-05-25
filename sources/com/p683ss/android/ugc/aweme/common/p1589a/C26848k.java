package com.p683ss.android.ugc.aweme.common.p1589a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26847b;

/* renamed from: com.ss.android.ugc.aweme.common.a.k */
final /* synthetic */ class C26848k implements OnClickListener {

    /* renamed from: a */
    private final C26847b f70692a;

    C26848k(C26847b bVar) {
        this.f70692a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C26847b bVar = this.f70692a;
        if (C26844j.this.f70685v != null) {
            C26844j.this.f70685v.ar_();
        }
        if (bVar.f70689a != null) {
            bVar.f70689a.f70693a = false;
        }
    }
}
