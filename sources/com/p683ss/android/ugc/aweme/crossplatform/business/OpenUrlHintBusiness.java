package com.p683ss.android.ugc.aweme.crossplatform.business;

import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.OpenUrlHintBusiness */
public class OpenUrlHintBusiness extends Business {
    public OpenUrlHintBusiness(C27173c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public static void m65549a(OpenURLHintLayout openURLHintLayout, String str) {
        openURLHintLayout.mo54442a(C23324d.m57378a().getRawAdAwemeById(str));
    }
}
