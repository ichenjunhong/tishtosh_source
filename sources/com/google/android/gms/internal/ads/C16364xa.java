package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.xa */
public final class C16364xa {

    /* renamed from: a */
    public final String f45883a;

    /* renamed from: b */
    public final String f45884b;

    /* renamed from: c */
    public final boolean f45885c;

    /* renamed from: d */
    public final String f45886d;

    /* renamed from: e */
    public String f45887e;

    /* renamed from: f */
    public final int f45888f;

    /* renamed from: g */
    public final boolean f45889g;

    /* renamed from: h */
    public final String f45890h;

    /* renamed from: i */
    public final boolean f45891i;

    /* renamed from: j */
    private final List<String> f45892j;

    /* renamed from: k */
    private final String f45893k;

    /* renamed from: l */
    private final String f45894l;

    /* renamed from: m */
    private final JSONObject f45895m;

    public C16364xa(JSONObject jSONObject) {
        List<String> list;
        this.f45887e = jSONObject.optString("url");
        this.f45883a = jSONObject.optString("base_uri");
        this.f45884b = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i = 1;
        this.f45885c = optString != null && (optString.equals("1") || optString.equals("true"));
        this.f45894l = jSONObject.optString("request_id");
        this.f45893k = jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        if (optString2 == null) {
            list = null;
        } else {
            list = Arrays.asList(optString2.split(","));
        }
        this.f45892j = list;
        if (jSONObject.optInt("valid", 0) == 1) {
            i = -2;
        }
        this.f45888f = i;
        this.f45886d = jSONObject.optString("fetched_ad");
        this.f45889g = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.f45895m = optJSONObject;
        this.f45890h = jSONObject.optString("analytics_query_ad_event_id");
        this.f45891i = jSONObject.optBoolean("is_analytics_logging_enabled");
    }
}
