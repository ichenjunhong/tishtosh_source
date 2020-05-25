package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.login.C21379m;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.g */
final /* synthetic */ class C21583g implements OnClickListener {

    /* renamed from: a */
    private final C21577f f58536a;

    C21583g(C21577f fVar) {
        this.f58536a = fVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C21577f fVar = this.f58536a;
        if (view.getId() == R.id.aru) {
            ((C21379m) fVar.getActivity()).mo45030b();
        }
    }
}
