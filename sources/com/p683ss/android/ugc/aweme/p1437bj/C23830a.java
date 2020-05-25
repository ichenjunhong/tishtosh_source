package com.p683ss.android.ugc.aweme.p1437bj;

import com.p683ss.android.ugc.aweme.services.IAVMobService;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bj.a */
public final class C23830a implements IAVMobService {
    public final void onEventV3(String str, Map<String, String> map) {
        C52711k.m112240b(str, "eventName");
        C47702b.f120193a.mo94984a(str, map);
    }

    public final void onEventV3(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "eventName");
        C47702b.f120193a.mo94985a(str, jSONObject);
    }
}
