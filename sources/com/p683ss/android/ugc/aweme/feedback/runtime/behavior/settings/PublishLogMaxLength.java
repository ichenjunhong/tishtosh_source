package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.settings.PublishLogMaxLength */
public final class PublishLogMaxLength {
    public static final PublishLogMaxLength INSTANCE = new PublishLogMaxLength();
    @C10179b
    private static final int VALUE = 500;

    private PublishLogMaxLength() {
    }

    public final int getVALUE() {
        return VALUE;
    }
}
