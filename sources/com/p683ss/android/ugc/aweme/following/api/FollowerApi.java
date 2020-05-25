package com.p683ss.android.ugc.aweme.following.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.following.p1768a.C31995c;

/* renamed from: com.ss.android.ugc.aweme.following.api.FollowerApi */
public interface FollowerApi {
    @C12706h(mo23876a = "/aweme/v1/user/follower/list/")
    C17832m<C31995c> fetchFollowingList(@C12724z(mo23894a = "user_id") String str, @C12724z(mo23894a = "sec_user_id") String str2, @C12724z(mo23894a = "max_time") long j, @C12724z(mo23894a = "count") int i, @C12724z(mo23894a = "offset") int i2, @C12724z(mo23894a = "source_type") int i3, @C12724z(mo23894a = "address_book_access") int i4, @C12724z(mo23894a = "gps_access") int i5);
}
