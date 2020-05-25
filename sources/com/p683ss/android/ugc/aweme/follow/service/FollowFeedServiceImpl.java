package com.p683ss.android.ugc.aweme.follow.service;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.oftenwatch.C31876b;
import com.p683ss.android.ugc.aweme.follow.presenter.C31877a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.service.IFollowFeedService;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl */
public final class FollowFeedServiceImpl implements IFollowFeedService {
    public final C31876b getOftenWatchAwemeService() {
        return C31876b.f83266a;
    }

    public static IFollowFeedService createIFollowFeedServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IFollowFeedService.class);
        if (a != null) {
            return (IFollowFeedService) a;
        }
        if (C27991b.f73500bd == null) {
            synchronized (IFollowFeedService.class) {
                if (C27991b.f73500bd == null) {
                    C27991b.f73500bd = new FollowFeedServiceImpl();
                }
            }
        }
        return (FollowFeedServiceImpl) C27991b.f73500bd;
    }

    public final List<Aweme> getAwemes(List<? extends FollowFeed> list) {
        C52711k.m112240b(list, "list");
        List<Aweme> a = C31877a.m74301a(list);
        C52711k.m112236a((Object) a, "FollowFeedModel.getAwemes(list)");
        return a;
    }
}
