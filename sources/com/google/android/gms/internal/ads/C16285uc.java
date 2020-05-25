package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uc */
final /* synthetic */ class C16285uc implements afk {

    /* renamed from: a */
    private final C16280ty f45664a;

    /* renamed from: b */
    private final JSONObject f45665b;

    C16285uc(C16280ty tyVar, JSONObject jSONObject) {
        this.f45664a = tyVar;
        this.f45665b = jSONObject;
    }

    /* renamed from: a */
    public final aga mo27633a(Object obj) {
        C16280ty tyVar = this.f45664a;
        JSONObject jSONObject = this.f45665b;
        ama ama = (ama) obj;
        jSONObject.put("ads_id", tyVar.f45655d);
        ama.mo29247b("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return afp.m32820a(new JSONObject());
    }
}
