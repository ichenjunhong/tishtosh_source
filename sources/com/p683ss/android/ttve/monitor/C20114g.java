package com.p683ss.android.ttve.monitor;

import android.text.TextUtils;
import com.p683ss.android.vesdk.C50792y;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.g */
public final class C20114g {

    /* renamed from: a */
    public static int f55317a = 0;

    /* renamed from: b */
    public static int f55318b = 1;

    /* renamed from: c */
    public static WeakReference<IMonitor> f55319c = null;

    /* renamed from: d */
    static boolean f55320d = true;

    /* renamed from: e */
    private static String f55321e = "";

    /* renamed from: a */
    public static void m49642a() {
        TEMonitorInvoker.nativeReset();
    }

    /* renamed from: a */
    public static boolean m49652a(String str, String str2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Long.valueOf(j));
        return m49653a(str, str2, (Map) hashMap);
    }

    /* renamed from: a */
    public static boolean m49651a(String str, String str2, float f) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Float.valueOf(f));
        return m49653a(str, str2, (Map) hashMap);
    }

    /* renamed from: a */
    public static boolean m49653a(String str, String str2, Map map) {
        return m49654a(f55319c, str, str2, map);
    }

    /* renamed from: a */
    private static boolean m49655a(WeakReference<IMonitor> weakReference, String str, Map map) {
        if (weakReference == null || weakReference.get() == null) {
            C50792y.m109914d("TEMonitor", "monitorEventToBusiness business monitor invalid");
            return false;
        } else if (TextUtils.isEmpty(str) || map == null) {
            C50792y.m109914d("TEMonitor", "monitorEventToBusiness param invalid");
            return false;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                m49650a(map, jSONObject);
                return m49656a(weakReference, str, jSONObject);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("monitorEventToBusiness json err: ");
                sb.append(e);
                C50792y.m109914d("TEMonitor", sb.toString());
                return false;
            }
        }
    }

    /* renamed from: a */
    static boolean m49656a(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        if (weakReference == null || weakReference.get() == null) {
            C50792y.m109914d("TEMonitor", "monitorEventJsonToBusiness business monitor invalid");
            return false;
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
            C50792y.m109914d("TEMonitor", "monitorEventJsonToBusiness param invalid");
            return false;
        } else {
            try {
                ((IMonitor) weakReference.get()).monitorLog(str, jSONObject);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Something happened when monitor log: ");
                sb.append(e);
                C50792y.m109914d("TEMonitor", sb.toString());
            }
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m49654a(WeakReference<IMonitor> weakReference, String str, String str2, Map map) {
        if (!f55320d) {
            return m49655a(weakReference, str2, map);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
            if (!str2.equals("iesve_veeditor_record_finish") && !str2.equals("iesve_veeditor_composition_finish") && !str2.equals("iesve_veeditor_edit")) {
                if (!str2.equals("iesve_veeditor_cut")) {
                    m49650a(map, jSONObject);
                    m49659b(weakReference, str, jSONObject);
                    return true;
                }
            }
            m49649a(str2, map, jSONObject);
            m49659b(weakReference, str, jSONObject);
            return true;
        } catch (JSONException unused) {
            C50792y.m109911b("TEMonitor", "No monitor callback, skip");
            return false;
        }
    }

    /* renamed from: b */
    private static String m49657b() {
        return C20110e.m49633a("device_id");
    }

    /* renamed from: b */
    public static void m49658b(int i) {
        TEMonitorInvoker.nativeMonitorPerfWithType(i);
    }

    /* renamed from: d */
    public static void m49661d(int i) {
        TEMonitorInvoker.nativeReset(i);
    }

    /* renamed from: a */
    public static void m49643a(int i) {
        TEMonitorInvoker.nativeMonitorPerf(i);
    }

    /* renamed from: a */
    private static int m49641a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("completed")) {
                return jSONObject.getInt("completed");
            }
            return 0;
        } catch (JSONException unused) {
            C50792y.m109914d("TEMonitor", "get complete filed error!");
            return 0;
        }
    }

    /* renamed from: c */
    public static void m49660c(int i) {
        if (i == 0) {
            m49645a(0, "te_record_err_code", 0);
            return;
        }
        if (i == 1) {
            m49645a(1, "te_edit_err_code", 0);
            m49645a(1, "te_composition_err_code", 0);
        }
    }

    /* renamed from: a */
    public static void m49647a(String str, double d) {
        if (TextUtils.isEmpty(str)) {
            C50792y.m109913c("TEMonitor", "perfDouble: key is null");
        } else {
            TEMonitorInvoker.nativePerfDouble(str, d);
        }
    }

    /* renamed from: a */
    public static void m49648a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            C50792y.m109913c("TEMonitor", "perfLong: key is null");
        } else {
            TEMonitorInvoker.nativePerfLong(str, j);
        }
    }

    /* renamed from: a */
    public static void m49650a(Map map, JSONObject jSONObject) throws JSONException {
        for (String str : map.keySet()) {
            str.startsWith("iesve_");
            int a = C20117i.m49668a(str);
            if (a == 1) {
                try {
                    jSONObject.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("Parse int error:");
                    sb.append(map.get(str));
                    C50792y.m109914d("TEMonitor", sb.toString());
                }
            } else if (a == 2) {
                try {
                    jSONObject.put(str, (double) Float.parseFloat(String.valueOf(map.get(str))));
                } catch (Exception unused2) {
                    C50792y.m109914d("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str, map.get(str));
            }
        }
    }

    /* renamed from: a */
    public static void m49645a(int i, String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            TEMonitorInvoker.nativePerfLong(i, str, j);
        }
    }

    /* renamed from: a */
    public static void m49644a(int i, String str, double d) {
        if (TextUtils.isEmpty(str)) {
            C50792y.m109913c("TEMonitor", "perfDouble: key is null");
        } else {
            TEMonitorInvoker.nativePerfDouble(i, str, d);
        }
    }

    /* renamed from: a */
    public static void m49646a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C50792y.m109913c("TEMonitor", "perfString: key is null");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        TEMonitorInvoker.nativePerfString(i, str, str2);
    }

    /* renamed from: b */
    static void m49659b(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        int i;
        String str2 = "sdk_video_edit_compose";
        if (jSONObject != null) {
            i = m49641a(jSONObject);
            try {
                if (jSONObject.has("service")) {
                    str2 = jSONObject.getString("service");
                }
                if (str2.equals("iesve_veeditor_record_finish") || str2.equals("iesve_veeditor_composition_finish")) {
                    if ("".equals(f55321e)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(m49657b());
                        sb.append("_");
                        sb.append(System.currentTimeMillis());
                        f55321e = sb.toString();
                    }
                    jSONObject.put("te_record_compose_vid", f55321e);
                }
                if (str2.equals("iesve_veeditor_composition_finish")) {
                    f55321e = "";
                }
            } catch (JSONException unused) {
            }
        } else {
            i = 0;
        }
        C20110e.m49638a(str2, i, jSONObject);
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                ((IMonitor) weakReference.get()).monitorLog(str, jSONObject);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    private static void m49649a(String str, Map map, JSONObject jSONObject) throws JSONException {
        int i;
        for (String str2 : map.keySet()) {
            if (str.equals("iesve_veeditor_record_finish") || str.equals("iesve_veeditor_composition_finish") || str.equals("iesve_veeditor_edit") || str.equals("iesve_veeditor_cut")) {
                i = C20117i.m49668a(str2);
            } else {
                i = C20117i.m49668a(str2);
            }
            if (i == 1) {
                try {
                    jSONObject.put(str2, Integer.parseInt(String.valueOf(map.get(str2))));
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("Parse int error:");
                    sb.append(map.get(str2));
                    C50792y.m109914d("TEMonitor", sb.toString());
                }
            } else if (i == 2) {
                try {
                    jSONObject.put(str2, (double) Float.parseFloat(String.valueOf(map.get(str2))));
                } catch (Exception unused2) {
                    C50792y.m109914d("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str2, map.get(str2));
            }
        }
    }
}
