package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.l */
final /* synthetic */ class C21326l implements OnClickListener {

    /* renamed from: a */
    private final C21307h f57919a;

    /* renamed from: b */
    private final boolean f57920b;

    C21326l(C21307h hVar, boolean z) {
        this.f57919a = hVar;
        this.f57920b = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57919a.mo45449a(this.f57920b, view);
    }
}
