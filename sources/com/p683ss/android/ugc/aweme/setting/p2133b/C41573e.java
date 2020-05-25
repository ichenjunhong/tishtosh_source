package com.p683ss.android.ugc.aweme.setting.p2133b;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase.C10731a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.p683ss.android.ugc.aweme.setting.C41623i;

/* renamed from: com.ss.android.ugc.aweme.setting.b.e */
public final /* synthetic */ class C41573e implements C10731a {

    /* renamed from: a */
    private final SettingItemSwitch f105286a;

    /* renamed from: b */
    private final Context f105287b;

    public C41573e(SettingItemSwitch settingItemSwitch, Context context) {
        this.f105286a = settingItemSwitch;
        this.f105287b = context;
    }

    public final void OnSettingItemClick(View view) {
        SettingItemSwitch settingItemSwitch = this.f105286a;
        Context context = this.f105287b;
        settingItemSwitch.toggle();
        StringBuilder sb = new StringBuilder();
        sb.append(settingItemSwitch.isChecked() ? "已开启" : "已关闭");
        sb.append("BOE环境");
        settingItemSwitch.setStartText(sb.toString());
        C41623i.f105347c.mo85384a(settingItemSwitch.mo19320b());
        C41623i.m91489a(context, settingItemSwitch.mo19320b());
    }
}
