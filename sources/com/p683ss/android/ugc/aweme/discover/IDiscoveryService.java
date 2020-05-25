package com.p683ss.android.ugc.aweme.discover;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.discover.IDiscoveryService */
public interface IDiscoveryService {
    boolean checkHitRankByAweme(Aweme aweme, int i);

    boolean checkHitRankByUser(User user, int i);

    C27721d getDiscoverFragment();

    Class<?> getHotSearchAndDiscoverFragment2();

    C27939e getItemListChangeViewRefHolder();

    C27940f getMixSearchRNWebViewRefHolder();

    boolean handleBackPressed(Fragment fragment);

    boolean isSearchMixUseFeedStyle();

    void tryRequestRefresh(Fragment fragment);
}
