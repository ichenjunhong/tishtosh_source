package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.d */
final /* synthetic */ class C21299d implements OnClickListener {

    /* renamed from: a */
    private final C21168a f57835a;

    C21299d(C21168a aVar) {
        this.f57835a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C21168a aVar = this.f57835a;
        if (aVar.isViewValid()) {
            aVar.getActivity().finish();
        }
    }
}
