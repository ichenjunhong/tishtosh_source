package com.p683ss.android.ugc.aweme.app.p1376f;

import com.facebook.p987k.p988a.C14460b;
import com.p683ss.android.ugc.aweme.app.C23131p;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.f.b */
public final class C23087b {
    /* renamed from: a */
    public static void m56630a(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", C14460b.m29586a().mo26625b().toString());
            jSONObject.put("netWorkSpeed", (int) C14460b.m29586a().mo26626c());
            jSONObject.put("errorDesc", str3);
            jSONObject.put("errorUrl", str4);
            C23131p.m56692a(str, str2, jSONObject);
        } catch (Exception unused) {
        }
    }
}
