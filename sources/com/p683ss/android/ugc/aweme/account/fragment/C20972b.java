package com.p683ss.android.ugc.aweme.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.fragment.b */
final /* synthetic */ class C20972b implements OnClickListener {

    /* renamed from: a */
    private final C20971a f57083a;

    C20972b(C20971a aVar) {
        this.f57083a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57083a.onClick(view);
    }
}
