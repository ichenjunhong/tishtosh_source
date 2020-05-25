package com.bytedance.crash.p547g;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p555n.C9695g;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.g.b */
public final class C9590b {
    /* renamed from: a */
    private static String m19075a() {
        String str = VERSION.RELEASE;
        if (str.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        return sb.toString();
    }

    /* renamed from: c */
    public static long m19080c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public static int m19081d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static String m19078b(String str) {
        if (C9616k.m19147a() != null) {
            Map a = C9616k.m19147a().mo17446a();
            if (a != null) {
                Object obj = a.get(str);
                if (obj != null) {
                    return String.valueOf(obj);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private static void m19079b(C9589a aVar) {
        if (aVar != null) {
            aVar.f26162d = m19075a();
            aVar.deviceId = C9616k.m19151c().mo17507a();
            aVar.f26163e = Build.MODEL;
            aVar.f26161c = "Android";
        }
    }

    /* renamed from: a */
    private static void m19076a(C9589a aVar) {
        aVar.f26162d = m19075a();
        aVar.appVersion = m19078b("app_version");
        aVar.updateVersionCode = m19078b("update_version_code");
        aVar.sdkVersion = "3121";
        aVar.aid = m19078b("aid");
        aVar.deviceId = C9616k.m19151c().mo17507a();
        aVar.f26163e = Build.MODEL;
        aVar.f26161c = "Android";
    }

    /* renamed from: a */
    static C9589a m19074a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(C9695g.m19362c(str));
            C9589a aVar = new C9589a();
            aVar.crashTime = jSONObject.optLong("crash_time");
            aVar.eventTime = jSONObject.optLong("event_time");
            aVar.event = jSONObject.optString("event");
            aVar.f26159a = jSONObject.optString("event_type");
            aVar.crashSummary = jSONObject.optString("crash_summary");
            aVar.crashType = jSONObject.optString("crash_type");
            aVar.state = jSONObject.optInt("state");
            aVar.f26160b = jSONObject.optString("error_info");
            aVar.f26161c = jSONObject.optString("os");
            aVar.f26162d = jSONObject.optString("os_version");
            aVar.f26163e = jSONObject.optString("device_model");
            aVar.appVersion = jSONObject.optString("app_version");
            aVar.updateVersionCode = jSONObject.optString("update_version_code");
            aVar.sdkVersion = jSONObject.optString("sdk_version");
            aVar.f26164f = jSONObject.optString("mcc_mnc");
            aVar.f26165g = jSONObject.optString("access");
            aVar.aid = jSONObject.optString("aid");
            aVar.deviceId = jSONObject.optString("device_id");
            aVar.f26166h = jSONObject.optString("uuid");
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m19077a(C9589a aVar, JSONObject jSONObject) {
        if (jSONObject != null) {
            aVar.appVersion = jSONObject.optString("app_version");
            aVar.updateVersionCode = jSONObject.optString("update_version_code");
            aVar.sdkVersion = jSONObject.optString("sdk_version");
            aVar.f26164f = jSONObject.optString("mcc_mnc");
            aVar.f26165g = jSONObject.optString("access");
            aVar.aid = jSONObject.optString("aid");
            aVar.deviceId = jSONObject.optString("device_id");
            aVar.f26163e = jSONObject.optString("device_model");
            aVar.f26161c = jSONObject.optString("os");
            aVar.f26162d = jSONObject.optString("os_version");
            m19079b(aVar);
        }
    }

    /* renamed from: a */
    public static C9589a m19073a(C9571d dVar, String str, JSONObject jSONObject) {
        int i;
        C9589a aVar = new C9589a();
        aVar.eventTime = System.currentTimeMillis();
        aVar.event = str;
        if (jSONObject != null) {
            int i2 = 0;
            if (dVar == C9571d.LAUNCH) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                    aVar.crashTime = optJSONObject.optLong("crash_time");
                    aVar.crashSummary = optJSONObject.optString("stack");
                }
            } else {
                aVar.crashTime = jSONObject.optLong("crash_time");
                aVar.crashSummary = jSONObject.optString("data");
            }
            if (!TextUtils.isEmpty(aVar.crashSummary)) {
                if (dVar == C9571d.NATIVE) {
                    i = Math.max(0, aVar.crashSummary.indexOf("\n"));
                } else {
                    String str2 = ": ";
                    i2 = Math.max(0, aVar.crashSummary.indexOf(str2) + str2.length());
                    i = Math.max(i2, aVar.crashSummary.indexOf("\n"));
                }
                if (i > 0) {
                    aVar.crashSummary = aVar.crashSummary.substring(i2, i);
                } else {
                    aVar.crashSummary = null;
                }
            }
            if (dVar != null) {
                aVar.crashType = dVar.getName();
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("header");
            if (optJSONObject2 != null) {
                m19077a(aVar, optJSONObject2);
            } else {
                m19076a(aVar);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static C9589a m19072a(C9571d dVar, String str, long j, Throwable th) {
        C9589a aVar = new C9589a();
        aVar.crashTime = j;
        aVar.eventTime = System.currentTimeMillis();
        aVar.event = str;
        if (th != null) {
            aVar.crashSummary = th.getMessage();
        }
        if (dVar != null) {
            aVar.crashType = dVar.getName();
        }
        m19076a(aVar);
        return aVar;
    }
}
