package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.google.gson.C18091u;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1407a.C23457c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.cj */
public final class C47769cj {
    /* renamed from: a */
    private static void m103399a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
        }
        C9951d.m19997a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m103400a(Throwable th, String str, String str2) {
        if (th != null && !TextUtils.isEmpty(str)) {
            if ((th instanceof C23457c) || (th instanceof C18091u)) {
                m103399a("aweme_parse_error_log", "", C23088c.m56631a().mo47824a("errorUrl", str).mo47824a("errorDesc", Log.getStackTraceString(th)).mo47824a("errorResponse", str2).mo47825b());
            }
        }
    }
}
