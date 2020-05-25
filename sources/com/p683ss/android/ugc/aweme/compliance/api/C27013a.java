package com.p683ss.android.ugc.aweme.compliance.api;

import com.p683ss.android.ugc.aweme.compliance.api.services.report.C27015a;
import com.p683ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p683ss.android.ugc.aweme.compliance.business.p1599a.p1600a.C27017a;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.a */
public final class C27013a {

    /* renamed from: a */
    private static IReportService f71323a;

    /* renamed from: a */
    public static IReportService m65227a() {
        if (f71323a != null) {
            return f71323a;
        }
        IReportService a = C27017a.m65231a();
        f71323a = a;
        if (a == null) {
            f71323a = new C27015a();
        }
        return f71323a;
    }
}
