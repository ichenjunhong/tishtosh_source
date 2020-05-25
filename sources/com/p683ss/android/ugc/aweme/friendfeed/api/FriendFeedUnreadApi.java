package com.p683ss.android.ugc.aweme.friendfeed.api;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.friendfeed.api.FriendFeedUnreadApi */
public final class FriendFeedUnreadApi {

    /* renamed from: a */
    private static final FriendFeedUnreadRetrofitApi f84602a = ((FriendFeedUnreadRetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(FriendFeedUnreadRetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.friendfeed.api.FriendFeedUnreadApi$FriendFeedUnreadRetrofitApi */
    interface FriendFeedUnreadRetrofitApi {
        @C53075f(mo110603a = "/aweme/v1/friend/feed/unread/")
        C0013i<Object> getFriendFeedUnread(@C53089t(mo110619a = "cold_start") int i);

        @C53075f(mo110603a = "/aweme/v1/friend/feed/unread/")
        C0013i<Object> getFriendFeedUnread(@C53089t(mo110619a = "cold_start") int i, @C53089t(mo110619a = "notice_group_type") int i2);
    }
}
