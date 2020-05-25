package com.p683ss.android.ugc.aweme.familiar.experiment;

import com.bytedance.ies.abmock.C10181b;

/* renamed from: com.ss.android.ugc.aweme.familiar.experiment.b */
public final class C29645b {

    /* renamed from: a */
    public static final C29645b f77507a = new C29645b();

    private C29645b() {
    }

    /* renamed from: a */
    public static int m69693a() {
        return C10181b.m20511a().mo18168a(FamiliarPushNotificationStrategy.class, true, "push_switch_category", 31744, 0);
    }

    /* renamed from: c */
    private static int m69694c() {
        return C10181b.m20511a().mo18168a(FamiliarFeedStrategyExperiment.class, true, "familiar_feed_strategy", 31744, 0);
    }

    /* renamed from: b */
    public final boolean mo59864b() {
        boolean z;
        if (m69694c() == 1 || m69694c() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || C10181b.m20511a().mo18168a(FamiliarFeedStyleExperiment.class, true, "familiar_feed_style", 31744, 0) != 1) {
            return false;
        }
        return true;
    }
}
