package com.p683ss.p2568f.p2569a.p2571b;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.f.a.b.d */
public final class C51310d {

    /* renamed from: a */
    public final String f128226a;

    /* renamed from: b */
    public final String f128227b = null;

    /* renamed from: c */
    public String f128228c;

    /* renamed from: a */
    public final String mo101855a() {
        JSONObject jSONObject;
        try {
            if (this.f128228c != null) {
                jSONObject = new JSONObject(this.f128228c);
                if (jSONObject != null || !jSONObject.has("VCodec")) {
                    return null;
                }
                String optString = jSONObject.optString("VCodec");
                if (!TextUtils.isEmpty(optString)) {
                    return optString;
                }
                return null;
            }
        } catch (JSONException unused) {
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return null;
    }

    public C51310d(String str, String str2, String str3) {
        this.f128226a = str;
        this.f128228c = str3;
    }
}
