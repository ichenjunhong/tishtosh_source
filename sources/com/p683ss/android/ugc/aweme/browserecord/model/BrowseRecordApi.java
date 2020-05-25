package com.p683ss.android.ugc.aweme.browserecord.model;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.browserecord.model.BrowseRecordApi */
interface BrowseRecordApi {
    @C12706h(mo23876a = "/aweme/v1/familiar/video/visitor/list/")
    C2201v<C24043b> getBrowseListResponse(@C12724z(mo23894a = "aweme_id") String str, @C12724z(mo23894a = "count") int i, @C12724z(mo23894a = "address_book_access") int i2, @C12724z(mo23894a = "max_cursor") long j, @C12724z(mo23894a = "min_cursor") long j2);
}
