package com.p683ss.android.ugc.aweme.friends.api;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.friends.C32563b;
import com.p683ss.android.ugc.aweme.friends.model.FollowUserListModel;
import com.p683ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.friends.api.SummonFriendApi */
public final class SummonFriendApi {

    /* renamed from: a */
    public static final SummonFriendService f84783a = ((SummonFriendService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(SummonFriendService.class));

    /* renamed from: com.ss.android.ugc.aweme.friends.api.SummonFriendApi$SummonFriendService */
    public interface SummonFriendService {
        @C12706h(mo23876a = "/aweme/v1/user/following/list/")
        C12690b<FollowUserListModel> queryFollowFriends(@C12724z(mo23894a = "count") int i, @C12724z(mo23894a = "user_id") String str, @C12724z(mo23894a = "sec_user_id") String str2, @C12724z(mo23894a = "max_time") long j, @C12724z(mo23894a = "min_time") long j2, @C12724z(mo23894a = "address_book_access") int i2, @C12724z(mo23894a = "gps_access") int i3);

        @C12706h(mo23876a = "/aweme/v1/at/default/list/")
        C2201v<RecentFriendModel> queryFollowFriends4At(@C12724z(mo23894a = "count") int i, @C12724z(mo23894a = "cursor") int i2);

        @C12706h(mo23876a = "/aweme/v1/user/recent/contact/")
        C12690b<RecentFriendModel> queryRecentFriends();

        @C12706h(mo23876a = "/aweme/v1/user/recent/contact/")
        C2201v<RecentFriendModel> queryRecentFriends4At();

        @C12706h(mo23876a = "/aweme/v1/discover/search/")
        C12690b<SummonFriendList> searchFriends(@C12724z(mo23894a = "keyword") String str, @C12724z(mo23894a = "count") long j, @C12724z(mo23894a = "cursor") long j2, @C12724z(mo23894a = "type") int i, @C12724z(mo23894a = "search_source") String str2, @C12724z(mo23894a = "filter_block") int i2);

        @C12706h(mo23876a = "/aweme/v1/discover/search/")
        C2201v<SummonFriendList> searchFriends4At(@C12724z(mo23894a = "keyword") String str, @C12724z(mo23894a = "count") long j, @C12724z(mo23894a = "cursor") long j2, @C12724z(mo23894a = "type") int i, @C12724z(mo23894a = "search_source") String str2, @C12724z(mo23894a = "filter_block") int i2);
    }

    /* renamed from: a */
    public static RecentFriendModel m75333a() throws Exception {
        return (RecentFriendModel) f84783a.queryRecentFriends().execute().f33552b;
    }

    /* renamed from: a */
    public static C2201v<RecentFriendModel> m75331a(int i, int i2) {
        return C32563b.m75338a(f84783a, i, i2);
    }

    /* renamed from: a */
    public static SummonFriendList m75334a(String str, long j, long j2, String str2) throws Exception {
        return (SummonFriendList) f84783a.searchFriends(str, 20, j, 1, str2, 1).execute().f33552b;
    }

    /* renamed from: a */
    public static FollowUserListModel m75332a(int i, long j, long j2, String str, String str2, int i2, int i3) throws Exception {
        return (FollowUserListModel) f84783a.queryFollowFriends(10, str, str2, j, 0, i2, i3).execute().f33552b;
    }
}
