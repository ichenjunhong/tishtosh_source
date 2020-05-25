package com.bytedance.android.livesdk.browser.p291e;

import android.text.TextUtils;
import com.bytedance.android.live.core.p225d.C3837e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.e.a */
public final class C4746a {

    /* renamed from: a */
    public static long f12953a;

    /* renamed from: b */
    private static long f12954b;

    /* renamed from: a */
    public static void m11309a() {
        f12954b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static void m11310a(String str) {
        long currentTimeMillis = System.currentTimeMillis() - f12954b;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        m11312a(jSONObject, "from", str);
        C3837e.m9746a("ttlive_webview_init_all", currentTimeMillis, jSONObject);
    }

    /* renamed from: a */
    private static void m11312a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m11311a(String str, String str2, int i) {
        long currentTimeMillis = System.currentTimeMillis() - f12953a;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        m11312a(jSONObject, "from", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        m11312a(jSONObject, "url", str2);
        if (i == 0) {
            C3837e.m9742a("ttlive_webview_offline_all", i, currentTimeMillis, jSONObject);
        } else {
            C3837e.m9749b("ttlive_webview_offline_all", i, jSONObject);
        }
    }
}
