package com.bytedance.apm;

import android.text.TextUtils;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.internal.ApmDelegate.C90626;
import com.bytedance.apm.p465a.C8911a;
import com.bytedance.apm.p465a.C8915c;
import com.bytedance.apm.p465a.C8919d;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p481a.C9015b;
import com.bytedance.apm.p480f.p482b.C9019a;
import com.bytedance.apm.p480f.p482b.C9020b;
import com.bytedance.apm.p480f.p482b.C9021c;
import com.bytedance.apm.p480f.p482b.C9024f;
import com.bytedance.apm.p489l.C9119i;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p501q.C9185g;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b */
public final class C8936b {
    /* renamed from: a */
    public static void m17657a(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, JSONObject jSONObject3) {
        final JSONObject a = m17649a(jSONObject3);
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                C9014a a = C9014a.m17825a();
                C9021c cVar = new C9021c(str, 0, null, jSONObject, jSONObject2, a);
                a.mo16336a(cVar);
            }
        });
    }

    /* renamed from: a */
    public static void m17656a(final String str, final JSONObject jSONObject, JSONObject jSONObject2) {
        final JSONObject a = m17649a(jSONObject2);
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                C9014a a = C9014a.m17825a();
                C9021c cVar = new C9021c(str, 0, jSONObject, null, null, a);
                a.mo16336a(cVar);
            }
        });
    }

    /* renamed from: b */
    public static int m17659b(String str) {
        try {
            return C9119i.m18089a(str, true);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m17658a(String str) {
        return ApmDelegate.m17947a().mo16433b(str);
    }

    /* renamed from: a */
    public static JSONObject m17649a(JSONObject jSONObject) {
        try {
            JSONObject b = C9185g.m18237b(jSONObject);
            if (b == null) {
                b = new JSONObject();
            }
            if (b.isNull("timestamp")) {
                b.put("timestamp", System.currentTimeMillis());
            }
            return b;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static void m17655a(final String str, JSONObject jSONObject) {
        final JSONObject a = m17649a(jSONObject);
        C9149b.m18170a().mo16524a((Runnable) new Runnable(false) {
            public final void run() {
                C9014a.m17825a().mo16336a(new C9020b(str, a, false));
            }
        });
    }

    /* renamed from: a */
    public static void m17651a(final String str, final int i, JSONObject jSONObject) {
        final JSONObject a = m17649a(jSONObject);
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                C9014a a = C9014a.m17825a();
                C9021c cVar = new C9021c(str, i, null, null, null, a);
                a.mo16336a(cVar);
            }
        });
    }

    /* renamed from: b */
    public static void m17660b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m17654a(str, "", jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public static void m17652a(final String str, final int i, final JSONObject jSONObject, JSONObject jSONObject2) {
        final JSONObject a = m17649a(jSONObject2);
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                C9014a a = C9014a.m17825a();
                C9021c cVar = new C9021c(str, i, jSONObject, null, null, a);
                a.mo16336a(cVar);
            }
        });
    }

    /* renamed from: a */
    public static void m17653a(String str, long j, long j2, String str2, C8919d dVar) {
        ApmDelegate a = ApmDelegate.m17947a();
        if (a.f24755p) {
            C90626 r0 = new Runnable(str, j, j2, str2, dVar, null) {

                /* renamed from: a */
                final /* synthetic */ String f24767a;

                /* renamed from: b */
                final /* synthetic */ long f24768b;

                /* renamed from: c */
                final /* synthetic */ long f24769c;

                /* renamed from: d */
                final /* synthetic */ String f24770d;

                /* renamed from: e */
                final /* synthetic */ C8919d f24771e;

                /* renamed from: f */
                final /* synthetic */ C8915c f24772f;

                public final void run() {
                    String str = this.f24767a;
                    long j = this.f24768b;
                    long j2 = this.f24769c;
                    String str2 = this.f24770d;
                    C8919d dVar = this.f24771e;
                    C8915c cVar = this.f24772f;
                    C8936b.m17651a("apm_event_stats_alog", 0, (JSONObject) null);
                    if (C8976c.m17736a() == null) {
                        C8936b.m17651a("apm_event_stats_alog_fail", 0, (JSONObject) null);
                    } else if (TextUtils.isEmpty(str)) {
                        C8936b.m17651a("apm_event_stats_alog_fail", 1, (JSONObject) null);
                    } else if (!new File(str).exists()) {
                        C8936b.m17651a("apm_event_stats_alog_fail", 2, (JSONObject) null);
                    } else {
                        if (dVar != null) {
                            dVar.mo15952a();
                        } else {
                            C8936b.m17651a("apm_event_stats_alog_fail", 3, (JSONObject) null);
                        }
                        C8911a.m17635a(str, j, j2, str2, cVar);
                    }
                }

                {
                    this.f24767a = r2;
                    this.f24768b = r3;
                    this.f24769c = r5;
                    this.f24770d = r7;
                    this.f24771e = r8;
                    this.f24772f = r9;
                }
            };
            a.mo16430a((Runnable) r0);
        }
    }

    /* renamed from: a */
    public static void m17654a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            final JSONObject b = C9185g.m18237b(jSONObject2);
            final JSONObject b2 = C9185g.m18237b(jSONObject);
            final JSONObject a = m17649a(jSONObject3);
            C9149b a2 = C9149b.m18170a();
            final String str3 = str;
            final String str4 = str2;
            C89434 r0 = new Runnable() {
                public final void run() {
                    C9024f fVar = new C9024f(str3, str4, b2, b, a);
                    C9014a.m17825a().mo16336a(fVar);
                }
            };
            a2.mo16524a((Runnable) r0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m17650a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        final JSONObject a = m17649a(jSONObject);
        C9149b a2 = C9149b.m18170a();
        final long j3 = j;
        final long j4 = j2;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final int i2 = i;
        C89371 r0 = new Runnable() {
            public final void run() {
                C9015b a = C9015b.m17827a();
                C9019a aVar = new C9019a("api_all", j3, j4, str4, str5, str6, i2, a);
                a.mo16336a(aVar);
            }
        };
        a2.mo16524a((Runnable) r0);
    }
}
