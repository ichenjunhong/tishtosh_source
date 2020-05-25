package com.p683ss.android.ugc.aweme.compliance.businesses.serviceimpl;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.compliance.business.api.model.AppealStatusResponse;
import com.p683ss.android.ugc.aweme.compliance.business.api.p1602b.C27020a;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.C27022b;
import com.p683ss.android.ugc.aweme.compliance.businesses.banappeal.C27023a;
import com.p683ss.android.ugc.aweme.compliance.businesses.banappeal.api.AppealApi.C27028a;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.serviceimpl.a */
public final class C27060a implements C27022b {
    /* renamed from: a */
    public final C27020a mo55250a(Activity activity, AppealStatusResponse appealStatusResponse) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(appealStatusResponse, "appealInfo");
        return new C27023a(activity, appealStatusResponse);
    }

    /* renamed from: a */
    public final void mo55251a(String str, C0011g<AppealStatusResponse, Void> gVar) {
        C52711k.m112240b(str, "userId");
        C52711k.m112240b(gVar, "continuation");
        C52711k.m112240b(str, "userId");
        C52711k.m112240b(gVar, "continuation");
        C27028a.f71338a.getUserAppealStatus("6", str).mo20a(gVar, C0013i.f25b);
    }
}
