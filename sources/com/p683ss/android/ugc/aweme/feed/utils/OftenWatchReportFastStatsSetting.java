package com.p683ss.android.ugc.aweme.feed.utils;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.utils.OftenWatchReportFastStatsSetting */
public final class OftenWatchReportFastStatsSetting {
    @C10179b
    public static final boolean ENABLE = true;
    public static final OftenWatchReportFastStatsSetting INSTANCE = new OftenWatchReportFastStatsSetting();

    private OftenWatchReportFastStatsSetting() {
    }

    public static final boolean enabled() {
        return C10193n.m20607a().mo18204a(OftenWatchReportFastStatsSetting.class, "often_watch_report_fast_stats", C10181b.m20511a().mo18175c().getOftenWatchReportFastStats(), true);
    }
}
