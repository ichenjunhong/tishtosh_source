package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bq */
final /* synthetic */ class C21287bq implements OnClickListener {

    /* renamed from: a */
    private final C21271bi f57803a;

    /* renamed from: b */
    private final boolean f57804b;

    C21287bq(C21271bi biVar, boolean z) {
        this.f57803a = biVar;
        this.f57804b = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57803a.mo45415b(this.f57804b, view);
    }
}
