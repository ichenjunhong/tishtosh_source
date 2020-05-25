package com.p683ss.android.ugc.aweme.notification.p2014d;

import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.C38213i.C38214a;
import com.p683ss.android.ugc.aweme.notification.p2016f.C38188d;
import com.p683ss.android.ugc.aweme.notification.p2016f.C38196g;
import com.p683ss.android.ugc.aweme.notification.util.C38433e;
import com.p683ss.android.ugc.aweme.notification.util.C38433e.C38436b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;

/* renamed from: com.ss.android.ugc.aweme.notification.d.f */
final /* synthetic */ class C38168f implements C38436b {

    /* renamed from: a */
    private final C38163a f97207a;

    /* renamed from: b */
    private final int f97208b = 62;

    C38168f(C38163a aVar, int i) {
        this.f97207a = aVar;
    }

    /* renamed from: a */
    public final void mo78170a(BaseNotice baseNotice) {
        C38163a aVar = this.f97207a;
        int i = this.f97208b;
        C38196g gVar = new C38196g();
        int c = C36782d.m82775a().mo75940c(i);
        if (aVar.mo78163a(baseNotice, (C38188d) gVar, c)) {
            return;
        }
        if (c > 0 || !C38214a.m85384a(i, baseNotice.getCreateTime())) {
            C38433e.m85751a((C35456b) gVar, baseNotice);
            gVar.f91119j = c;
            if (c > 0 && i == 62) {
                gVar.f91121l = 1;
            }
            C41049a.m90714a().updateNoticeSession(gVar);
        }
    }
}
