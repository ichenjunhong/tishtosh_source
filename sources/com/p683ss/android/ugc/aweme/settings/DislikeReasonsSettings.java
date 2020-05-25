package com.p683ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.DislikeReasonsSettings */
public final class DislikeReasonsSettings {
    @C10179b
    private static DislikeReason[] DISLIKE_REASONS;
    public static final DislikeReasonsSettings INSTANCE = new DislikeReasonsSettings();

    private DislikeReasonsSettings() {
    }

    public final DislikeReason[] getDISLIKE_REASONS() {
        return DISLIKE_REASONS;
    }

    public final void setDISLIKE_REASONS(DislikeReason[] dislikeReasonArr) {
        DISLIKE_REASONS = dislikeReasonArr;
    }
}
