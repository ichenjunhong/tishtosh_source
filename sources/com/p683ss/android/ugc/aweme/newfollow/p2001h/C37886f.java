package com.p683ss.android.ugc.aweme.newfollow.p2001h;

import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p683ss.android.ugc.aweme.forward.model.C32415c;
import com.p683ss.android.ugc.aweme.forward.model.UserDynamicList;
import java.util.ArrayList;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.h.f */
final /* synthetic */ class C37886f implements C0011g {

    /* renamed from: a */
    private final C37882b f96444a;

    C37886f(C37882b bVar) {
        this.f96444a = bVar;
    }

    public final Object then(C0013i iVar) {
        C37882b bVar = this.f96444a;
        UserDynamicList userDynamicList = (UserDynamicList) iVar.mo34e();
        if (userDynamicList == null || userDynamicList.getDynamicList() == null) {
            return new FollowFeedList();
        }
        FollowFeedList followFeedList = new FollowFeedList();
        ArrayList arrayList = new ArrayList();
        for (C32415c cVar : userDynamicList.getDynamicList()) {
            FollowFeed followFeed = new FollowFeed();
            if (cVar != null) {
                if (cVar.getItemType() != 1) {
                    followFeed.setAweme(cVar.getAweme());
                    followFeed.setCommentList(cVar.getComments());
                    followFeed.setFeedType(65280);
                } else {
                    followFeed.setLikeCount(cVar.getLikeCount());
                    followFeed.setFavorites(cVar.getFavorites());
                    followFeed.setBlockFavoriteTime(cVar.getBlockFavoriteTime());
                    followFeed.setFeedType(65286);
                    followFeed.setFavoriteIds(cVar.getFavoriteIds());
                }
            }
            arrayList.add(followFeed);
        }
        followFeedList.setItems(arrayList);
        followFeedList.setHasMore(userDynamicList.getHasMore());
        followFeedList.setMaxCursor(userDynamicList.getMaxCursor());
        followFeedList.setMinCursor(userDynamicList.getMinCursor());
        return followFeedList;
    }
}
