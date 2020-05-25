package com.p683ss.android.ugc.aweme.notification.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse;
import com.p683ss.android.ugc.aweme.notice.repo.p2010a.C38081a;
import com.p683ss.android.ugc.aweme.notification.p2012b.C38152b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.notification.api.NoticeApiManager */
public final class NoticeApiManager {

    /* renamed from: a */
    private static NoticeApi f97153a = ((NoticeApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(TutorialVideoApiManager.f96873a).create(NoticeApi.class));

    /* renamed from: com.ss.android.ugc.aweme.notification.api.NoticeApiManager$NoticeApi */
    interface NoticeApi {
        @C53084o(mo110612a = "/aweme/v1/notice/del/")
        C0013i<BaseResponse> deleteNotice(@C53089t(mo110619a = "notice_id") String str);

        @C53075f(mo110603a = "/aweme/v1/digg/list/")
        C0013i<C38152b> fetchLikeList(@C53089t(mo110619a = "max_cursor") long j, @C53089t(mo110619a = "min_cursor") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "is_new") boolean z, @C53089t(mo110619a = "digg_type") int i2, @C53089t(mo110619a = "ref_id") String str);

        @C53075f(mo110603a = "/aweme/v1/notice/")
        C17832m<NoticeResponse> fetchNotice(@C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "notice_group") int i2, @C53089t(mo110619a = "top_group") Integer num, @C53089t(mo110619a = "is_mark_read") int i3, @C53089t(mo110619a = "address_book_access") Integer num2, @C53089t(mo110619a = "gps_access") Integer num3, @C53089t(mo110619a = "notice_style") Integer num4);

        @C53075f(mo110603a = "/aweme/v1/notice/")
        C2201v<NoticeResponse> markAsRead(@C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "notice_group") int i2, @C53089t(mo110619a = "top_group") Integer num, @C53089t(mo110619a = "is_mark_read") int i3, @C53089t(mo110619a = "address_book_access") Integer num2, @C53089t(mo110619a = "gps_access") Integer num3);
    }

    /* renamed from: a */
    public static void m85271a(String str) {
        f97153a.deleteNotice(str);
    }

    /* renamed from: a */
    public static C2201v<NoticeResponse> m85269a(Integer num) {
        return f97153a.markAsRead(0, 0, 0, num.intValue(), null, 1, Integer.valueOf(C38081a.m85158a()), Integer.valueOf(C38081a.m85160b()));
    }

    /* renamed from: a */
    public static C0013i<C38152b> m85268a(long j, long j2, int i, boolean z, int i2, String str) {
        return f97153a.fetchLikeList(j, j2, 20, z, i2, str);
    }

    /* renamed from: a */
    public static NoticeResponse m85270a(long j, long j2, int i, int i2, Integer num, int i3, int i4, int i5) throws Exception {
        try {
            return (NoticeResponse) f97153a.fetchNotice(j, j2, i, i2, num, i3, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(C38147a.getNoticeStyle())).get();
        } catch (ExecutionException e) {
            throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
        }
    }
}
