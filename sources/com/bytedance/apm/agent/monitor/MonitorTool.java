package com.bytedance.apm.agent.monitor;

import com.bytedance.apm.C8936b;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9025g;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p501q.C9185g;
import org.json.JSONObject;

public class MonitorTool {
    public static void reportTraceTime(final String str, final String str2, final long j) {
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str2, j);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", str);
                    try {
                        C8936b.m17654a("page_load", "page_load", jSONObject, jSONObject2, (JSONObject) null);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
            }
        });
    }

    public static void monitorStart(JSONObject jSONObject, long j, long j2) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("begin_time", j);
            jSONObject2.put("end_time", j2);
            jSONObject2.put("from", "monitor-plugin");
            C8936b.m17660b("start", jSONObject, null, jSONObject2);
        } catch (Exception unused) {
        }
    }

    public static void monitorUIAction(String str, String str2, JSONObject jSONObject) {
        try {
            C9149b.m18170a().mo16524a((Runnable) new Runnable(str, str2, C9185g.m18237b(jSONObject), C8936b.m17649a((JSONObject) null)) {

                /* renamed from: a */
                final /* synthetic */ String f24306a;

                /* renamed from: b */
                final /* synthetic */ String f24307b;

                /* renamed from: c */
                final /* synthetic */ JSONObject f24308c;

                /* renamed from: d */
                final /* synthetic */ JSONObject f24309d;

                public final void run() {
                    C9014a.m17825a().mo16336a((C9028d) new C9025g(this.f24306a, this.f24307b, this.f24308c, this.f24309d));
                }

                {
                    this.f24306a = r1;
                    this.f24307b = r2;
                    this.f24308c = r3;
                    this.f24309d = r4;
                }
            });
        } catch (Exception unused) {
        }
    }

    public static void monitorStart(String str, long j, long j2) {
        if (j2 > j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, j2 - j);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("begin_time", j);
                jSONObject2.put("end_time", j2);
                C8936b.m17660b("start", jSONObject, null, jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    public static void monitorPerformance(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C8936b.m17660b(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void monitorSLA(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C8936b.m17650a(j, j2, str, str2, str3, i, jSONObject);
    }
}
