package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dz */
final /* synthetic */ class C15849dz implements ank {

    /* renamed from: a */
    private final C15848dy f44929a;

    /* renamed from: b */
    private final Map f44930b;

    /* renamed from: c */
    private final C16276tu f44931c;

    C15849dz(C15848dy dyVar, Map map, C16276tu tuVar) {
        this.f44929a = dyVar;
        this.f44930b = map;
        this.f44931c = tuVar;
    }

    /* renamed from: a */
    public final void mo27693a(boolean z) {
        C15848dy dyVar = this.f44929a;
        Map map = this.f44930b;
        C16276tu tuVar = this.f44931c;
        dyVar.f44927a.f44926b = (String) map.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", dyVar.f44927a.f44926b);
            tuVar.mo31416a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            abv.m32793b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
