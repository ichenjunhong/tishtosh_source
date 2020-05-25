package com.p683ss.android.ugc.aweme.setting.p2133b;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase.C10731a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.p683ss.android.ugc.aweme.setting.C41592d;

/* renamed from: com.ss.android.ugc.aweme.setting.b.d */
final /* synthetic */ class C41572d implements C10731a {

    /* renamed from: a */
    private final SettingItemSwitch f105284a;

    /* renamed from: b */
    private final Context f105285b;

    C41572d(SettingItemSwitch settingItemSwitch, Context context) {
        this.f105284a = settingItemSwitch;
        this.f105285b = context;
    }

    public final void OnSettingItemClick(View view) {
        SettingItemSwitch settingItemSwitch = this.f105284a;
        Context context = this.f105285b;
        settingItemSwitch.toggle();
        StringBuilder sb = new StringBuilder();
        sb.append(settingItemSwitch.isChecked() ? "已开启" : "已关闭");
        sb.append("A/B Test Mock");
        settingItemSwitch.setStartText(sb.toString());
        C41592d.m91454b().mo49466a(context.getApplicationContext(), "ENABLED", settingItemSwitch.mo19319a());
        C10691a.m21537a(context, settingItemSwitch.mo19319a() ? "已开启A/B Test Mock （不再接收网络A/B Test配置）" : "已关闭，杀掉应用后加载新的A/B Test配置").mo19066a();
    }
}
