package com.p683ss.android.ugc.aweme.commercialize.utils.p1584d;

import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.a */
public final class C26504a implements C26505b {

    /* renamed from: a */
    public static final C26504a f69814a = new C26504a();

    private C26504a() {
    }

    /* renamed from: a */
    public final long mo54191a() {
        if (C48121w.m104087I()) {
            C50130a a = C50130a.m108170a();
            C52711k.m112236a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
            return a.mo97928d();
        }
        C48021h M = C48121w.m104249M();
        C52711k.m112236a((Object) M, "PlayerManager.inst()");
        return M.mo95256n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m64084a(com.p683ss.android.ugc.aweme.feed.model.Aweme r4, com.p683ss.android.ugc.playerkit.videoview.C50158g r5) {
        /*
            boolean r0 = com.p683ss.android.ugc.aweme.video.C48121w.m104087I()
            if (r0 == 0) goto L_0x000d
            if (r5 == 0) goto L_0x000d
            long r0 = r5.mo60217ah()
            goto L_0x001a
        L_0x000d:
            com.ss.android.ugc.aweme.video.h r5 = com.p683ss.android.ugc.aweme.video.C48121w.m104249M()
            java.lang.String r0 = "PlayerManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            long r0 = r5.mo95251i()
        L_0x001a:
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0021
            return r0
        L_0x0021:
            if (r4 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.feed.model.Video r5 = r4.getVideo()
            if (r5 == 0) goto L_0x0032
            int r5 = r5.getDuration()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r5 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.model.Video r5 = r4.getVideo()
            java.lang.String r0 = "aweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            int r5 = r5.getDuration()
            if (r5 <= 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.model.Video r4 = r4.getVideo()
            java.lang.String r5 = "aweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            int r4 = r4.getDuration()
            long r4 = (long) r4
            return r4
        L_0x0053:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.p1584d.C26504a.m64084a(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.playerkit.videoview.g):long");
    }
}
