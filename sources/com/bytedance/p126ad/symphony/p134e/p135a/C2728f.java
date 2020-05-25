package com.bytedance.p126ad.symphony.p134e.p135a;

import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.a.f */
public final class C2728f {

    /* renamed from: f */
    private static C2728f f8244f;

    /* renamed from: a */
    public boolean f8245a;

    /* renamed from: b */
    public long f8246b = 300000;

    /* renamed from: c */
    public boolean f8247c;

    /* renamed from: d */
    public boolean f8248d;

    /* renamed from: e */
    public boolean f8249e;

    private C2728f() {
    }

    /* renamed from: a */
    public static C2728f m7790a() {
        if (f8244f == null) {
            f8244f = new C2728f();
        }
        return f8244f;
    }

    /* renamed from: a */
    public static C2728f m7791a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return m7790a();
        }
        C2728f fVar = new C2728f();
        fVar.f8245a = jSONObject.optBoolean("bid_log_switch", false);
        fVar.f8246b = jSONObject.optLong("bid_ad_request_expire_time", 300000);
        fVar.f8247c = jSONObject.optBoolean("enable_upload_material", false);
        fVar.f8248d = jSONObject.optBoolean("send_bid_loss_ahead", false);
        fVar.f8249e = jSONObject.optBoolean("enable_send_content_url", false);
        return fVar;
    }
}
