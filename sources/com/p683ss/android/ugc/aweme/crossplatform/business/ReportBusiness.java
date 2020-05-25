package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.report.C41201a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.ReportBusiness */
public class ReportBusiness extends Business {
    ReportBusiness(C27173c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final void mo55514a(Activity activity) {
        Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(this.f71633j.f71718a.f71713j);
        C27013a.m65227a().reportMobHelper(C41201a.m90896a(rawAdAwemeById, "homepage_hot"));
        C27013a.m65227a().reportAd(activity, C41201a.m90895a(rawAdAwemeById, "landing_page", C29094ad.f76264a));
    }
}
