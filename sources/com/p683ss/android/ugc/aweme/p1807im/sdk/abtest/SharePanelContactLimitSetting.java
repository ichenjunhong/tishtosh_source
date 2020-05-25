package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.SharePanelContactLimitSetting */
public final class SharePanelContactLimitSetting {
    @C10179b
    private static final int DEFAULT = 4;
    public static final SharePanelContactLimitSetting INSTANCE = new SharePanelContactLimitSetting();

    private SharePanelContactLimitSetting() {
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getSharePanelContactLimit() {
        int a = C10193n.m20607a().mo18200a(SharePanelContactLimitSetting.class, "share_show_unfollow_contacts_count", C10181b.m20511a().mo18175c().getShareShowUnfollowContactsCount(), 4);
        if (a > 0) {
            return a;
        }
        return DEFAULT;
    }
}
