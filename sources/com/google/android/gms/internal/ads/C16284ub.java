package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ub */
final /* synthetic */ class C16284ub implements afk {

    /* renamed from: a */
    private final C16280ty f45662a;

    /* renamed from: b */
    private final JSONObject f45663b;

    C16284ub(C16280ty tyVar, JSONObject jSONObject) {
        this.f45662a = tyVar;
        this.f45663b = jSONObject;
    }

    /* renamed from: a */
    public final aga mo27633a(Object obj) {
        C16280ty tyVar = this.f45662a;
        JSONObject jSONObject = this.f45663b;
        ama ama = (ama) obj;
        jSONObject.put("ads_id", tyVar.f45655d);
        ama.mo29247b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return afp.m32820a(new JSONObject());
    }
}
