package com.p683ss.android.ugc.aweme.p1807im.service.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "refine_video_im_share")
/* renamed from: com.ss.android.ugc.aweme.im.service.experiment.RefineShareInSiteExperiment */
public final class RefineShareInSiteExperiment {
    @C10179b
    public static final int CASE_1_MORE_PANEL_1 = 1;
    @C10179b
    public static final int CASE_1_MORE_PANEL_2 = 3;
    @C10179b
    public static final int CASE_2_MORE_PANEL_1 = 2;
    @C10179b
    public static final int CASE_2_MORE_PANEL_2 = 4;
    @C10179b
    public static final int CASE_3 = 5;
    public static final RefineShareInSiteExperiment INSTANCE = new RefineShareInSiteExperiment();
    @C10179b(mo18165a = true)
    public static final int ONLINE = 0;

    private RefineShareInSiteExperiment() {
    }

    /* renamed from: b */
    public final boolean mo73737b() {
        int a = m80104a();
        if (1 <= a && 5 > a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m80104a() {
        return C10181b.m20511a().mo18168a(RefineShareInSiteExperiment.class, true, "refine_video_im_share", 31744, 0);
    }

    /* renamed from: c */
    public final boolean mo73738c() {
        if (m80104a() == 1 || m80104a() == 3 || m80104a() == 2 || m80104a() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo73740e() {
        if (m80104a() == 2 || m80104a() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo73739d() {
        if (m80104a() == 1 || m80104a() == 3 || m80104a() == 2 || m80104a() == 4 || m80104a() == 5) {
            return true;
        }
        return false;
    }
}
