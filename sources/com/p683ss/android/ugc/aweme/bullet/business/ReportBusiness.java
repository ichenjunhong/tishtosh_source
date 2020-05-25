package com.p683ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.report.C41201a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.ReportBusiness */
public final class ReportBusiness extends Business {
    public ReportBusiness(C24252a aVar) {
        C52711k.m112240b(aVar, "bulletBusiness");
        super(aVar);
    }

    /* renamed from: a */
    public static void m59365a(Activity activity, String str) {
        Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(str);
        IReportService a = C27013a.m65227a();
        C52711k.m112236a((Object) rawAdAwemeById, "rawAdAweme");
        a.reportMobHelper(C41201a.m90896a(rawAdAwemeById, "homepage_hot"));
        C27013a.m65227a().reportAd(activity, C41201a.m90895a(rawAdAwemeById, "landing_page", C29094ad.f76264a));
    }
}
