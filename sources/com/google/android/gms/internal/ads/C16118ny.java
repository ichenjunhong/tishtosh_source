package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ny */
public final class C16118ny {

    /* renamed from: a */
    public final List<C16117nx> f45294a;

    /* renamed from: b */
    public final long f45295b;

    /* renamed from: c */
    public final List<String> f45296c;

    /* renamed from: d */
    public final List<String> f45297d;

    /* renamed from: e */
    public final List<String> f45298e;

    /* renamed from: f */
    public final List<String> f45299f;

    /* renamed from: g */
    public final List<String> f45300g;

    /* renamed from: h */
    public final boolean f45301h;

    /* renamed from: i */
    public final String f45302i;

    /* renamed from: j */
    public final long f45303j;

    /* renamed from: k */
    public final String f45304k;

    /* renamed from: l */
    public final int f45305l;

    /* renamed from: m */
    public final int f45306m;

    /* renamed from: n */
    public final long f45307n;

    /* renamed from: o */
    public final boolean f45308o;

    /* renamed from: p */
    public final boolean f45309p;

    /* renamed from: q */
    public final boolean f45310q;

    /* renamed from: r */
    public final boolean f45311r;

    /* renamed from: s */
    public int f45312s;

    /* renamed from: t */
    public int f45313t;

    /* renamed from: u */
    public boolean f45314u;

    public C16118ny(List<C16117nx> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f45294a = list;
        this.f45295b = j;
        this.f45296c = list2;
        this.f45297d = list3;
        this.f45298e = list4;
        this.f45299f = list5;
        this.f45300g = list6;
        this.f45301h = z;
        this.f45302i = str;
        this.f45303j = -1;
        this.f45313t = 1;
        this.f45306m = -1;
        this.f45307n = -1;
    }

    public C16118ny(String str) throws JSONException {
        this(new JSONObject(str));
    }

    public C16118ny(JSONObject jSONObject) throws JSONException {
        if (abv.m32791a(2)) {
            String str = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            abv.m32494a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                C16117nx nxVar = new C16117nx(jSONArray.getJSONObject(i2));
                boolean z = true;
                if (nxVar.mo31199a()) {
                    this.f45314u = true;
                }
                arrayList.add(nxVar);
                if (i < 0) {
                    Iterator it = nxVar.f45273c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i = i2;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.f45312s = i;
        this.f45313t = jSONArray.length();
        this.f45294a = Collections.unmodifiableList(arrayList);
        this.f45302i = jSONObject.optString("qdata");
        this.f45306m = jSONObject.optInt("fs_model_type", -1);
        long j = -1;
        this.f45307n = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f45295b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.f45296c = C16127og.m38183a(optJSONObject, "click_urls");
            this.f45297d = C16127og.m38183a(optJSONObject, "imp_urls");
            this.f45298e = C16127og.m38183a(optJSONObject, "downloaded_imp_urls");
            this.f45299f = C16127og.m38183a(optJSONObject, "nofill_urls");
            this.f45300g = C16127og.m38183a(optJSONObject, "remote_ping_urls");
            this.f45301h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            if (optLong > 0) {
                j = 1000 * optLong;
            }
            this.f45303j = j;
            zzbaz a = zzbaz.m39276a(optJSONObject.optJSONArray("rewards"));
            if (a == null) {
                this.f45304k = null;
                this.f45305l = 0;
            } else {
                this.f45304k = a.f46226a;
                this.f45305l = a.f46227b;
            }
            this.f45308o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.f45309p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.f45310q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            this.f45311r = optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f45295b = -1;
        this.f45296c = null;
        this.f45297d = null;
        this.f45298e = null;
        this.f45299f = null;
        this.f45300g = null;
        this.f45303j = -1;
        this.f45304k = null;
        this.f45305l = 0;
        this.f45308o = false;
        this.f45301h = false;
        this.f45309p = false;
        this.f45310q = false;
        this.f45311r = false;
    }
}
