package com.appsflyer;

import com.C2240a;
import org.json.JSONException;
import org.json.JSONObject;

public class ServerConfigHandler {
    public static String getUrl(String str) {
        return C2240a.m6772a(str, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AppsFlyerLib.getInstance().getHostName()});
    }

    /* renamed from: ˎ */
    static JSONObject m7342(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            try {
                if (jSONObject.optBoolean("monitor", false)) {
                    C2537s.m7429().mo7039();
                } else {
                    C2537s.m7429().mo7042();
                    C2537s.m7429().mo7044();
                }
            } catch (JSONException unused) {
                C2537s.m7429().mo7042();
                C2537s.m7429().mo7044();
                return jSONObject;
            } catch (Throwable th) {
                th = th;
                AFLogger.afErrorLog(th.getMessage(), th);
                C2537s.m7429().mo7042();
                C2537s.m7429().mo7044();
                return jSONObject;
            }
        } catch (JSONException unused2) {
            jSONObject = null;
            C2537s.m7429().mo7042();
            C2537s.m7429().mo7044();
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            jSONObject = null;
            AFLogger.afErrorLog(th.getMessage(), th);
            C2537s.m7429().mo7042();
            C2537s.m7429().mo7044();
            return jSONObject;
        }
        return jSONObject;
    }
}
