package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.t */
final /* synthetic */ class C41891t implements OnClickListener {

    /* renamed from: a */
    private final PrivacyActivity f106038a;

    C41891t(PrivacyActivity privacyActivity) {
        this.f106038a = privacyActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C10691a.m21542b((Context) this.f106038a, (int) R.string.b1i).mo19066a();
    }
}
