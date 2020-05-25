package com.p683ss.android.ugc.aweme.sdk.iap.utils;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.f */
public final class C41392f {

    /* renamed from: a */
    public final String f104943a;

    /* renamed from: b */
    public final String f104944b;

    /* renamed from: c */
    public final String f104945c;

    /* renamed from: d */
    public final long f104946d;

    /* renamed from: e */
    public final String f104947e;

    /* renamed from: f */
    public final String f104948f;

    /* renamed from: g */
    public final String f104949g;

    /* renamed from: h */
    private final String f104950h;

    /* renamed from: i */
    private final String f104951i;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkuDetails:");
        sb.append(this.f104951i);
        return sb.toString();
    }

    public C41392f(String str, String str2) throws JSONException {
        this.f104950h = str;
        this.f104951i = str2;
        JSONObject jSONObject = new JSONObject(this.f104951i);
        this.f104943a = jSONObject.optString("productId");
        this.f104944b = jSONObject.optString("type");
        this.f104945c = jSONObject.optString("price");
        this.f104946d = jSONObject.optLong("price_amount_micros");
        this.f104947e = jSONObject.optString("price_currency_code");
        this.f104948f = jSONObject.optString("title");
        this.f104949g = jSONObject.optString("description");
    }
}
