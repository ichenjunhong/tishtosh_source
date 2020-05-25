package com.p683ss.android.ugc.aweme.feed.p1718d;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;

/* renamed from: com.ss.android.ugc.aweme.feed.d.b */
public final class C30179b {
    /* renamed from: a */
    public static void m70792a(Aweme aweme) {
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
