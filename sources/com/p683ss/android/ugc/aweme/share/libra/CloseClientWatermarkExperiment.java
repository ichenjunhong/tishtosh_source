package com.p683ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "close_client_watermark")
/* renamed from: com.ss.android.ugc.aweme.share.libra.CloseClientWatermarkExperiment */
public final class CloseClientWatermarkExperiment {
    @C10179b(mo18165a = true)
    private static final int DISABLED = 0;
    @C10179b
    private static final int ENABLED = 1;
    public static final CloseClientWatermarkExperiment INSTANCE = new CloseClientWatermarkExperiment();

    private CloseClientWatermarkExperiment() {
    }

    /* renamed from: a */
    public static boolean m92635a() {
        if (C10181b.m20511a().mo18168a(CloseClientWatermarkExperiment.class, true, "close_client_watermark", 31744, 0) == ENABLED) {
            return true;
        }
        return false;
    }
}
