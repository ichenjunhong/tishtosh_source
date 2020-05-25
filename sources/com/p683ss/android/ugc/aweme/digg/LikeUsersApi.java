package com.p683ss.android.ugc.aweme.digg;

import com.p683ss.android.ugc.aweme.digg.p1633a.C27686a;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersApi */
public interface LikeUsersApi {
    @C53075f(mo110603a = "/aweme/v1/favorite/list/")
    C0013i<C27686a> getFavoriteList(@C53089t(mo110619a = "item_id") String str, @C53089t(mo110619a = "item_type") int i, @C53089t(mo110619a = "max_cursor") long j, @C53089t(mo110619a = "min_cursor") long j2, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "insert_ids") String str2, @C53089t(mo110619a = "address_book_access") int i3, @C53089t(mo110619a = "hotsoon_filtered_count") int i4, @C53089t(mo110619a = "hotsoon_has_more") int i5);
}
