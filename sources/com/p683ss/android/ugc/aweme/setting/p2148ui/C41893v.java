package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.v */
final /* synthetic */ class C41893v implements OnClickListener {

    /* renamed from: a */
    private final PrivacyActivity f106040a;

    C41893v(PrivacyActivity privacyActivity) {
        this.f106040a = privacyActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        SmartRouter.buildRoute((Context) this.f106040a, "aweme://privacy/setting/personalization").withParam("user_data_download", (Serializable) PrivacyActivity.m91731d()).open();
        C26890h.m65011a("show_personalization_status", new C23089d().mo47829a("initial_status", C23794bh.m58381G().mo47256q() == 0 ? "off" : "on").f61491a);
    }
}
