package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.FastImport1080pLowerFpsInBenchmarkWhiteList */
public final class FastImport1080pLowerFpsInBenchmarkWhiteList {
    @C10179b
    private static final boolean DEFAULT = false;
    public static final FastImport1080pLowerFpsInBenchmarkWhiteList INSTANCE = new FastImport1080pLowerFpsInBenchmarkWhiteList();

    private FastImport1080pLowerFpsInBenchmarkWhiteList() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean enable() {
        return C10193n.m20607a().mo18204a(FastImport1080pLowerFpsInBenchmarkWhiteList.class, "fast_import_1080p_lower_benchmark_enable", C10181b.m20511a().mo18175c().getFastImport1080pLowerBenchmarkEnable(), false);
    }
}
