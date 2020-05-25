package com.p683ss.android.ugc.aweme.miniapp_api.model;

import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.k */
public final class C36972k {

    /* renamed from: a */
    public int f94402a = -1;

    /* renamed from: b */
    public String f94403b;

    /* renamed from: c */
    public C36974b f94404c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.k$a */
    public static class C36973a {

        /* renamed from: a */
        public String f94405a;

        /* renamed from: b */
        public String f94406b;

        /* renamed from: c */
        public int f94407c;
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.k$b */
    public static class C36974b {

        /* renamed from: a */
        public C36975c f94408a;

        /* renamed from: b */
        public C36973a f94409b;
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.k$c */
    public static class C36975c {

        /* renamed from: a */
        public int f94410a;

        /* renamed from: b */
        public String f94411b;

        /* renamed from: c */
        public String f94412c;

        /* renamed from: d */
        public String f94413d;

        /* renamed from: e */
        public String f94414e;

        /* renamed from: f */
        public String f94415f;

        /* renamed from: g */
        public String f94416g;
    }

    /* renamed from: a */
    public static C36972k m83181a(String str) {
        C36972k kVar = new C36972k();
        try {
            JSONObject jSONObject = new JSONObject(str);
            kVar.f94402a = jSONObject.optInt("err_no");
            kVar.f94403b = jSONObject.optString("message");
            C36974b bVar = new C36974b();
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            C36975c cVar = new C36975c();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("share_info");
            cVar.f94410a = optJSONObject2.optInt("host_id");
            cVar.f94411b = optJSONObject2.optString("app_id");
            cVar.f94412c = optJSONObject2.optString("title");
            cVar.f94413d = optJSONObject2.optString("image_url");
            cVar.f94414e = optJSONObject2.optString("query");
            cVar.f94416g = optJSONObject2.optString("uid");
            cVar.f94415f = optJSONObject2.optString("did");
            C36973a aVar = new C36973a();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("app_info");
            aVar.f94405a = optJSONObject3.optString(LeakCanaryFileProvider.f132049i);
            aVar.f94406b = optJSONObject3.optString("icon");
            aVar.f94407c = optJSONObject3.optInt("type");
            bVar.f94408a = cVar;
            bVar.f94409b = aVar;
            kVar.f94404c = bVar;
        } catch (JSONException unused) {
        }
        return kVar;
    }
}
