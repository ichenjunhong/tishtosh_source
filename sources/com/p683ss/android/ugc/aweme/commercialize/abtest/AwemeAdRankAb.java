package com.p683ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26125h;
import p2628d.p2639f.p2641b.C52711k;

@C10178a(mo18163a = "aweme_ad_rank")
/* renamed from: com.ss.android.ugc.aweme.commercialize.abtest.AwemeAdRankAb */
public final class AwemeAdRankAb {
    @C10179b(mo18165a = true)
    private static final C26125h DISABLE = C26125h.DEFAULT_DISABLE_VERSION;
    @C10179b
    private static final C26125h ENABLE = C26125h.DEFAULT_ONLINE_VERSION;
    public static final AwemeAdRankAb INSTANCE = new AwemeAdRankAb();
    @C10179b
    private static final C26125h TEST_ONLY = C26125h.DEFAULT_TEST_VERSION;

    private AwemeAdRankAb() {
    }

    /* renamed from: a */
    public static final C26125h m62127a() {
        try {
            Object a = C10181b.m20511a().mo18170a(AwemeAdRankAb.class, true, "aweme_ad_rank", 31744, C26125h.class);
            C52711k.m112236a(a, "ABManager.getInstance().…wemeAdRankAb::class.java)");
            return (C26125h) a;
        } catch (Throwable unused) {
            return DISABLE;
        }
    }
}
