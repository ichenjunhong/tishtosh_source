package com.p683ss.android.sdk.app;

import android.text.TextUtils;
import com.p683ss.android.newmedia.p1198d.C19548a;
import com.p683ss.android.sdk.p1207a.C19719c;
import java.util.HashMap;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.app.d */
public final class C19731d extends C19548a {

    /* renamed from: com.ss.android.sdk.app.d$a */
    public static class C19732a {

        /* renamed from: a */
        public String f54361a;

        /* renamed from: b */
        int f54362b;

        /* renamed from: c */
        String f54363c;

        /* renamed from: d */
        public String f54364d;

        /* renamed from: e */
        String f54365e;

        /* renamed from: f */
        public long f54366f;

        /* renamed from: g */
        public String f54367g;

        /* renamed from: h */
        boolean f54368h;

        /* renamed from: i */
        public boolean f54369i;

        /* renamed from: j */
        final Map<String, C19719c> f54370j = new HashMap();

        /* renamed from: k */
        long f54371k;

        /* renamed from: l */
        String f54372l;

        /* renamed from: m */
        String f54373m;
    }

    /* renamed from: a */
    public static C19732a m48229a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C19732a aVar = new C19732a();
        aVar.f54361a = jSONObject2.optString(LeakCanaryFileProvider.f132049i);
        aVar.f54362b = jSONObject2.optInt("gender");
        aVar.f54363c = jSONObject2.optString("screen_name");
        aVar.f54365e = jSONObject2.optString("description");
        aVar.f54368h = jSONObject2.optBoolean("is_generated");
        aVar.f54367g = jSONObject2.optString("avatar_url");
        long j = 0;
        aVar.f54366f = jSONObject2.optLong("user_id", 0);
        aVar.f54364d = jSONObject2.optString("session_key", "");
        aVar.f54369i = jSONObject2.optBoolean("user_verified");
        String optString = jSONObject2.optString("mobile");
        C19719c.f54294c.f54308q = optString;
        if (!TextUtils.isEmpty(optString)) {
            aVar.f54370j.put(C19719c.f54294c.f54304m, C19719c.f54294c);
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("connects");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (i < length) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                String optString2 = optJSONObject.optString("platform");
                if (!(optString2 == null || optString2.length() == 0)) {
                    C19719c cVar = new C19719c(optString2, 0, 0);
                    cVar.f54308q = optJSONObject.optString("platform_screen_name");
                    cVar.f54309r = optJSONObject.optString("profile_image_url");
                    cVar.f54310s = optJSONObject.optString("platform_uid");
                    long optLong = optJSONObject.optLong("expires_in");
                    if (optLong > j) {
                        cVar.f54311t = currentTimeMillis + (1000 * optLong);
                    }
                    cVar.f54312u = optLong;
                    aVar.f54370j.put(optString2, cVar);
                }
                i++;
                j = 0;
            }
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("media");
        if (optJSONObject2 != null) {
            aVar.f54372l = optJSONObject2.optString("avatar_url");
            aVar.f54371k = optJSONObject2.optLong("id");
            aVar.f54373m = optJSONObject2.optString(LeakCanaryFileProvider.f132049i);
        }
        return aVar;
    }
}
