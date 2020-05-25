package com.p683ss.android.ugc.aweme.p2377ug.settings;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.ug.settings.UgcPermissionSetting */
public final class UgcPermissionSetting {
    public static final UgcPermissionSetting INSTANCE = new UgcPermissionSetting();
    @C10179b
    private static final UgcPermission VALUE = null;

    private UgcPermissionSetting() {
    }

    public final UgcPermission getVALUE() {
        return VALUE;
    }

    public final UgcPermission getUgcPermission() {
        try {
            return (UgcPermission) C10193n.m20607a().mo18202a(UgcPermissionSetting.class, "ugc_permission_setting", C10181b.m20511a().mo18175c().getUgcPermissionSetting(), "com.ss.android.ugc.aweme.ug.settings.UgcPermission", UgcPermission.class);
        } catch (C10174a unused) {
            return null;
        }
    }
}
