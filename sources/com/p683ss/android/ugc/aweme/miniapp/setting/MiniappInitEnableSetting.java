package com.p683ss.android.ugc.aweme.miniapp.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.miniapp.setting.MiniappInitEnableSetting */
public final class MiniappInitEnableSetting {
    @C10179b
    private static final boolean DEFAULT = false;
    public static final MiniappInitEnableSetting INSTANCE = new MiniappInitEnableSetting();

    private MiniappInitEnableSetting() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean get() {
        try {
            return C10193n.m20607a().mo18204a(MiniappInitEnableSetting.class, "miniapp_init_enable", C10181b.m20511a().mo18175c().getMiniappInitEnable(), false);
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
