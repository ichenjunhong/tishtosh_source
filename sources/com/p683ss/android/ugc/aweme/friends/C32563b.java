package com.p683ss.android.ugc.aweme.friends;

import com.p683ss.android.ugc.aweme.friends.api.SummonFriendApi.SummonFriendService;
import com.p683ss.android.ugc.aweme.friends.model.RecentFriendModel;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.friends.b */
public final class C32563b {
    /* renamed from: a */
    public static C2201v<RecentFriendModel> m75338a(SummonFriendService summonFriendService, int i, int i2) {
        return summonFriendService.queryFollowFriends4At(i, i2);
    }
}
