package com.p683ss.android.ttve.monitor;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.ApplogUtilsInvoker */
public class ApplogUtilsInvoker {
    public static native void nativeInit();

    public static void onNativeCallback_onAppLogJson(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        C20102a.m49612a(str, jSONObject, str3);
    }
}
