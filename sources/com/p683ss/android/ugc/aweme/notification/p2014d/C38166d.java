package com.p683ss.android.ugc.aweme.notification.p2014d;

import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.C38213i.C38214a;
import com.p683ss.android.ugc.aweme.notification.p2016f.C38188d;
import com.p683ss.android.ugc.aweme.notification.p2016f.C38193f;
import com.p683ss.android.ugc.aweme.notification.util.C38433e;
import com.p683ss.android.ugc.aweme.notification.util.C38433e.C38436b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;

/* renamed from: com.ss.android.ugc.aweme.notification.d.d */
final /* synthetic */ class C38166d implements C38436b {

    /* renamed from: a */
    private final C38163a f97205a;

    C38166d(C38163a aVar) {
        this.f97205a = aVar;
    }

    /* renamed from: a */
    public final void mo78170a(BaseNotice baseNotice) {
        C38163a aVar = this.f97205a;
        int c = C36782d.m82775a().mo75940c(47);
        C38193f fVar = new C38193f();
        if (aVar.mo78163a(baseNotice, (C38188d) fVar, c)) {
            return;
        }
        if (c > 0 || !C38214a.m85384a(47, baseNotice.getCreateTime())) {
            C38433e.m85751a((C35456b) fVar, baseNotice);
            fVar.f91119j = c;
            C41049a.m90714a().updateNoticeSession(fVar);
        }
    }
}
