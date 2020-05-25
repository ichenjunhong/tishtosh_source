package com.p683ss.android.ugc.aweme.notice;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.notice.api.p2007c.C38044a;
import com.p683ss.android.ugc.aweme.notice.api.p2007c.C38045b;
import com.p683ss.android.ugc.aweme.notification.C38171e;
import com.p683ss.android.ugc.aweme.notification.bridgeservice.I18nNoticeBridgeService;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;

/* renamed from: com.ss.android.ugc.aweme.notice.b */
public final class C38079b implements C38045b {
    /* renamed from: c */
    public static C38045b m85154c() {
        if (C27991b.f73526v == null) {
            synchronized (C38045b.class) {
                if (C27991b.f73526v == null) {
                    C27991b.f73526v = C27628bo.m66317l();
                }
            }
        }
        return (C38045b) C27991b.f73526v;
    }

    /* renamed from: b */
    public final C38044a mo77572b() {
        return new C38171e();
    }

    /* renamed from: a */
    public final <T extends C23526a> Class<? extends T> mo77571a() {
        return I18nNoticeBridgeService.createINoticeBridgeServicebyMonsterPlugin().getNoticeFragmentClass();
    }
}
