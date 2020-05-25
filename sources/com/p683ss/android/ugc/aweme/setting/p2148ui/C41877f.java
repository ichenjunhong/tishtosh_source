package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.f */
final /* synthetic */ class C41877f implements OnClickListener {

    /* renamed from: a */
    private final BlackListActivity f106025a;

    C41877f(BlackListActivity blackListActivity) {
        this.f106025a = blackListActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        BlackListActivity blackListActivity = this.f106025a;
        blackListActivity.mStatusView.mo19212f();
        if (blackListActivity.f105633a != null) {
            blackListActivity.f105633a.mo44934a_(Integer.valueOf(1));
        }
    }
}
