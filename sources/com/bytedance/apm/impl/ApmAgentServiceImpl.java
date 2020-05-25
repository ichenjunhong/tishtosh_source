package com.bytedance.apm.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8936b.C89456;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9022d;
import com.bytedance.apm.p485h.C9048j;
import com.bytedance.apm.p485h.C9049k;
import com.bytedance.apm.p493m.C9139c;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.apm.p501q.C9193j;
import com.bytedance.p502b.p503a.p506b.p507a.C9219a;
import com.bytedance.p582g.p583a.p584a.C9946b;
import com.bytedance.services.apm.api.IApmAgent;
import org.json.JSONObject;

public class ApmAgentServiceImpl implements IApmAgent {
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        C8936b.m17655a(str, jSONObject);
    }

    public void monitorLog(String str, JSONObject jSONObject) {
        C8936b.m17655a(str, jSONObject);
    }

    public void monitorExceptionLog(String str, JSONObject jSONObject) {
        C9149b.m18170a().mo16524a((Runnable) new Runnable(str, C8936b.m17649a(jSONObject)) {

            /* renamed from: a */
            final /* synthetic */ String f24301a;

            /* renamed from: b */
            final /* synthetic */ JSONObject f24302b;

            public final void run() {
                C9014a.m17825a().mo16336a(new C9022d(this.f24301a, this.f24302b));
            }

            {
                this.f24301a = r1;
                this.f24302b = r2;
            }
        });
    }

    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C8936b.m17656a(str, jSONObject, jSONObject2);
    }

    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C8936b.m17651a(str, i, jSONObject);
    }

    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C8936b.m17657a(str, jSONObject, jSONObject2, jSONObject3);
    }

    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C8936b.m17652a(str, i, jSONObject, jSONObject2);
    }

    public void reportLegacyMonitorLog(Context context, long j, long j2, boolean z) {
        Context a = C8976c.m17736a();
        ApmDelegate a2 = ApmDelegate.m17947a();
        C89456 r0 = new Runnable(a, j, j2, z) {

            /* renamed from: a */
            final /* synthetic */ Context f24318a;

            /* renamed from: b */
            final /* synthetic */ long f24319b;

            /* renamed from: c */
            final /* synthetic */ long f24320c;

            /* renamed from: d */
            final /* synthetic */ boolean f24321d;

            public final void run() {
                StringBuilder sb;
                try {
                    C9219a aVar = new C9219a(this.f24318a);
                    long j = this.f24319b;
                    long j2 = this.f24320c;
                    boolean z = this.f24321d;
                    if (j > 0 && j2 > 0) {
                        if (j2 >= j) {
                            if ((!z || C9946b.m19987a(aVar.f25199a)) && C9193j.m18259b(aVar.f25199a) && C8976c.m17747c()) {
                                long currentTimeMillis = System.currentTimeMillis();
                                C9048j jVar = null;
                                if (C9190h.m18253a(null)) {
                                    sb = new StringBuilder();
                                    sb.append(j + j2);
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(j + j2);
                                    sb.append(TextUtils.join(",", null));
                                }
                                String sb2 = sb.toString();
                                if (!TextUtils.isEmpty(sb2)) {
                                    if (C9219a.f25198b.containsKey(sb2)) {
                                        jVar = (C9048j) C9219a.f25198b.get(sb2);
                                    } else {
                                        jVar = new C9048j(sb2, 0);
                                        C9219a.f25198b.put(sb2, jVar);
                                    }
                                }
                                if (jVar != null && currentTimeMillis - jVar.f24716b >= 600000) {
                                    jVar.f24716b = currentTimeMillis;
                                    C9139c a = C9139c.m18134a();
                                    C9049k kVar = new C9049k(j, j2, null);
                                    a.mo16509a(kVar);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }

            {
                this.f24318a = r1;
                this.f24319b = r2;
                this.f24320c = r4;
                this.f24321d = r6;
            }
        };
        a2.mo16430a((Runnable) r0);
    }
}
