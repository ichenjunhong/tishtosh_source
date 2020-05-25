package com.p683ss.android.ugc.aweme.notice.repo.list.api;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.api.NoticeApi */
public interface NoticeApi {

    /* renamed from: a */
    public static final C38085a f96880a = C38085a.f96881a;

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.list.api.NoticeApi$a */
    public static final class C38085a {

        /* renamed from: a */
        static final /* synthetic */ C38085a f96881a = new C38085a();

        private C38085a() {
        }
    }

    @C53084o(mo110612a = "/aweme/v1/notice/del/")
    C2201v<BaseResponse> deleteNotice(@C53089t(mo110619a = "notice_id") String str);

    @C53075f(mo110603a = "https://api.tiktokv.com/aweme/v2/game/entry/")
    C2201v<Object> fetchGameCenter();

    @C53075f(mo110603a = "https://api.tiktokv.com/aweme/v1/notice/")
    C2201v<NoticeResponse> fetchNotice(@C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "notice_group") int i2, @C53089t(mo110619a = "top_group") Integer num, @C53089t(mo110619a = "is_mark_read") int i3, @C53089t(mo110619a = "address_book_access") int i4, @C53089t(mo110619a = "gps_access") int i5);

    @C53075f(mo110603a = "https://api.tiktokv.com/aweme/v1/notice/")
    C2201v<NoticeResponse> markAsRead(@C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "notice_group") int i2, @C53089t(mo110619a = "top_group") Integer num, @C53089t(mo110619a = "is_mark_read") int i3, @C53089t(mo110619a = "address_book_access") int i4, @C53089t(mo110619a = "gps_access") int i5);

    @C53075f(mo110603a = "https://api.tiktokv.com/aweme/v2/game/subscribe/")
    C2201v<BaseResponse> reportSubscription(@C53089t(mo110619a = "op_type") int i);
}
