package com.p683ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.k */
final /* synthetic */ class C32536k implements OnClickListener {

    /* renamed from: a */
    private final C32534i f84721a;

    C32536k(C32534i iVar) {
        this.f84721a = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f84721a.mo65838a("click_head");
    }
}
