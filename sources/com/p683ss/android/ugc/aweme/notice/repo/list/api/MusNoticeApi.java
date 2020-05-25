package com.p683ss.android.ugc.aweme.notice.repo.list.api;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38101n;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.api.MusNoticeApi */
public interface MusNoticeApi {

    /* renamed from: a */
    public static final C38084a f96878a = C38084a.f96879a;

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.list.api.MusNoticeApi$a */
    public static final class C38084a {

        /* renamed from: a */
        static final /* synthetic */ C38084a f96879a = new C38084a();

        private C38084a() {
        }
    }

    @C53075f(mo110603a = "/aweme/v1/notice/list/message/")
    C2201v<MessageResponse> fetchNotice(@C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "notice_group") int i2, @C53089t(mo110619a = "top_group") Integer num, @C53089t(mo110619a = "is_mark_read") int i3);

    @C53075f(mo110603a = "/aweme/v1/room/recommended/avatars/")
    C2201v<C38101n> fetchRecommendAvatars();
}
