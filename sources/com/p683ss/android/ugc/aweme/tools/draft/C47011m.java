package com.p683ss.android.ugc.aweme.tools.draft;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.m */
final /* synthetic */ class C47011m implements OnClickListener {

    /* renamed from: a */
    private final C47001k f118746a;

    C47011m(C47001k kVar) {
        this.f118746a = kVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f118746a.mo94291h();
    }
}
