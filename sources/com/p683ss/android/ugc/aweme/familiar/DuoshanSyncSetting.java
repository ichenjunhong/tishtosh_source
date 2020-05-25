package com.p683ss.android.ugc.aweme.familiar;

import android.content.SharedPreferences;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.familiar.DuoshanSyncSetting */
public final class DuoshanSyncSetting {
    public static final DuoshanSyncSetting INSTANCE = new DuoshanSyncSetting();
    @C10179b
    private static final DuoshanSyncProp duoshanSyncProp = null;

    private DuoshanSyncSetting() {
    }

    public static final boolean isEnableSyncToDuoshan() {
        return false;
    }

    public final DuoshanSyncProp getDuoshanSyncProp() {
        return duoshanSyncProp;
    }

    public static final String getCmplToast() {
        DuoshanSyncProp settingValue = INSTANCE.getSettingValue();
        if (settingValue != null) {
            return settingValue.getCmplToast();
        }
        return null;
    }

    public static final String getRelationDescToast() {
        DuoshanSyncProp settingValue = INSTANCE.getSettingValue();
        if (settingValue != null) {
            return settingValue.getRelationDescToast();
        }
        return null;
    }

    public static final String getRelationToast() {
        DuoshanSyncProp settingValue = INSTANCE.getSettingValue();
        if (settingValue != null) {
            return settingValue.getRelationToast();
        }
        return null;
    }

    public static final int getToastFrequency() {
        DuoshanSyncProp settingValue = INSTANCE.getSettingValue();
        if (settingValue != null) {
            return settingValue.getToastFrequency();
        }
        return 0;
    }

    public final DuoshanUrlModel[] getAvatarUrls() {
        DuoshanSyncProp settingValue = getSettingValue();
        if (settingValue != null) {
            return settingValue.getAvatarUrls();
        }
        return null;
    }

    public final int getGuideFrequency() {
        DuoshanSyncProp settingValue = getSettingValue();
        if (settingValue != null) {
            return settingValue.getGuideFrequency();
        }
        return 0;
    }

    public final long getGuideInterval() {
        DuoshanSyncProp settingValue = getSettingValue();
        if (settingValue != null) {
            return settingValue.getGuideInterval();
        }
        return 0;
    }

    public final int getPopupFrequency() {
        DuoshanSyncProp settingValue = getSettingValue();
        if (settingValue != null) {
            return settingValue.getPopupFrequency();
        }
        return 0;
    }

    public final long getPopupInterval() {
        DuoshanSyncProp settingValue = getSettingValue();
        if (settingValue != null) {
            return settingValue.getPopupInterval();
        }
        return 0;
    }

    public final String getSyncAllText() {
        DuoshanSyncProp settingValue = getSettingValue();
        if (settingValue != null) {
            String syncAllText = settingValue.getSyncAllText();
            if (syncAllText != null) {
                return syncAllText;
            }
        }
        return "";
    }

    public final String getSyncSingleText() {
        DuoshanSyncProp settingValue = getSettingValue();
        if (settingValue != null) {
            String syncSingleText = settingValue.getSyncSingleText();
            if (syncSingleText != null) {
                return syncSingleText;
            }
        }
        return "";
    }

    public final boolean isRegisterDuoshan() {
        DuoshanSyncProp settingValue = getSettingValue();
        if (settingValue != null) {
            return settingValue.isRegisterDuoshan();
        }
        return false;
    }

    public final boolean isSyncedHistoryToDuoshan() {
        DuoshanSyncProp settingValue = getSettingValue();
        if (settingValue != null) {
            return settingValue.getSyncedHistoryToDuoshan();
        }
        return false;
    }

    public static final String getRelationCountToast() {
        DuoshanSyncProp settingValue = INSTANCE.getSettingValue();
        if (settingValue != null) {
            String relationCountToast = settingValue.getRelationCountToast();
            if (relationCountToast != null) {
                return relationCountToast;
            }
        }
        return "";
    }

    private final boolean isSettingSynced() {
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "publish_sync_sp", 0);
        if (a != null) {
            return a.getBoolean("is_setting_synced", false);
        }
        return false;
    }

    private final DuoshanSyncProp getSettingValue() {
        try {
            return (DuoshanSyncProp) C10193n.m20607a().mo18202a(DuoshanSyncSetting.class, "sync_to_duoshan_prop", C10181b.m20511a().mo18175c().getSyncToDuoshanProp(), "com.ss.android.ugc.aweme.familiar.DuoshanSyncProp", DuoshanSyncProp.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
