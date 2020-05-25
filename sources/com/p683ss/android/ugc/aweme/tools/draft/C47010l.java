package com.p683ss.android.ugc.aweme.tools.draft;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.l */
final /* synthetic */ class C47010l implements OnClickListener {

    /* renamed from: a */
    private final C47001k f118745a;

    C47010l(C47001k kVar) {
        this.f118745a = kVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f118745a.mo94291h();
    }
}
