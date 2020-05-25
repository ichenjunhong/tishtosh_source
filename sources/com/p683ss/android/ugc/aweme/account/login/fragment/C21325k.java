package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.k */
final /* synthetic */ class C21325k implements OnClickListener {

    /* renamed from: a */
    private final C21307h f57917a;

    /* renamed from: b */
    private final boolean f57918b;

    C21325k(C21307h hVar, boolean z) {
        this.f57917a = hVar;
        this.f57918b = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57917a.mo45450b(this.f57918b, view);
    }
}
