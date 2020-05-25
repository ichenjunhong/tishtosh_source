package com.p683ss.android.p1103ad.splash.core.p1114c;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.g */
public final class C18609g {

    /* renamed from: a */
    private String f51376a;

    /* renamed from: b */
    private int f51377b;

    /* renamed from: c */
    private String f51378c;

    /* renamed from: d */
    private String f51379d;

    /* renamed from: a */
    public final String mo38009a() {
        return this.f51376a;
    }

    /* renamed from: b */
    public final int mo38010b() {
        return this.f51377b;
    }

    /* renamed from: c */
    public final String mo38011c() {
        return this.f51378c;
    }

    /* renamed from: d */
    public final String mo38012d() {
        return this.f51379d;
    }

    /* renamed from: a */
    public static C18609g m45084a(JSONObject jSONObject) {
        C18609g gVar = new C18609g();
        if (jSONObject != null) {
            gVar.f51376a = jSONObject.optString("background_color");
            gVar.f51377b = jSONObject.optInt("position");
            gVar.f51378c = jSONObject.optString("text_color");
            gVar.f51379d = jSONObject.optString("text");
        }
        return gVar;
    }
}
