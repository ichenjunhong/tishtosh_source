package com.p683ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "enable_end_watermark_MT")
/* renamed from: com.ss.android.ugc.aweme.share.libra.MTEndWatermarkExperiment */
public final class MTEndWatermarkExperiment {
    @C10179b(mo18165a = true)
    private static final boolean DISABLED = false;
    @C10179b
    private static final boolean ENABLED = true;
    public static final MTEndWatermarkExperiment INSTANCE = new MTEndWatermarkExperiment();

    private MTEndWatermarkExperiment() {
    }

    /* renamed from: a */
    public static boolean m92638a() {
        return C10181b.m20511a().mo18172a(MTEndWatermarkExperiment.class, true, "enable_end_watermark_MT", 31744, false);
    }
}
