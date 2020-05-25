package com.p683ss.android.ugc.aweme.p2377ug.poloris;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisJsbSetting */
public final class PolarisJsbSetting {
    @C10179b(mo18165a = true)
    private static final int FIX = 1;
    public static final PolarisJsbSetting INSTANCE = new PolarisJsbSetting();

    private PolarisJsbSetting() {
    }

    public static final boolean isOpen() {
        if (C10193n.m20607a().mo18200a(PolarisJsbSetting.class, "polaris_jsb_setting", C10181b.m20511a().mo18175c().getPolarisJsbSetting(), 1) == 1) {
            return true;
        }
        return false;
    }
}
