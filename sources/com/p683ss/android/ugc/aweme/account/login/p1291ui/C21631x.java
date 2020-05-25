package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.x */
final /* synthetic */ class C21631x implements OnClickListener {

    /* renamed from: a */
    private final MusCountryListActivity f58637a;

    C21631x(MusCountryListActivity musCountryListActivity) {
        this.f58637a = musCountryListActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f58637a.onBackPressed();
    }
}
