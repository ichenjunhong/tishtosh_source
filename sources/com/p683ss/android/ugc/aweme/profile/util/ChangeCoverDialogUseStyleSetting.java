package com.p683ss.android.ugc.aweme.profile.util;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.profile.util.ChangeCoverDialogUseStyleSetting */
public final class ChangeCoverDialogUseStyleSetting {
    @C10179b(mo18165a = true)
    public static final int DISABLE = 0;
    public static final ChangeCoverDialogUseStyleSetting INSTANCE = new ChangeCoverDialogUseStyleSetting();

    private ChangeCoverDialogUseStyleSetting() {
    }

    public static final boolean enabled() {
        if (C10193n.m20607a().mo18200a(ChangeCoverDialogUseStyleSetting.class, "change_cover_dialog_use_style_setting", C10181b.m20511a().mo18175c().getChangeCoverDialogUseStyleSetting(), 0) == 1) {
            return true;
        }
        return false;
    }
}
