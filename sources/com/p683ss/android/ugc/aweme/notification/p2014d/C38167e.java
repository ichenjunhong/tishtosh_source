package com.p683ss.android.ugc.aweme.notification.p2014d;

import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.C38213i.C38214a;
import com.p683ss.android.ugc.aweme.notification.p2016f.C38185a;
import com.p683ss.android.ugc.aweme.notification.p2016f.C38188d;
import com.p683ss.android.ugc.aweme.notification.util.C38433e;
import com.p683ss.android.ugc.aweme.notification.util.C38433e.C38436b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;

/* renamed from: com.ss.android.ugc.aweme.notification.d.e */
final /* synthetic */ class C38167e implements C38436b {

    /* renamed from: a */
    private final C38163a f97206a;

    C38167e(C38163a aVar) {
        this.f97206a = aVar;
    }

    /* renamed from: a */
    public final void mo78170a(BaseNotice baseNotice) {
        C38163a aVar = this.f97206a;
        int c = C36782d.m82775a().mo75940c(21);
        C38185a aVar2 = new C38185a();
        if (!aVar.mo78163a(baseNotice, (C38188d) aVar2, c) && !C38214a.m85384a(21, baseNotice.getCreateTime())) {
            C38433e.m85751a((C35456b) aVar2, baseNotice);
            aVar2.f91119j = c;
            C41049a.m90714a().updateNoticeSession(aVar2);
        }
    }
}
