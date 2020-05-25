package com.bytedance.android.monitor.webview;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.g */
public final class C8897g {

    /* renamed from: a */
    private JSONObject f24229a;

    /* renamed from: b */
    private JSONObject f24230b;

    /* renamed from: c */
    private JSONObject f24231c;

    /* renamed from: d */
    private JSONObject f24232d;

    /* renamed from: e */
    private JSONObject f24233e;

    /* renamed from: b */
    public static String m17532b() {
        return "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
    }

    /* renamed from: a */
    public final String mo15943a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C8905k.m17622a(jSONObject, "monitors", (Object) jSONObject2);
        C8905k.m17622a(jSONObject, "sendCommonParams", (Object) this.f24233e);
        m17531a(jSONObject2, this.f24229a);
        m17531a(jSONObject2, this.f24230b);
        m17531a(jSONObject2, this.f24231c);
        m17531a(jSONObject2, this.f24232d);
        String jSONObject3 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("SlardarHybrid('config', ");
        sb.append(jSONObject3);
        sb.append(")");
        return sb.toString();
    }

    public C8897g(String str) {
        JSONObject b = C8905k.m17626b(str);
        this.f24229a = C8905k.m17628d(b, "apmReportConfig");
        this.f24230b = C8905k.m17628d(b, "performanceReportConfig");
        this.f24231c = C8905k.m17628d(b, "errorMsgReportConfig");
        this.f24232d = C8905k.m17628d(b, "resourceTimingReportConfig");
        this.f24233e = C8905k.m17628d(b, "commonReportConfig");
    }

    /* renamed from: a */
    private static void m17531a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                C8905k.m17622a(jSONObject, str, C8905k.m17629e(jSONObject2, str));
            }
        }
    }
}
