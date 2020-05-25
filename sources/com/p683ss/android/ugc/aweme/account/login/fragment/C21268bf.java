package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bf */
final /* synthetic */ class C21268bf implements OnClickListener {

    /* renamed from: a */
    private final C21259bc f57751a;

    C21268bf(C21259bc bcVar) {
        this.f57751a = bcVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C21259bc bcVar = this.f57751a;
        bcVar.f57731p.setVisibility(8);
        bcVar.f57730o.setText("");
    }
}
