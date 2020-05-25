package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "share_panel_guide_condition_limit")
/* renamed from: com.ss.android.ugc.aweme.experiment.SharePanelGuideConditionExperiment */
public final class SharePanelGuideConditionExperiment {
    @C10179b
    public static final int A_OR_B = 1;
    @C10179b
    public static final int A_OR_C = 2;
    @C10179b
    public static final int A_OR_C_AND_AFTER_3D = 3;
    public static final SharePanelGuideConditionExperiment INSTANCE = new SharePanelGuideConditionExperiment();
    @C10179b(mo18165a = true)
    public static final int Online = 0;

    private SharePanelGuideConditionExperiment() {
    }

    /* renamed from: a */
    public final boolean mo59614a() {
        if (m69626b() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m69626b() {
        return C10181b.m20511a().mo18168a(SharePanelGuideConditionExperiment.class, true, "share_panel_guide_condition_limit", 31744, 0);
    }
}
