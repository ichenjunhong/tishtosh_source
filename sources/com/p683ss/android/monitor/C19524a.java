package com.p683ss.android.monitor;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.settings.DmtLikoAnalysisConfig;
import com.p683ss.android.ugc.aweme.settings.EnableUploadHporfSettings;
import com.p683ss.android.ugc.aweme.settings.LikoAnalysisConfig;
import java.io.File;

/* renamed from: com.ss.android.monitor.a */
public final class C19524a {
    /* renamed from: b */
    public static boolean m47805b() {
        try {
            if (C32816h.m75716b().getMtLocalAnalysisHprof().intValue() == 1) {
                return true;
            }
            return false;
        } catch (C10174a unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m47806c() {
        return C10193n.m20607a().mo18204a(EnableUploadHporfSettings.class, "enable_upload_hporf", C10181b.m20511a().mo18175c().getEnableUploadHporf(), false);
    }

    /* renamed from: a */
    public static File m47804a() {
        String absolutePath = C11010c.m22280a().getFilesDir().getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        sb.append("/aweme_monitor");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: d */
    public static LikoAnalysisConfig m47807d() {
        LikoAnalysisConfig likoAnalysisConfig;
        try {
            likoAnalysisConfig = (LikoAnalysisConfig) C10193n.m20607a().mo18202a(DmtLikoAnalysisConfig.class, "dmt_liko_analysis_config", C10181b.m20511a().mo18175c().getDmtLikoAnalysisConfig(), "com.ss.android.ugc.aweme.settings.LikoAnalysisConfig", LikoAnalysisConfig.class);
        } catch (Throwable unused) {
            likoAnalysisConfig = null;
        }
        if (likoAnalysisConfig == null) {
            return new LikoAnalysisConfig();
        }
        return likoAnalysisConfig;
    }
}
