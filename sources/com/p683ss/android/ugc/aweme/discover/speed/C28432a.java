package com.p683ss.android.ugc.aweme.discover.speed;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.service.MusicDetailService;
import com.p683ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.speed.a */
public final class C28432a {

    /* renamed from: a */
    public static boolean f74711a;

    /* renamed from: b */
    public static final C28432a f74712b = new C28432a();

    private C28432a() {
    }

    /* renamed from: a */
    public static final boolean m67476a() {
        if (C10181b.m20511a().mo18168a(DiscoverSpeedExperiment.class, true, "discover_speed_detail", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m67475a(C26875a<Aweme, ?> aVar, List<? extends Aweme> list) {
        User user;
        C52711k.m112240b(aVar, "model");
        C52711k.m112240b(list, "items");
        if (m67476a()) {
            for (Aweme aweme : list) {
                if (aweme != null) {
                    user = aweme.getAuthor();
                } else {
                    user = null;
                }
                if (user != null) {
                    if (aweme.getStatistics() == null) {
                    }
                }
                return;
            }
            MusicDetailService.createIMusicDetailServicebyMonsterPlugin().mobRefreshInMusicAweme(aVar, list);
            ChallengeDetailServiceImpl.createIChallengeDetailServicebyMonsterPlugin().mobRefreshInChallengeAweme(aVar, list);
            ProfileServiceImpl.createIProfileServicebyMonsterPlugin().mobRefreshInProfileAweme(aVar, list);
        }
    }
}
