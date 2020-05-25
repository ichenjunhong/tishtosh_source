package com.p683ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.PhoneBindFlowSettings */
public final class PhoneBindFlowSettings {
    public static final PhoneBindFlowSettings INSTANCE = new PhoneBindFlowSettings();
    @C10179b
    private static final boolean NEW_PHONE_BIND_FLOW = true;

    private PhoneBindFlowSettings() {
    }

    public final boolean getNEW_PHONE_BIND_FLOW() {
        return NEW_PHONE_BIND_FLOW;
    }
}
