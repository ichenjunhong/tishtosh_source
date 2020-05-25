package com.bytedance.apm.p471b.p474c;

import android.text.TextUtils;
import com.bytedance.apm.p471b.C8949a;
import com.bytedance.apm.p471b.p472a.C8955d;
import com.bytedance.apm.p471b.p473b.C8960b;
import com.bytedance.apm.p471b.p474c.p475a.C8964b;
import com.bytedance.apm.p471b.p474c.p475a.C8965c;
import com.bytedance.apm.p480f.C9018b;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9022d;
import com.bytedance.apm.p485h.C9040b;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b.c.f */
public final class C8972f extends C8961a<C8965c> implements C8955d {
    /* renamed from: a */
    public final String mo16229a() {
        return "android.location.ILocationManager";
    }

    public C8972f() {
        super("location");
    }

    /* renamed from: a */
    public final void mo16262a(C8960b bVar, C9040b bVar2) {
        if (this.f24409a.equals(bVar2.f24665d)) {
            if (bVar2.f24663b) {
                bVar.f24364d += bVar2.f24668g;
                return;
            }
            bVar.f24369i += bVar2.f24668g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo16246a(C8964b bVar, long j) {
        C8965c cVar = (C8965c) bVar;
        if (j >= 120000) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", 32).put("location_request_time", j).put("location_info", cVar);
                C9018b.m17833a(jSONObject, "battery_trace");
                C9014a.m17825a().mo16336a((C9028d) new C9022d("battery_trace", jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16244a(double d, double d2) {
        int i;
        if (d >= 240000.0d) {
            i = 33;
        } else {
            i = 0;
        }
        if (d2 >= 5.0d) {
            i |= 34;
        }
        if (i != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i).put("total_hold_time", d).put("total_acquire_count", d2).put("location_maps", this.f24412d);
                C9014a.m17825a().mo16336a((C9028d) new C9022d("battery_trace", jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo16230a(Object obj, Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if (TextUtils.equals(name, "requestLocationUpdates")) {
                mo16250d();
                if (!(!C8949a.m17661a().f24337b || objArr[0] == null || objArr[1] == null)) {
                    int hashCode = objArr[0].hashCode();
                    C8965c cVar = (C8965c) this.f24412d.get(Integer.valueOf(hashCode));
                    if (cVar == null) {
                        cVar = new C8965c();
                        cVar.f24398e = -1;
                        cVar.f24401a = objArr[0].toString();
                    }
                    cVar.f24397d = System.currentTimeMillis();
                    cVar.f24398e = -1;
                    cVar.f24400g = Thread.currentThread().getStackTrace();
                    cVar.f24399f = Thread.currentThread().getName();
                    this.f24412d.put(Integer.valueOf(hashCode), cVar);
                }
                return;
            }
            if (TextUtils.equals(name, "removeUpdates") && objArr[0] != null) {
                mo16251e();
                if (C8949a.m17661a().f24337b) {
                    int hashCode2 = objArr[0].hashCode();
                    C8965c cVar2 = (C8965c) this.f24412d.get(Integer.valueOf(hashCode2));
                    if (cVar2 != null) {
                        cVar2.f24398e = System.currentTimeMillis();
                        this.f24412d.put(Integer.valueOf(hashCode2), cVar2);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
