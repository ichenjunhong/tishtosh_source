package com.p683ss.android.ugc.aweme.protection.gradientpunish;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.protection.gradientpunish.GradientPunishWarningSettings */
public final class GradientPunishWarningSettings {
    public static final GradientPunishWarningSettings INSTANCE = new GradientPunishWarningSettings();
    @C10179b
    private static GradientPunishWarning WARNING_SETTINGS;

    private GradientPunishWarningSettings() {
    }

    public final GradientPunishWarning getWARNING_SETTINGS() {
        return WARNING_SETTINGS;
    }

    public final void setWARNING_SETTINGS(GradientPunishWarning gradientPunishWarning) {
        WARNING_SETTINGS = gradientPunishWarning;
    }
}
