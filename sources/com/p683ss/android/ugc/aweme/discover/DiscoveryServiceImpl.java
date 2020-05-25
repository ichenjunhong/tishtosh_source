package com.p683ss.android.ugc.aweme.discover;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.discover.p1659ui.HotSearchAndDiscoveryFragment2;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28665b;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28667c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.DiscoveryServiceImpl */
public final class DiscoveryServiceImpl implements IDiscoveryService {
    public final boolean checkHitRankByAweme(Aweme aweme, int i) {
        return false;
    }

    public final boolean checkHitRankByUser(User user, int i) {
        return false;
    }

    public final Class<?> getHotSearchAndDiscoverFragment2() {
        return HotSearchAndDiscoveryFragment2.class;
    }

    public final boolean isSearchMixUseFeedStyle() {
        return false;
    }

    public final C27939e getItemListChangeViewRefHolder() {
        return C28665b.f75234b;
    }

    public final C27940f getMixSearchRNWebViewRefHolder() {
        return C28667c.f75239c;
    }

    public final C27721d getDiscoverFragment() {
        return I18nBridgeService.getBridgeService_Monster().getDiscoverFragment();
    }

    public static IDiscoveryService createIDiscoveryServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IDiscoveryService.class);
        if (a != null) {
            return (IDiscoveryService) a;
        }
        if (C27991b.f73452aI == null) {
            synchronized (IDiscoveryService.class) {
                if (C27991b.f73452aI == null) {
                    C27991b.f73452aI = new DiscoveryServiceImpl();
                }
            }
        }
        return (DiscoveryServiceImpl) C27991b.f73452aI;
    }

    public final boolean handleBackPressed(Fragment fragment) {
        C52711k.m112240b(fragment, "fragment");
        return ((HotSearchAndDiscoveryFragment2) fragment).mo58066r();
    }

    public final void tryRequestRefresh(Fragment fragment) {
        C52711k.m112240b(fragment, "fragment");
        ((HotSearchAndDiscoveryFragment2) fragment).mo58067s();
    }
}
