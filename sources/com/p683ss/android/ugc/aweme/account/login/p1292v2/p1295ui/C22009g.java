package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.g */
final /* synthetic */ class C22009g implements OnClickListener {

    /* renamed from: a */
    private final C22006f f59483a;

    C22009g(C22006f fVar) {
        this.f59483a = fVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C22006f fVar = this.f59483a;
        if (fVar.f59477f != null) {
            fVar.f59477f.onRefreshCaptcha();
        }
    }
}
