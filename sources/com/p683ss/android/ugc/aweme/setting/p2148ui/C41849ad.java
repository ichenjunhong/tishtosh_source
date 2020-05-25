package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ad */
final /* synthetic */ class C41849ad implements OnClickListener {

    /* renamed from: a */
    private final RadioSettingItem f105994a;

    C41849ad(RadioSettingItem radioSettingItem) {
        this.f105994a = radioSettingItem;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        RadioSettingItem radioSettingItem = this.f105994a;
        if (radioSettingItem.f105759m == null) {
            radioSettingItem.setChecked(!radioSettingItem.mo85676c());
            return;
        }
        radioSettingItem.f105759m.mo47209a(radioSettingItem);
        radioSettingItem.setChecked(!radioSettingItem.mo85676c());
    }
}
