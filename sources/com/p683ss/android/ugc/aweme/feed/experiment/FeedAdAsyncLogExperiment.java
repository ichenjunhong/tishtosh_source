package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "feed_ad_async_log")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.FeedAdAsyncLogExperiment */
public final class FeedAdAsyncLogExperiment {
    @C10179b(mo18165a = true)
    private static final boolean DISABLE = false;
    @C10179b
    private static final boolean ENABLE = true;
    public static final FeedAdAsyncLogExperiment INSTANCE = new FeedAdAsyncLogExperiment();

    private FeedAdAsyncLogExperiment() {
    }

    /* renamed from: a */
    public static final boolean m70945a() {
        try {
            return C10181b.m20511a().mo18172a(FeedAdAsyncLogExperiment.class, true, "feed_ad_async_log", 31744, false);
        } catch (Throwable unused) {
            return DISABLE;
        }
    }
}
