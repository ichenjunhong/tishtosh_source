package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.FastImport1080pHigherLimitedFps */
public final class FastImport1080pHigherLimitedFps {
    @C10179b
    public static final int DEFAULT = 60;
    public static final FastImport1080pHigherLimitedFps INSTANCE = new FastImport1080pHigherLimitedFps();

    private FastImport1080pHigherLimitedFps() {
    }

    public final int getFastImport1080pHigherLimitedFps() {
        return C10193n.m20607a().mo18200a(FastImport1080pHigherLimitedFps.class, "fast_import_1080p_higher_fps_limited", C10181b.m20511a().mo18175c().getFastImport1080pHigherFpsLimited(), 60);
    }
}
