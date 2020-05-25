package com.p683ss.android.ugc.aweme.familiar.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.familiar.experiment.RemoveFamiliarSeenVideoSettings */
public final class RemoveFamiliarSeenVideoSettings {
    @C10179b
    private static final boolean ENABLE = true;
    public static final RemoveFamiliarSeenVideoSettings INSTANCE = new RemoveFamiliarSeenVideoSettings();

    private RemoveFamiliarSeenVideoSettings() {
    }

    public final boolean getENABLE() {
        return ENABLE;
    }

    public final boolean isEnable() {
        return C10193n.m20607a().mo18204a(RemoveFamiliarSeenVideoSettings.class, "is_familiar_feed_filter_duplicate", C10181b.m20511a().mo18175c().getIsFamiliarFeedFilterDuplicate(), true);
    }
}
