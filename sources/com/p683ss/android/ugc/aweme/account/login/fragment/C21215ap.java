package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ap */
final /* synthetic */ class C21215ap implements OnClickListener {

    /* renamed from: a */
    private final C21203ak f57634a;

    C21215ap(C21203ak akVar) {
        this.f57634a = akVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C21203ak akVar = this.f57634a;
        akVar.f57615r.setVisibility(8);
        akVar.f57612o.setText("");
    }
}
