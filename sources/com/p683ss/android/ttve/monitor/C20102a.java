package com.p683ss.android.ttve.monitor;

import com.p683ss.android.vesdk.C50792y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.a */
public final class C20102a {

    /* renamed from: a */
    private static boolean f55282a;

    /* renamed from: b */
    private static C20103a f55283b;

    /* renamed from: com.ss.android.ttve.monitor.a$a */
    public interface C20103a {
        /* renamed from: a */
        void mo42264a(String str, JSONObject jSONObject, String str2, String str3, String str4);
    }

    /* renamed from: a */
    public static synchronized void m49611a(C20103a aVar) {
        synchronized (C20102a.class) {
            f55283b = aVar;
        }
    }

    /* renamed from: a */
    public static void m49612a(String str, JSONObject jSONObject, String str2) {
        if (f55283b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("6.7.0.110");
            sb.append("-mt");
            String sb2 = sb.toString();
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("sdkVersion", sb2);
            } catch (JSONException unused) {
            }
            if (f55282a) {
                f55283b.mo42264a(str, jSONObject, null, null, str2);
            }
            if ("mt".endsWith("mt")) {
                try {
                    jSONObject.put("second_appid", "2780");
                    jSONObject.put("second_appname", "vesdk_abroad");
                } catch (JSONException unused2) {
                }
            } else {
                jSONObject.put("second_appid", "1357");
                jSONObject.put("second_appname", "video_editor_sdk");
            }
            StringBuilder sb3 = new StringBuilder("onInternalEventV3 ");
            sb3.append(str);
            sb3.append(": ");
            sb3.append(jSONObject);
            C50792y.m109911b("ApplogUtils", sb3.toString());
            f55283b.mo42264a(str, jSONObject, "1357", "video_editor_sdk", str2);
        }
    }
}
