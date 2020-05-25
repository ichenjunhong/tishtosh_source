package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.r */
final /* synthetic */ class C21343r implements OnClickListener {

    /* renamed from: a */
    private final C21329o f57968a;

    /* renamed from: b */
    private final boolean f57969b;

    C21343r(C21329o oVar, boolean z) {
        this.f57968a = oVar;
        this.f57969b = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57968a.mo45478b(this.f57969b, view);
    }
}
