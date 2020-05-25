package com.p683ss.android.ugc.aweme.video;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.player.p2051ab.C38843a;
import com.p683ss.android.ugc.aweme.video.experiment.DetailFeedUseIndependentPlayerExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.MultiPlayerExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerRefactorExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerTypeExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerTypeV2Experiment;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;

/* renamed from: com.ss.android.ugc.aweme.video.o */
public class C48069o {

    /* renamed from: a */
    public static final boolean f120792a = C10181b.m20511a().mo18172a(MultiPlayerExperiment.class, true, "enable_multi_player", 31744, false);

    /* renamed from: b */
    public static final boolean f120793b = C10181b.m20511a().mo18172a(DetailFeedUseIndependentPlayerExperiment.class, true, "detail_feed_use_independent_player", 31744, false);

    /* renamed from: c */
    private static boolean f120794c = C10181b.m20511a().mo18172a(PlayerRefactorExperiment.class, true, "player_refactor", 31744, false);

    /* renamed from: d */
    private static boolean f120795d = false;

    /* renamed from: I */
    public static final boolean m104087I() {
        return f120794c;
    }

    /* renamed from: L */
    public static boolean m104090L() {
        if (f120795d || f120793b) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static C38843a m104088J() {
        try {
            return (C38843a) C10181b.m20511a().mo18170a(PlayerTypeV2Experiment.class, true, "player_type_v2", 31744, C38843a.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: K */
    public static C50116c m104089K() {
        if (m104088J() == null && mo95242a() == 6) {
            return C50116c.TT_HARDWARE;
        }
        return C50116c.TT;
    }

    /* renamed from: a */
    private static int mo95242a() {
        return C10181b.m20511a().mo18168a(PlayerTypeExperiment.class, true, "player_type", 31744, 0);
    }

    /* renamed from: a */
    public static void m104092a(boolean z) {
        f120795d = z;
    }
}
