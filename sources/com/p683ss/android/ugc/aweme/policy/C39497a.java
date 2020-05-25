package com.p683ss.android.ugc.aweme.policy;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.policy.a */
final /* synthetic */ class C39497a implements OnClickListener {

    /* renamed from: a */
    private final PolicyDialog f101045a;

    C39497a(PolicyDialog policyDialog) {
        this.f101045a = policyDialog;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PolicyDialog policyDialog = this.f101045a;
        policyDialog.dismiss();
        if (policyDialog.f101042b != null) {
            policyDialog.f101042b.onClick(view);
        }
    }
}
