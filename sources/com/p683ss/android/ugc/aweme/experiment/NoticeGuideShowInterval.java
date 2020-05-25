package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.experiment.NoticeGuideShowInterval */
public final class NoticeGuideShowInterval {
    @C10179b
    private static final int DEFAULT = 7;
    public static final NoticeGuideShowInterval INSTANCE = new NoticeGuideShowInterval();

    private NoticeGuideShowInterval() {
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
