package com.p683ss.android.ugc.aweme.video.experiment;

import com.bytedance.ies.abmock.C10181b;

/* renamed from: com.ss.android.ugc.aweme.video.experiment.a */
public final class C48017a {

    /* renamed from: a */
    private static boolean f120686a;

    /* renamed from: a */
    public static boolean m103959a() {
        if (!f120686a && C10181b.m20511a().mo18168a(EnablePlayerALogExperiment.class, true, "enable_player_alog", 31744, 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m103960b() {
        return C10181b.m20511a().mo18168a(PreloadTypeExperiment.class, true, "preloader_type", 31744, 0);
    }

    /* renamed from: c */
    public static boolean m103961c() {
        if (C10181b.m20511a().mo18168a(EnableDynamicRateExperiment.class, true, "enable_dynamic_rate", 31744, 1) == 1) {
            return true;
        }
        return false;
    }
}
