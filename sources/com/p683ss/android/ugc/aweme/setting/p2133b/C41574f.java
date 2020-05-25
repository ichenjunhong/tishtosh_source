package com.p683ss.android.ugc.aweme.setting.p2133b;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase.C10731a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.p683ss.android.ugc.aweme.setting.C41623i;

/* renamed from: com.ss.android.ugc.aweme.setting.b.f */
public final /* synthetic */ class C41574f implements C10731a {

    /* renamed from: a */
    private final SettingItemSwitch f105288a;

    /* renamed from: b */
    private final Context f105289b;

    public C41574f(SettingItemSwitch settingItemSwitch, Context context) {
        this.f105288a = settingItemSwitch;
        this.f105289b = context;
    }

    public final void OnSettingItemClick(View view) {
        SettingItemSwitch settingItemSwitch = this.f105288a;
        Context context = this.f105289b;
        settingItemSwitch.toggle();
        StringBuilder sb = new StringBuilder();
        sb.append(settingItemSwitch.isChecked() ? "已开启" : "已关闭");
        sb.append("PPE环境");
        settingItemSwitch.setStartText(sb.toString());
        C41623i.f105347c.mo85384a(false);
        C41623i.m91495b(settingItemSwitch.mo19320b());
        C10691a.m21537a(context, settingItemSwitch.mo19319a() ? "已开启PPE环境, 冷启动后可切换至PPE环境" : "已关闭PPEE环境，冷启动后可切换至线上环境").mo19066a();
    }
}
