package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ud */
final /* synthetic */ class C16286ud implements afk {

    /* renamed from: a */
    private final C16280ty f45666a;

    /* renamed from: b */
    private final JSONObject f45667b;

    C16286ud(C16280ty tyVar, JSONObject jSONObject) {
        this.f45666a = tyVar;
        this.f45667b = jSONObject;
    }

    /* renamed from: a */
    public final aga mo27633a(Object obj) {
        C16280ty tyVar = this.f45666a;
        JSONObject jSONObject = this.f45667b;
        ama ama = (ama) obj;
        jSONObject.put("ads_id", tyVar.f45655d);
        ama.mo29247b("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return afp.m32820a(new JSONObject());
    }
}
