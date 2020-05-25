package com.p683ss.android.ugc.aweme.lancet;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.BenchmarkPerformanceSettings;

/* renamed from: com.ss.android.ugc.aweme.lancet.g */
public final class C18986g {

    /* renamed from: a */
    private static int f52291a = -1;

    /* renamed from: a */
    public static boolean m46164a() {
        if (f52291a == -1) {
            if (C10193n.m20607a().mo18204a(BenchmarkPerformanceSettings.class, "benchmark_poor_perf_device", C10181b.m20511a().mo18175c().getBenchmarkPoorPerfDevice(), false)) {
                f52291a = 1;
            } else {
                f52291a = 0;
            }
        }
        if (f52291a > 0) {
            return true;
        }
        return false;
    }
}
