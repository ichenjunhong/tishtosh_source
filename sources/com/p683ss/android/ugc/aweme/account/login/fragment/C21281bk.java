package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bk */
final /* synthetic */ class C21281bk implements OnClickListener {

    /* renamed from: a */
    private final C21271bi f57797a;

    C21281bk(C21271bi biVar) {
        this.f57797a = biVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C21271bi biVar = this.f57797a;
        biVar.f57778s.setText("");
        biVar.f57779t.setVisibility(8);
    }
}
