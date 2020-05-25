package com.p683ss.android.p1103ad.splash.core.p1114c;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.i */
public final class C18611i {

    /* renamed from: a */
    public String f51385a;

    /* renamed from: b */
    public int f51386b;

    /* renamed from: c */
    public long f51387c;

    /* renamed from: a */
    static C18611i m45090a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("promotion_icon");
        if (optJSONObject == null) {
            return null;
        }
        return new C18611i(optJSONObject.optString("promotion_icon_url"), optJSONObject.optInt("promotion_style", 0), optJSONObject.optLong("promotion_show_time", -1));
    }

    private C18611i(String str, int i, long j) {
        this.f51385a = str;
        this.f51386b = i;
        this.f51387c = j;
    }
}
