package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ua */
final /* synthetic */ class C16283ua implements afk {

    /* renamed from: a */
    private final C16280ty f45660a;

    /* renamed from: b */
    private final JSONObject f45661b;

    C16283ua(C16280ty tyVar, JSONObject jSONObject) {
        this.f45660a = tyVar;
        this.f45661b = jSONObject;
    }

    /* renamed from: a */
    public final aga mo27633a(Object obj) {
        C16280ty tyVar = this.f45660a;
        JSONObject jSONObject = this.f45661b;
        ama ama = (ama) obj;
        jSONObject.put("ads_id", tyVar.f45655d);
        agl agl = new agl();
        ama.mo29157a("/nativeAdPreProcess", (C15948hq<? super ama>) new C16287ue<Object>(tyVar, ama, agl));
        ama.mo29247b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return agl;
    }
}
