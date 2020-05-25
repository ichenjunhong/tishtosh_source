package com.p683ss.p2568f.p2569a.p2571b;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.f.a.b.c */
public final class C51309c {

    /* renamed from: a */
    private JSONObject f128224a;

    /* renamed from: b */
    private int f128225b;

    /* renamed from: a */
    public final boolean mo101851a(int i) {
        this.f128225b = i | this.f128225b;
        return true;
    }

    /* renamed from: a */
    public final boolean mo101852a(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = this.f128224a.getJSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return true;
        }
        return false;
    }

    public C51309c(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f128224a = jSONObject.getJSONObject("data");
            } catch (JSONException unused) {
            }
            this.f128225b = 0;
        }
    }

    /* renamed from: b */
    public final String mo101853b(String str, String str2) {
        String str3;
        if (!mo101852a(str)) {
            return null;
        }
        try {
            str3 = this.f128224a.getJSONObject(str).getJSONObject(str2).optString("sdk_params");
        } catch (JSONException unused) {
            str3 = null;
        }
        return str3;
    }

    /* renamed from: a */
    public final String mo101849a(String str, String str2) {
        String str3;
        if (!mo101852a(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(this.f128224a.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("VCodec");
        } catch (JSONException unused) {
            str3 = null;
        }
        return str3;
    }

    /* renamed from: b */
    public final String mo101854b(String str, String str2, String str3) {
        String str4;
        try {
            str4 = new JSONObject(this.f128224a.getJSONObject(str).getJSONObject(str3).optString("sdk_params")).optString("SuggestFormat");
        } catch (JSONException unused) {
            str4 = null;
        }
        if (str4 == null || str4.isEmpty()) {
            return null;
        }
        return str4;
    }

    /* renamed from: a */
    public final String mo101850a(String str, String str2, String str3) {
        String str4;
        String str5;
        if (!mo101852a(str)) {
            return null;
        }
        try {
            str4 = new JSONObject(this.f128224a.getJSONObject(str).getJSONObject(str3).optString("sdk_params")).optString("SuggestFormat");
        } catch (JSONException unused) {
            str4 = null;
        }
        if (str4 == null || str4.equals("") || str4.equals("avph")) {
            str4 = str2;
        }
        if ((this.f128225b & 1) <= 0 || !str4.equals("cmaf")) {
            str2 = str4;
        }
        try {
            str5 = this.f128224a.getJSONObject(str).getJSONObject(str3).optString(str2);
        } catch (JSONException unused2) {
            str5 = null;
        }
        return str5;
    }
}
