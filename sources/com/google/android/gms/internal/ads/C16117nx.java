package com.google.android.gms.internal.ads;

import com.p683ss.android.ugc.aweme.effect.C29094ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.nx */
public final class C16117nx {

    /* renamed from: a */
    public final String f45271a;

    /* renamed from: b */
    public final String f45272b;

    /* renamed from: c */
    public final List<String> f45273c;

    /* renamed from: d */
    public final String f45274d;

    /* renamed from: e */
    public final String f45275e;

    /* renamed from: f */
    public final List<String> f45276f;

    /* renamed from: g */
    public final List<String> f45277g;

    /* renamed from: h */
    public final List<String> f45278h;

    /* renamed from: i */
    public final List<String> f45279i;

    /* renamed from: j */
    public final List<String> f45280j;

    /* renamed from: k */
    public final String f45281k;

    /* renamed from: l */
    public final List<String> f45282l;

    /* renamed from: m */
    public final List<String> f45283m;

    /* renamed from: n */
    public final List<String> f45284n;

    /* renamed from: o */
    public final String f45285o;

    /* renamed from: p */
    public final String f45286p;

    /* renamed from: q */
    public final String f45287q;

    /* renamed from: r */
    public final String f45288r;

    /* renamed from: s */
    public final String f45289s;

    /* renamed from: t */
    public final List<String> f45290t;

    /* renamed from: u */
    public final String f45291u;

    /* renamed from: v */
    public final long f45292v;

    /* renamed from: w */
    private final String f45293w;

    public C16117nx(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5, String str6, List<String> list6, List<String> list7, List<String> list8, String str7, String str8, String str9, String str10, String str11, List<String> list9, String str12, List<String> list10, String str13, long j) {
        this.f45271a = str;
        this.f45273c = list;
        this.f45276f = list2;
        this.f45277g = list3;
        this.f45278h = list4;
        this.f45279i = list5;
        this.f45281k = str5;
        this.f45282l = list6;
        this.f45283m = list7;
        this.f45284n = list8;
        this.f45285o = str7;
        this.f45286p = str8;
        this.f45280j = list10;
        this.f45292v = -1;
    }

    public C16117nx(JSONObject jSONObject) throws JSONException {
        this.f45272b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f45273c = Collections.unmodifiableList(arrayList);
        this.f45274d = jSONObject.optString("allocation_id", null);
        this.f45276f = C16127og.m38183a(jSONObject, "clickurl");
        this.f45277g = C16127og.m38183a(jSONObject, "imp_urls");
        this.f45278h = C16127og.m38183a(jSONObject, "downloaded_imp_urls");
        this.f45280j = C16127og.m38183a(jSONObject, "fill_urls");
        this.f45282l = C16127og.m38183a(jSONObject, "video_start_urls");
        this.f45284n = C16127og.m38183a(jSONObject, "video_complete_urls");
        this.f45283m = C16127og.m38183a(jSONObject, "video_reward_urls");
        this.f45285o = jSONObject.optString("transaction_id");
        this.f45286p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject(C29094ad.f76264a);
        this.f45279i = optJSONObject != null ? C16127og.m38183a(optJSONObject, "manual_impression_urls") : null;
        this.f45271a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f45281k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f45275e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f45287q = jSONObject.optString("html_template", null);
        this.f45288r = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f45289s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        this.f45290t = C16127og.m38183a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f45291u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f45293w = jSONObject.optString("response_type", null);
        this.f45292v = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    /* renamed from: a */
    public final boolean mo31199a() {
        return "banner".equalsIgnoreCase(this.f45293w);
    }

    /* renamed from: b */
    public final boolean mo31200b() {
        return "native".equalsIgnoreCase(this.f45293w);
    }
}
