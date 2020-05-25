package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.be */
final /* synthetic */ class C21267be implements OnClickListener {

    /* renamed from: a */
    private final C21259bc f57750a;

    C21267be(C21259bc bcVar) {
        this.f57750a = bcVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C21259bc bcVar = this.f57750a;
        if (bcVar.isViewValid() && bcVar.getActivity() != null) {
            bcVar.mo45160a();
            bcVar.getActivity().finish();
        }
    }
}
