package com.p683ss.android.ugc.aweme.service;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.oftenwatch.C31875a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.service.a */
public final class C41488a implements IFollowFeedService {

    /* renamed from: a */
    public static final C41488a f105155a = new C41488a();

    /* renamed from: b */
    private final /* synthetic */ IFollowFeedService f105156b;

    public final List<Aweme> getAwemes(List<? extends FollowFeed> list) {
        C52711k.m112240b(list, "list");
        return this.f105156b.getAwemes(list);
    }

    public final C31875a getOftenWatchAwemeService() {
        return this.f105156b.getOftenWatchAwemeService();
    }

    private C41488a() {
        IFollowFeedService createIFollowFeedServicebyMonsterPlugin = FollowFeedServiceImpl.createIFollowFeedServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIFollowFeedServicebyMonsterPlugin, "ServiceManager.get().get…wFeedService::class.java)");
        this.f105156b = createIFollowFeedServicebyMonsterPlugin;
    }
}
