package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ue */
final class C16287ue implements C15948hq<ama> {

    /* renamed from: a */
    private final /* synthetic */ ama f45668a;

    /* renamed from: b */
    private final /* synthetic */ agl f45669b;

    /* renamed from: c */
    private final /* synthetic */ C16280ty f45670c;

    C16287ue(C16280ty tyVar, ama ama, agl agl) {
        this.f45670c = tyVar;
        this.f45668a = ama;
        this.f45669b = agl;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        boolean z;
        JSONObject jSONObject;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str2);
                z = false;
            } else {
                jSONObject = new JSONObject(str);
                z = true;
            }
            if (this.f45670c.f45655d.equals(jSONObject.optString("ads_id", ""))) {
                this.f45668a.mo29161b("/nativeAdPreProcess", this);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                this.f45669b.mo28823b(jSONObject2);
            }
        } catch (Throwable th) {
            abv.m32793b("Error while preprocessing json.", th);
            this.f45669b.mo28822a(th);
        }
    }
}
