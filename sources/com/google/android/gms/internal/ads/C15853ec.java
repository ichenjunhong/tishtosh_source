package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ec */
final class C15853ec implements C15948hq<Object> {

    /* renamed from: a */
    private final /* synthetic */ C16276tu f44936a;

    /* renamed from: b */
    private final /* synthetic */ C15847dx f44937b;

    C15853ec(C15847dx dxVar, C16276tu tuVar) {
        this.f44937b = dxVar;
        this.f44936a = tuVar;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.f44937b.f44926b);
            this.f44936a.mo31416a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            abv.m32793b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
