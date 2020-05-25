package com.p683ss.android.ugc.aweme.main.experiment.pneumonia;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p2628d.p2639f.p2641b.C52711k;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabSetting */
public final class DynamicTabSetting {
    @C10179b(mo18165a = true)
    private static final DynamicTabSettingStruct DEFAULT;
    public static final DynamicTabSetting INSTANCE = new DynamicTabSetting();

    private DynamicTabSetting() {
    }

    public final DynamicTabSettingStruct getDEFAULT() {
        return DEFAULT;
    }

    static {
        DynamicTabSettingStruct dynamicTabSettingStruct = new DynamicTabSettingStruct(0, null, 3, null);
        DEFAULT = dynamicTabSettingStruct;
    }

    public static final DynamicTabSettingStruct get() {
        try {
            DynamicTabSettingStruct dynamicTabSettingStruct = (DynamicTabSettingStruct) C10193n.m20607a().mo18202a(DynamicTabSetting.class, "virus_setting", C10181b.m20511a().mo18175c().getVirusSetting(), "com.ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabSettingStruct", DynamicTabSettingStruct.class);
            C52711k.m112236a((Object) dynamicTabSettingStruct, "value");
            return dynamicTabSettingStruct;
        } catch (Throwable th) {
            C32458a.m75143a((Exception) new RuntimeException(th));
            DynamicTabSettingStruct dynamicTabSettingStruct2 = new DynamicTabSettingStruct(0, null, 3, null);
            return dynamicTabSettingStruct2;
        }
    }
}
