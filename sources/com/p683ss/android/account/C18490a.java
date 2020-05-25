package com.p683ss.android.account;

import com.bytedance.sdk.account.p877l.C13207b;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;

/* renamed from: com.ss.android.account.a */
public class C18490a extends C13207b {

    /* renamed from: l */
    public String f50921l;

    /* renamed from: m */
    public String f50922m;

    /* renamed from: n */
    public String f50923n;

    /* renamed from: a */
    public void mo24803a() throws Exception {
        super.mo24803a();
        JSONObject jSONObject = this.f34483k;
        if (jSONObject.has(LeakCanaryFileProvider.f132049i)) {
            this.f50921l = jSONObject.optString(LeakCanaryFileProvider.f132049i);
        } else if (jSONObject.has("username")) {
            this.f50921l = jSONObject.optString("username");
        }
        this.f50923n = jSONObject.optString("avatar_url");
        this.f50922m = jSONObject.optString("description");
    }

    public C18490a(JSONObject jSONObject) {
        super(jSONObject);
    }

    public C18490a(JSONObject jSONObject, JSONObject jSONObject2) {
        super(jSONObject, jSONObject2);
    }
}
