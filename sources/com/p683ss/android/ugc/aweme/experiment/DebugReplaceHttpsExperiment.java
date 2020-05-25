package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.experiment.DebugReplaceHttpsExperiment */
public final class DebugReplaceHttpsExperiment {
    @C10179b
    private static final boolean ENABLE = true;
    public static final DebugReplaceHttpsExperiment INSTANCE = new DebugReplaceHttpsExperiment();

    private DebugReplaceHttpsExperiment() {
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
