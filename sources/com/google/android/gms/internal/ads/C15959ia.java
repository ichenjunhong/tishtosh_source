package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ia */
public final class C15959ia implements C15948hq<Object> {

    /* renamed from: a */
    final HashMap<String, agl<JSONObject>> f45056a = new HashMap<>();

    /* renamed from: a */
    public final void mo31088a(String str) {
        agl agl = (agl) this.f45056a.get(str);
        if (agl == null) {
            abv.m32794c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!agl.isDone()) {
            agl.cancel(true);
        }
        this.f45056a.remove(str);
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        abv.m32792b("Received ad from the cache.");
        agl agl = (agl) this.f45056a.get(str);
        if (agl == null) {
            abv.m32794c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            agl.mo28823b(new JSONObject(str2));
        } catch (JSONException e) {
            abv.m32793b("Failed constructing JSON object from value passed from javascript", e);
            agl.mo28823b(null);
        } finally {
            this.f45056a.remove(str);
        }
    }
}
