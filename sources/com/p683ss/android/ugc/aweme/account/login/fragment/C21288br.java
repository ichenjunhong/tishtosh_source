package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.br */
final /* synthetic */ class C21288br implements OnClickListener {

    /* renamed from: a */
    private final C21271bi f57805a;

    /* renamed from: b */
    private final boolean f57806b;

    C21288br(C21271bi biVar, boolean z) {
        this.f57805a = biVar;
        this.f57806b = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57805a.mo45412a(this.f57806b, view);
    }
}
