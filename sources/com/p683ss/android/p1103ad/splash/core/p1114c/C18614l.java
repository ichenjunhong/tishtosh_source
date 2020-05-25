package com.p683ss.android.p1103ad.splash.core.p1114c;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.l */
public final class C18614l {

    /* renamed from: a */
    public String f51390a;

    /* renamed from: b */
    public boolean f51391b;

    /* renamed from: c */
    public int f51392c;

    /* renamed from: d */
    private int f51393d;

    /* renamed from: e */
    private int f51394e;

    /* renamed from: f */
    private String f51395f;

    /* renamed from: g */
    private String f51396g;

    /* renamed from: h */
    private String f51397h;

    /* renamed from: a */
    public final int mo38013a() {
        return this.f51393d;
    }

    /* renamed from: b */
    public final int mo38014b() {
        return this.f51394e;
    }

    /* renamed from: c */
    public final String mo38015c() {
        return this.f51396g;
    }

    /* renamed from: d */
    public final String mo38016d() {
        return this.f51397h;
    }

    /* renamed from: e */
    public final String mo38017e() {
        return this.f51395f;
    }

    /* renamed from: a */
    public static C18614l m45093a(JSONObject jSONObject) {
        C18614l lVar = new C18614l();
        if (jSONObject != null) {
            lVar.f51390a = jSONObject.optString("countdown_unit", "");
            lVar.f51393d = jSONObject.optInt("height_extra_size");
            lVar.f51394e = jSONObject.optInt("width_extra_size");
            lVar.f51395f = jSONObject.optString("text_color");
            lVar.f51396g = jSONObject.optString("background_color");
            lVar.f51397h = jSONObject.optString("text");
            boolean z = true;
            if (jSONObject.optInt("countdown_enable", 0) != 1) {
                z = false;
            }
            lVar.f51391b = z;
            lVar.f51392c = jSONObject.optInt("show_skip_seconds", 0);
        }
        return lVar;
    }
}
