package com.p683ss.android.ugc.aweme.keva;

import com.bytedance.keva.KevaMonitor;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.bytedance.p723j.C11511a;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.keva.c */
public final class C35806c extends KevaMonitor {
    public final void loadLibrary(String str) {
        C11511a.m23578a(str);
    }

    public final void reportWarning(int i, String str, String str2, Object obj, String str3) {
        if (C9951d.m20000a("aweme_keva_monitor_report")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("kv_perf_global_id", C35804a.f91963a);
                jSONObject.put("kv_perf_report_type", 1);
                jSONObject.put("kv_perf_value_type", String.valueOf(i));
                jSONObject.put("kv_perf_name", str);
                jSONObject.put("kv_perf_key", str2);
                jSONObject.put("kv_perf_value", obj);
                jSONObject.put("kv_perf_msg", str3);
            } catch (Throwable unused) {
            }
            C9951d.m19997a("aweme_keva_monitor_report", jSONObject);
        }
    }

    public final void reportThrowable(int i, String str, String str2, Object obj, Throwable th) {
        if (C9951d.m20000a("aweme_keva_monitor_report")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("kv_perf_global_id", C35804a.f91963a);
                jSONObject.put("kv_perf_report_type", 0);
                jSONObject.put("kv_perf_value_type", String.valueOf(i));
                jSONObject.put("kv_perf_name", str);
                jSONObject.put("kv_perf_key", str2);
                jSONObject.put("kv_perf_value", obj);
                StringWriter stringWriter = new StringWriter();
                C17840a.m43751a(th, new PrintWriter(stringWriter, true));
                jSONObject.put("kv_perf_msg", stringWriter.getBuffer().toString());
            } catch (Throwable unused) {
            }
            C9951d.m19997a("aweme_keva_monitor_report", jSONObject);
        }
    }
}
