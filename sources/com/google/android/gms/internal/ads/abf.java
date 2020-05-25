package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class abf {

    /* renamed from: a */
    public final long f40155a;

    /* renamed from: b */
    public final Map<String, C16118ny> f40156b = new HashMap();

    /* renamed from: c */
    public String f40157c;

    /* renamed from: d */
    public String f40158d;

    /* renamed from: e */
    public boolean f40159e;

    /* renamed from: f */
    private final List<String> f40160f = new ArrayList();

    /* renamed from: g */
    private final List<String> f40161g = new ArrayList();

    /* renamed from: h */
    private JSONObject f40162h;

    public abf(String str, long j) {
        this.f40159e = false;
        this.f40158d = str;
        this.f40155a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f40162h = new JSONObject(str);
                if (this.f40162h.optInt("status", -1) != 1) {
                    this.f40159e = false;
                    abv.m32798e("App settings could not be fetched successfully.");
                    return;
                }
                this.f40159e = true;
                this.f40157c = this.f40162h.optString("app_id");
                JSONArray optJSONArray = this.f40162h.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("format");
                        String optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f40161g.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString)) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                                    if (optJSONObject != null) {
                                        this.f40156b.put(optString2, new C16118ny(optJSONObject));
                                    }
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = this.f40162h.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f40160f.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e) {
                abv.m32795c("Exception occurred while processing app setting json", e);
                C14963ax.m30834d().mo28588a((Throwable) e, "AppSettings.parseAppSettingsJson");
            }
        }
    }
}
