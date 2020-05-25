package com.p683ss.android.ugc.aweme.notification.newstyle.p2021a;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38099m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.j */
public final class C38269j {
    /* renamed from: a */
    public static final int m85499a(BaseNotice baseNotice) {
        C52711k.m112240b(baseNotice, "notice");
        if (baseNotice instanceof C38099m) {
            return 999;
        }
        return baseNotice.getType();
    }
}
