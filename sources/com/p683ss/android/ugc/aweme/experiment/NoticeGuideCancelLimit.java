package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.experiment.NoticeGuideCancelLimit */
public final class NoticeGuideCancelLimit {
    @C10179b
    private static final int DEFAULT = 3;
    public static final NoticeGuideCancelLimit INSTANCE = new NoticeGuideCancelLimit();

    private NoticeGuideCancelLimit() {
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
