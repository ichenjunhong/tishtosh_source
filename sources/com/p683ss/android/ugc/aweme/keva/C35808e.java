package com.p683ss.android.ugc.aweme.keva;

import android.content.SharedPreferences.Editor;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32811d;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.keva.e */
public final /* synthetic */ class C35808e implements C32811d {

    /* renamed from: a */
    public static final C32811d f91974a = new C35808e();

    private C35808e() {
    }

    public final void change(IESSettingsProxy iESSettingsProxy) {
        boolean z = false;
        Editor edit = C11010c.m22280a().getSharedPreferences("keva_switch_repo", 0).edit();
        String str = "keva_switch";
        if (iESSettingsProxy.getKevaSwitch().intValue() == 1) {
            z = true;
        }
        edit.putBoolean(str, z).putStringSet("keva_blacklist", new HashSet(iESSettingsProxy.getKevaBlacklist())).apply();
    }
}
