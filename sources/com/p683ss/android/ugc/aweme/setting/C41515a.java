package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.setting.a */
public final class C41515a {

    /* renamed from: a */
    public static final C41515a f105192a = new C41515a();

    /* renamed from: b */
    public boolean f105193b = this.f105195d.getBoolean("keva_enabled", true);

    /* renamed from: c */
    public boolean f105194c = this.f105195d.getBoolean("settings_keva_enabled", false);

    /* renamed from: d */
    private Keva f105195d = Keva.getRepoSync("abmock_keva_repo", 1);

    private C41515a() {
    }

    /* renamed from: a */
    public final void mo85299a() {
        this.f105195d.storeBoolean("keva_enabled", C10193n.m20607a().mo18204a(ABMockKevaSettings.class, "abmock_keva_switch", C10181b.m20511a().mo18175c().getAbmockKevaSwitch(), false));
        this.f105195d.storeBoolean("settings_keva_enabled", C10193n.m20607a().mo18204a(SettingsKevaSettings.class, "settings_keva_switch", C10181b.m20511a().mo18175c().getSettingsKevaSwitch(), false));
    }
}
