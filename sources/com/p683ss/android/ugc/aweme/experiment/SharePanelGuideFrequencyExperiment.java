package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "share_panel_guide_frequency_limit")
/* renamed from: com.ss.android.ugc.aweme.experiment.SharePanelGuideFrequencyExperiment */
public final class SharePanelGuideFrequencyExperiment {
    @C10179b
    public static final int GROUP_1_DAY = 1;
    @C10179b
    public static final int GROUP_2_DAY = 2;
    public static final SharePanelGuideFrequencyExperiment INSTANCE = new SharePanelGuideFrequencyExperiment();
    @C10179b(mo18165a = true)
    public static final int ONLINE = 0;

    private SharePanelGuideFrequencyExperiment() {
    }

    /* renamed from: a */
    public static int m69628a() {
        return C10181b.m20511a().mo18168a(SharePanelGuideFrequencyExperiment.class, true, "share_panel_guide_frequency_limit", 31744, 0);
    }
}
