package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.Enable4KImportBenchmark */
public final class Enable4KImportBenchmark {
    public static final Enable4KImportBenchmark INSTANCE = new Enable4KImportBenchmark();
    @C10179b
    private static final boolean VALUE = false;

    private Enable4KImportBenchmark() {
    }

    public final boolean getVALUE() {
        return VALUE;
    }

    public final boolean enable() {
        return C10193n.m20607a().mo18204a(Enable4KImportBenchmark.class, "enable_4k_import_benchmark", C10181b.m20511a().mo18175c().getEnable4kImportBenchmark(), false);
    }
}
