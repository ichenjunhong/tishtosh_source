package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.w */
final /* synthetic */ class C41894w implements OnClickListener {

    /* renamed from: a */
    private final PrivacySettingActivity f106041a;

    C41894w(PrivacySettingActivity privacySettingActivity) {
        this.f106041a = privacySettingActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f106041a.finish();
    }
}
