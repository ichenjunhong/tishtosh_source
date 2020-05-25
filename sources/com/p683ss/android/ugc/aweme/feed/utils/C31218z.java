package com.p683ss.android.ugc.aweme.feed.utils;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.feed.experiment.NearbySelectDistanceExperiment;
import com.p683ss.android.ugc.aweme.feed.model.nearby.NearbyDistance;
import com.p683ss.android.ugc.aweme.feed.model.nearby.NearbyDistanceSettings;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.z */
public final class C31218z {

    /* renamed from: a */
    public static final C31218z f81664a = new C31218z();

    private C31218z() {
    }

    /* renamed from: a */
    public static final int m72908a() {
        NearbyDistance nearbyDistance;
        int i = 0;
        if (C10181b.m20511a().mo18168a(NearbySelectDistanceExperiment.class, true, "is_select_distance", 31744, 0) == 0) {
            return 0;
        }
        try {
            nearbyDistance = (NearbyDistance) C10193n.m20607a().mo18202a(NearbyDistanceSettings.class, "nearby_distance", C10181b.m20511a().mo18175c().getNearbyDistance(), "com.ss.android.ugc.aweme.feed.model.nearby.NearbyDistance", NearbyDistance.class);
            if (nearbyDistance == null) {
            }
        } catch (Throwable unused) {
        } finally {
            new NearbyDistance();
        }
        int i2 = nearbyDistance.maxDistance;
        Keva repo = Keva.getRepo("nearby");
        C52711k.m112236a((Object) repo, "Keva.getRepo(NEARBY_SP_NAME)");
        int i3 = repo.getInt("nearby_distance", i2);
        if (i3 < nearbyDistance.maxDistance) {
            if (i3 < nearbyDistance.minDistance) {
                i = nearbyDistance.minDistance;
            } else {
                i = i3;
            }
        }
        return i;
    }
}
