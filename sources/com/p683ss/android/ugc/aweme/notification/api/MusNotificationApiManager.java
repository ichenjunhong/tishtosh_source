package com.p683ss.android.ugc.aweme.notification.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38101n;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager */
public final class MusNotificationApiManager {

    /* renamed from: a */
    public static NoticeApi f97152a = ((NoticeApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://api.tiktokv.com/").create(NoticeApi.class));

    /* renamed from: com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager$NoticeApi */
    public interface NoticeApi {
        @C53084o(mo110612a = "/aweme/v1/notice/del/")
        C0013i<BaseResponse> deleteNotice(@C53089t(mo110619a = "notice_id") String str);

        @C53075f(mo110603a = "/aweme/v1/notice/list/message/")
        C17832m<MessageResponse> fetchNotice(@C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "notice_group") int i2, @C53089t(mo110619a = "top_group") Integer num, @C53089t(mo110619a = "is_mark_read") int i3, @C53089t(mo110619a = "notice_style") Integer num2);

        @C53075f(mo110603a = "/aweme/v1/notice/list/message/")
        C0013i<MessageResponse> fetchNoticeTask(@C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "notice_group") int i2, @C53089t(mo110619a = "top_group") Integer num, @C53089t(mo110619a = "is_mark_read") int i3, @C53089t(mo110619a = "notice_style") Integer num2);

        @C53075f(mo110603a = "/aweme/v1/room/recommended/avatars/")
        C0013i<C38101n> fetchRecommendAvatars();
    }

    /* renamed from: a */
    public static void m85267a(String str) {
        f97152a.deleteNotice(str).mo20a(null, (Executor) C0013i.f24a);
    }

    /* renamed from: a */
    public static MessageResponse m85266a(long j, long j2, int i, int i2, Integer num, int i3) throws Exception {
        try {
            return (MessageResponse) f97152a.fetchNotice(j, j2, 20, i2, num, 1, Integer.valueOf(C38147a.getNoticeStyle())).get();
        } catch (ExecutionException e) {
            throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
        }
    }
}
