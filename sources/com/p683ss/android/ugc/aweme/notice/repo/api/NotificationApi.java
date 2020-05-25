package com.p683ss.android.ugc.aweme.notice.repo.api;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.notice.api.bean.NoticeList;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.api.NotificationApi */
public final class NotificationApi {

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.api.NotificationApi$INotificationApi */
    public interface INotificationApi {
        @C12706h(mo23876a = "/aweme/v1/feedback/cancel/")
        C12690b<String> cancelFeedback();

        @C12706h(mo23876a = "/aweme/v1/notice/count/")
        C12690b<NoticeList> query(@C12724z(mo23894a = "source") int i);
    }
}
