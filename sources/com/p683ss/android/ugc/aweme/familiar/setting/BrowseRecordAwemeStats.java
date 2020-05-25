package com.p683ss.android.ugc.aweme.familiar.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.familiar.setting.BrowseRecordAwemeStats */
public final class BrowseRecordAwemeStats {
    public static final BrowseRecordAwemeStats INSTANCE = new BrowseRecordAwemeStats();
    @C10179b(mo18165a = true)
    private static final int NONE = 0;

    private BrowseRecordAwemeStats() {
    }

    public static final boolean needAwemeStatsUpload() {
        if (C10193n.m20607a().mo18200a(BrowseRecordAwemeStats.class, "familiar_aweme_stats_type", C10181b.m20511a().mo18175c().getFamiliarAwemeStatsType(), 0) == 2) {
            return true;
        }
        return false;
    }

    public static final boolean needFamiliarUpload() {
        if (C10193n.m20607a().mo18200a(BrowseRecordAwemeStats.class, "familiar_aweme_stats_type", C10181b.m20511a().mo18175c().getFamiliarAwemeStatsType(), 0) == 1) {
            return true;
        }
        return false;
    }
}
