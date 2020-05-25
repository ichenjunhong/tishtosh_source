package com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h;

import android.app.Activity;
import android.app.Dialog;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSplitXPlanExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.IMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1888b.C35122a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.C35149d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.C35165h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.SharePanelWidget;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35276n;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35451f;
import com.p683ss.android.ugc.aweme.p1807im.service.share.C35475a;
import com.p683ss.android.ugc.aweme.p1807im.service.share.C35478b;
import com.p683ss.android.ugc.aweme.p1807im.service.share.p1908a.C35477b;
import com.p683ss.android.ugc.aweme.p1807im.service.share.p1909b.C35479a;
import com.p683ss.android.ugc.aweme.p1807im.service.share.p1909b.C35480b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.h.g */
public final class C34379g implements C35451f {
    /* renamed from: a */
    public final C35475a mo72377a(C35480b bVar) {
        C52711k.m112240b(bVar, "payload");
        return new C35165h(bVar);
    }

    /* renamed from: a */
    public final int mo72374a(String str) {
        C52711k.m112240b(str, "shareType");
        C33229c cVar = C33229c.f86227e;
        int intValue = ((Number) C33229c.f86226d.getValue()).intValue();
        if (intValue == ImShareSplitXPlanExperiment.MERGE_X) {
            return 0;
        }
        if (intValue != ImShareSplitXPlanExperiment.REMOVE_X && str.hashCode() == 93227207 && str.equals("aweme")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    public final C35475a mo72376a(C35479a aVar, C35477b bVar) {
        boolean z;
        C52711k.m112240b(aVar, "payload");
        C52711k.m112240b(bVar, "callback");
        IMService.inst().ensureIMState();
        C35149d dVar = new C35149d(aVar, bVar);
        C35475a aVar2 = dVar;
        bVar.mo70329a(aVar2);
        C35479a aVar3 = dVar.f90401b;
        if (!C35265e.m79727a() || C35276n.m79758a(dVar.f90401b.f91202g)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            aVar3 = null;
        }
        if (aVar3 != null) {
            dVar.f90400a = new SharePanelWidget(dVar.f90401b, dVar.f90402c);
        } else {
            dVar.f90401b.f91196a.setVisibility(8);
        }
        return aVar2;
    }

    /* renamed from: a */
    public final Dialog mo72375a(Activity activity, C42348d dVar, C35478b bVar, int i) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(dVar, "config");
        C35122a aVar = new C35122a(activity, dVar, bVar, null, i);
        return aVar;
    }
}
