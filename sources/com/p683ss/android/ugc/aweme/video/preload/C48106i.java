package com.p683ss.android.ugc.aweme.video.preload;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.video.preload.experiment.EnablePreloadBackgroundExperiment;

/* renamed from: com.ss.android.ugc.aweme.video.preload.i */
public final class C48106i {
    /* renamed from: a */
    public static boolean m104190a() {
        if (!C23794bh.m58398l().mo47708a() || C10181b.m20511a().mo18168a(EnablePreloadBackgroundExperiment.class, true, "enable_preload_background", 31744, 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m104189a(Aweme aweme) {
        C48107j.m104193f().mo95348b();
        C48107j.m104193f().mo95405a(aweme);
        if (aweme != null && aweme.getVideo() != null) {
            aweme.getVideo().setSourceId(aweme.getAid());
            VideoUrlModel properPlayAddr = aweme.getVideo().getProperPlayAddr();
            if (properPlayAddr != null) {
                properPlayAddr.setSourceId(aweme.getAid());
            }
        }
    }
}
