package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.FastImport720pHigherFpsInBenchmarkWhiteList */
public final class FastImport720pHigherFpsInBenchmarkWhiteList {
    @C10179b
    private static final boolean DEFAULT = false;
    public static final FastImport720pHigherFpsInBenchmarkWhiteList INSTANCE = new FastImport720pHigherFpsInBenchmarkWhiteList();

    private FastImport720pHigherFpsInBenchmarkWhiteList() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean enable() {
        return C10193n.m20607a().mo18204a(FastImport720pHigherFpsInBenchmarkWhiteList.class, "fast_import_720p_higher_benchmark_enable", C10181b.m20511a().mo18175c().getFastImport720pHigherBenchmarkEnable(), false);
    }
}
