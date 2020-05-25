package com.p683ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "new_download_ux")
/* renamed from: com.ss.android.ugc.aweme.share.libra.LongVideoDownloadOptimize */
public final class LongVideoDownloadOptimize {
    @C10179b(mo18165a = true)
    private static final int DISABLE_NEW_STYLE = 0;
    @C10179b
    private static final int ENABLE_NEW_STYLE = 1;
    public static final LongVideoDownloadOptimize INSTANCE = new LongVideoDownloadOptimize();

    private LongVideoDownloadOptimize() {
    }

    /* renamed from: a */
    public static boolean m92637a() {
        if (C10181b.m20511a().mo18168a(LongVideoDownloadOptimize.class, true, "new_download_ux", 31744, 0) == ENABLE_NEW_STYLE) {
            return true;
        }
        return false;
    }
}
