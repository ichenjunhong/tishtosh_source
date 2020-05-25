package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.s */
final /* synthetic */ class C21344s implements OnClickListener {

    /* renamed from: a */
    private final C21329o f57970a;

    /* renamed from: b */
    private final boolean f57971b;

    C21344s(C21329o oVar, boolean z) {
        this.f57970a = oVar;
        this.f57971b = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57970a.mo45476a(this.f57971b, view);
    }
}
