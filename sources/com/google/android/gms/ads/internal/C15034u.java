package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C15828df;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.ank;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.u */
final /* synthetic */ class C15034u implements ank {

    /* renamed from: a */
    private final C15828df f38841a;

    /* renamed from: b */
    private final String f38842b;

    /* renamed from: c */
    private final ama f38843c;

    C15034u(C15828df dfVar, String str, ama ama) {
        this.f38841a = dfVar;
        this.f38842b = str;
        this.f38843c = ama;
    }

    /* renamed from: a */
    public final void mo27693a(boolean z) {
        C15828df dfVar = this.f38841a;
        String str = this.f38842b;
        ama ama = this.f38843c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", dfVar.mo30934a());
            jSONObject.put("body", dfVar.mo30939g());
            jSONObject.put("call_to_action", dfVar.mo30941i());
            jSONObject.put("price", dfVar.mo30944l());
            jSONObject.put("star_rating", String.valueOf(dfVar.mo30942j()));
            jSONObject.put("store", dfVar.mo30943k());
            jSONObject.put("icon", C15033t.m31092a(dfVar.mo30940h()));
            JSONArray jSONArray = new JSONArray();
            List<Object> f = dfVar.mo30938f();
            if (f != null) {
                for (Object a : f) {
                    jSONArray.put(C15033t.m31092a(C15033t.m31089a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", C15033t.m31093a(dfVar.mo30947o(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put(MovieDetailAPi.f94892b, "2");
            ama.mo29247b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            abv.m32795c("Exception occurred when loading assets", e);
        }
    }
}
