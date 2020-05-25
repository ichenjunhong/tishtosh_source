package com.p683ss.android.p1103ad.splash.core.p1114c;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.a */
public final class C18601a {

    /* renamed from: a */
    public String f51288a;

    /* renamed from: b */
    public String f51289b;

    /* renamed from: c */
    public String f51290c;

    /* renamed from: d */
    public String f51291d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAdInfo{mTitle='");
        sb.append(this.f51288a);
        sb.append('\'');
        sb.append(", mDescription='");
        sb.append(this.f51289b);
        sb.append('\'');
        sb.append(", mImageUrl='");
        sb.append(this.f51290c);
        sb.append('\'');
        sb.append(", mShareUrl='");
        sb.append(this.f51291d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C18601a(JSONObject jSONObject) {
        this.f51288a = jSONObject.optString("share_title");
        this.f51289b = jSONObject.optString("share_desc");
        this.f51290c = jSONObject.optString("share_icon");
        this.f51291d = jSONObject.optString("share_url");
    }
}
