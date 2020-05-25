package com.p683ss.android.ugc.aweme.notice.api.p2008sp;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.notice.api.sp.AssistantSettings */
public final class AssistantSettings {
    public static final AssistantSettings INSTANCE = new AssistantSettings();
    @C10179b
    private static final AssistantUrl assistantUrl = null;

    private AssistantSettings() {
    }

    public final AssistantUrl getAssistantUrl() {
        return assistantUrl;
    }
}
