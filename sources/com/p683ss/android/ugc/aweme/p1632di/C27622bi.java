package com.p683ss.android.ugc.aweme.p1632di;

import android.app.Application;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.common.C26910k;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.p1235a.C20302a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.di.bi */
public final class C27622bi {
    /* renamed from: a */
    public static IIMService m66302a() {
        IIMService iIMService = (IIMService) new C20302a(IIMService.class, null).mo42946a().mo42948b();
        if (iIMService == null) {
            iIMService = (IIMService) C26910k.m65032a("com.ss.android.ugc.aweme.im.sdk.providedservices.IMService", DefaultIMService.class);
            m66303a(false);
        } else {
            m66303a(true);
        }
        C33194e.m76263a((Application) AwemeApplication.m56199a(), iIMService);
        return iIMService;
    }

    /* renamed from: a */
    private static void m66303a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("use_broker", z);
        } catch (JSONException unused) {
        }
        C23131p.m57779a("broker_i18n", jSONObject);
    }
}
