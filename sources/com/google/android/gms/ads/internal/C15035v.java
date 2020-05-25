package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C15830dh;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.ank;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.v */
final /* synthetic */ class C15035v implements ank {

    /* renamed from: a */
    private final C15830dh f38844a;

    /* renamed from: b */
    private final String f38845b;

    /* renamed from: c */
    private final ama f38846c;

    C15035v(C15830dh dhVar, String str, ama ama) {
        this.f38844a = dhVar;
        this.f38845b = str;
        this.f38846c = ama;
    }

    /* renamed from: a */
    public final void mo27693a(boolean z) {
        C15830dh dhVar = this.f38844a;
        String str = this.f38845b;
        ama ama = this.f38846c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", dhVar.mo30953a());
            jSONObject.put("body", dhVar.mo30959i());
            jSONObject.put("call_to_action", dhVar.mo30961k());
            jSONObject.put("advertiser", dhVar.mo30962l());
            jSONObject.put("logo", C15033t.m31092a(dhVar.mo30960j()));
            JSONArray jSONArray = new JSONArray();
            List<Object> f = dhVar.mo30938f();
            if (f != null) {
                for (Object a : f) {
                    jSONArray.put(C15033t.m31092a(C15033t.m31089a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", C15033t.m31093a(dhVar.mo30965o(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put(MovieDetailAPi.f94892b, "1");
            ama.mo29247b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            abv.m32795c("Exception occurred when loading assets", e);
        }
    }
}
