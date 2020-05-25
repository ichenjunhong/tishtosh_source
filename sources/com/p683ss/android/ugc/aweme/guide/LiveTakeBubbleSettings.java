package com.p683ss.android.ugc.aweme.guide;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.bytedance.ies.abmock.settings.SettingsTag;

@SettingsTag
@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.guide.LiveTakeBubbleSettings */
public final class LiveTakeBubbleSettings {
    public static final LiveTakeBubbleSettings INSTANCE = new LiveTakeBubbleSettings();
    @C10179b
    private static final boolean mNewAnchorShowBubble = true;

    private LiveTakeBubbleSettings() {
    }

    public final boolean getMNewAnchorShowBubble() {
        return mNewAnchorShowBubble;
    }
}
