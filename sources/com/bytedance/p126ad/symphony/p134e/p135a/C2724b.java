package com.bytedance.p126ad.symphony.p134e.p135a;

import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.a.b */
public class C2724b {

    /* renamed from: a */
    public String f8235a = "";

    /* renamed from: b */
    public String f8236b = "";

    /* renamed from: c */
    public boolean f8237c;

    /* renamed from: d */
    public boolean f8238d;

    /* renamed from: e */
    public String f8239e;

    /* renamed from: f */
    public double f8240f;

    /* renamed from: g */
    private String f8241g;

    public String toString() {
        if (this.f8241g == null) {
            return "";
        }
        return this.f8241g;
    }

    /* renamed from: a */
    public final boolean mo7277a() {
        if (C9431p.m18664a(this.f8235a) || C9431p.m18664a(this.f8236b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m7786a(String str) {
        if (str == null || str.length() <= 2) {
            return "";
        }
        return str.substring(0, str.length() - 2);
    }

    public C2724b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f8241g = jSONObject.toString();
            this.f8235a = jSONObject.optString("id", "");
            this.f8236b = jSONObject.optString("type", "");
            this.f8237c = jSONObject.optBoolean("disable_play_when_visible", false);
            this.f8238d = jSONObject.optBoolean("disable_content_ad", false);
            this.f8239e = jSONObject.optString("media_aspect_ratio");
            this.f8240f = jSONObject.optDouble("local_ecpm_threshold", ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        }
    }
}
