package com.facebook.p909a.p912b;

import android.content.Context;
import com.facebook.C14699w;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14295b;
import com.facebook.internal.C14349t;
import com.facebook.p909a.C13542b;
import com.facebook.p909a.C13594o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.c */
public final class C13552c {

    /* renamed from: a */
    private static final Map<C13554a, String> f35368a = new HashMap<C13554a, String>() {
        {
            put(C13554a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(C13554a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    };

    /* renamed from: com.facebook.a.b.c$a */
    public enum C13554a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static JSONObject m27372a(C13554a aVar, C14295b bVar, String str, boolean z, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f35368a.get(aVar));
        String a = C13542b.m27364a();
        if (a != null) {
            jSONObject.put("app_user_id", a);
        }
        if (!C13594o.f35463d.get()) {
            C13594o.m27438a();
        }
        String a2 = C13594o.m27436a((Map<String, String>) C13594o.f35461b);
        if (!a2.isEmpty()) {
            jSONObject.put("ud", a2);
        }
        C14277aa.m29273a(jSONObject, bVar, str, z);
        try {
            C14277aa.m29272a(jSONObject, context);
        } catch (Exception e) {
            C14349t.m29409a(C14699w.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
