package com.p683ss.android.ugc.aweme.notification.p2014d;

import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.C38213i.C38214a;
import com.p683ss.android.ugc.aweme.notification.p2016f.C38188d;
import com.p683ss.android.ugc.aweme.notification.p2016f.C38190e;
import com.p683ss.android.ugc.aweme.notification.util.C38433e;
import com.p683ss.android.ugc.aweme.notification.util.C38433e.C38436b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;

/* renamed from: com.ss.android.ugc.aweme.notification.d.c */
final /* synthetic */ class C38165c implements C38436b {

    /* renamed from: a */
    private final C38163a f97204a;

    C38165c(C38163a aVar) {
        this.f97204a = aVar;
    }

    /* renamed from: a */
    public final void mo78170a(BaseNotice baseNotice) {
        C38163a aVar = this.f97204a;
        int c = C36782d.m82775a().mo75940c(46);
        C38190e eVar = new C38190e();
        if (!aVar.mo78163a(baseNotice, (C38188d) eVar, c) && !C38214a.m85384a(46, baseNotice.getCreateTime())) {
            C38433e.m85751a((C35456b) eVar, baseNotice);
            eVar.f91119j = c;
            C41049a.m90714a().updateNoticeSession(eVar);
        }
    }
}
