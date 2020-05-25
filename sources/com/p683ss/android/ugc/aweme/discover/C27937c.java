package com.p683ss.android.ugc.aweme.discover;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.c */
public final class C27937c implements IDiscoveryService {

    /* renamed from: a */
    public static final C27937c f73358a = new C27937c();

    /* renamed from: b */
    private final /* synthetic */ IDiscoveryService f73359b;

    public final boolean checkHitRankByAweme(Aweme aweme, int i) {
        return this.f73359b.checkHitRankByAweme(aweme, i);
    }

    public final boolean checkHitRankByUser(User user, int i) {
        return this.f73359b.checkHitRankByUser(user, i);
    }

    public final C27721d getDiscoverFragment() {
        return this.f73359b.getDiscoverFragment();
    }

    public final Class<?> getHotSearchAndDiscoverFragment2() {
        return this.f73359b.getHotSearchAndDiscoverFragment2();
    }

    public final C27939e getItemListChangeViewRefHolder() {
        return this.f73359b.getItemListChangeViewRefHolder();
    }

    public final C27940f getMixSearchRNWebViewRefHolder() {
        return this.f73359b.getMixSearchRNWebViewRefHolder();
    }

    public final boolean handleBackPressed(Fragment fragment) {
        C52711k.m112240b(fragment, "fragment");
        return this.f73359b.handleBackPressed(fragment);
    }

    public final boolean isSearchMixUseFeedStyle() {
        return this.f73359b.isSearchMixUseFeedStyle();
    }

    public final void tryRequestRefresh(Fragment fragment) {
        C52711k.m112240b(fragment, "fragment");
        this.f73359b.tryRequestRefresh(fragment);
    }

    private C27937c() {
        IDiscoveryService createIDiscoveryServicebyMonsterPlugin = DiscoveryServiceImpl.createIDiscoveryServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIDiscoveryServicebyMonsterPlugin, "ServiceManager.get().get…overyService::class.java)");
        this.f73359b = createIDiscoveryServicebyMonsterPlugin;
    }
}
