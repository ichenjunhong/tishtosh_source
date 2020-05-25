package com.p683ss.android.ugc.aweme.message.p1949b;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse;
import com.p683ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.p683ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.Collection;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.message.b.c */
final /* synthetic */ class C36781c implements C0011g {

    /* renamed from: a */
    private final C36780b f93997a;

    C36781c(C36780b bVar) {
        this.f93997a = bVar;
    }

    public final Object then(C0013i iVar) {
        C36780b bVar = this.f93997a;
        if (iVar != null && iVar.mo26b()) {
            MultiUserNoticeCountResponse multiUserNoticeCountResponse = (MultiUserNoticeCountResponse) iVar.mo34e();
            if (multiUserNoticeCountResponse != null && !C9376b.m18558a((Collection<T>) multiUserNoticeCountResponse.noticeLists)) {
                bVar.f93996a.clear();
                for (NoticeList noticeList : multiUserNoticeCountResponse.noticeLists) {
                    int i = 0;
                    for (NoticeCount noticeCount : noticeList.getItems()) {
                        int group = noticeCount.getGroup();
                        if (group == 3 || group == 7 || group == 6 || group == 2) {
                            i += noticeCount.getCount();
                        }
                    }
                    bVar.f93996a.put(noticeList.getUserId(), Integer.valueOf(i));
                }
            }
        }
        return null;
    }
}
