package com.p683ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.l */
final /* synthetic */ class C32537l implements OnClickListener {

    /* renamed from: a */
    private final C32534i f84722a;

    C32537l(C32534i iVar) {
        this.f84722a = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f84722a.mo65838a("click_name");
    }
}
