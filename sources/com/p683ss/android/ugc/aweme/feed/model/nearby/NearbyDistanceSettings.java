package com.p683ss.android.ugc.aweme.feed.model.nearby;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.model.nearby.NearbyDistanceSettings */
public final class NearbyDistanceSettings {
    public static final NearbyDistanceSettings INSTANCE = new NearbyDistanceSettings();
    @C10179b
    private static final NearbyDistance NEARBY_DISTANCE = null;

    private NearbyDistanceSettings() {
    }

    public final NearbyDistance getNEARBY_DISTANCE() {
        return NEARBY_DISTANCE;
    }
}
