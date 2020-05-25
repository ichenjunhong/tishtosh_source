package com.bytedance.android.live.core.p230g;

import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.SystemClock;
import com.bytedance.android.live.core.performance.C3973a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.bytedance.android.live.core.g.x */
public final class C3920x {

    /* renamed from: a */
    private static final int[] f10931a = {0, 192, 290, UnReadVideoExperiment.LIKE_USER_LIST, PreloadTask.BYTE_UNIT_NUMBER, 1536, 2048};

    /* renamed from: b */
    private static final int[] f10932b = {0, 528, 620, 1020, 1220, 1520, 2020};

    /* renamed from: c */
    private static long f10933c = -1;

    /* renamed from: d */
    private static String f10934d = "";

    /* renamed from: a */
    public static long m9896a() {
        MemoryInfo memoryInfo = new MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return (long) memoryInfo.getTotalPss();
    }

    /* renamed from: a */
    public static String m9897a(String str) {
        if (SystemClock.elapsedRealtime() - f10933c > 5000) {
            f10934d = String.valueOf(C3973a.m10055a());
            f10933c = SystemClock.elapsedRealtime();
        }
        return f10934d;
    }
}
