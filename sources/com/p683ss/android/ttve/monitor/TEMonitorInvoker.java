package com.p683ss.android.ttve.monitor;

import com.p683ss.android.ttve.nativePort.C20129b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.TEMonitorInvoker */
public class TEMonitorInvoker {
    static {
        C20129b.m49686c();
    }

    public static native Map<String, String> nativeGetMap();

    public static native Map<String, String> nativeGetMapByType(int i);

    public static native void nativeInit();

    public static native void nativeMonitorPerf(int i);

    public static native void nativeMonitorPerfWithType(int i);

    public static native void nativePerfDouble(int i, String str, double d);

    public static native void nativePerfDouble(String str, double d);

    public static native void nativePerfLong(int i, String str, long j);

    public static native void nativePerfLong(String str, long j);

    public static native void nativePerfRational(String str, float f, float f2);

    public static native void nativePerfString(int i, String str, String str2);

    public static native void nativePerfString(String str, String str2);

    public static native void nativeReset();

    public static native void nativeReset(int i);

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f) {
        C20114g.m49651a(str, str2, f);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, long j) {
        C20114g.m49652a(str, str2, j);
    }

    public static void onNativeCallback_onMonitorLogMap(String str, String str2, HashMap hashMap) {
        C20114g.m49653a(str, str2, (Map) hashMap);
    }

    public static void onNativeCallback_onMonitorLogJson(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str3);
            try {
                if (C20114g.f55320d) {
                    jSONObject.put("service", str2);
                }
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        if (C20114g.f55320d) {
            C20114g.m49659b(C20114g.f55319c, str, jSONObject);
        } else {
            C20114g.m49656a(C20114g.f55319c, str2, jSONObject);
        }
    }
}
