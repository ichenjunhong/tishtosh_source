package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.EnableFeedLiveRefresh */
public final class EnableFeedLiveRefresh {
    @C10179b
    private static final boolean DEFAULT = true;
    public static final EnableFeedLiveRefresh INSTANCE = new EnableFeedLiveRefresh();

    private EnableFeedLiveRefresh() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
