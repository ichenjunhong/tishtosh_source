package com.bytedance.crash.p555n;

import android.text.TextUtils;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p546f.C9586c;
import com.bytedance.crash.p547g.C9590b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.n.q */
public final class C9710q {
    /* renamed from: a */
    public static void m19416a(C9584a aVar, C9586c cVar, C9571d dVar) {
        if (aVar != null) {
            m19417a(aVar.f26141a, cVar, dVar);
        }
    }

    /* renamed from: a */
    public static void m19417a(JSONObject jSONObject, C9586c cVar, C9571d dVar) {
        if (jSONObject != null && dVar != null) {
            long optLong = jSONObject.optLong("crash_time");
            int d = C9590b.m19081d(C9590b.m19078b("aid"));
            String a = C9616k.m19151c().mo17507a();
            if (optLong > 0 && d > 0 && !TextUtils.isEmpty(a) && !"0".equals(a) && !TextUtils.isEmpty(dVar.getName())) {
                try {
                    StringBuilder sb = new StringBuilder("android_");
                    sb.append(d);
                    sb.append("_");
                    sb.append(a);
                    sb.append("_");
                    sb.append(optLong);
                    sb.append("_");
                    sb.append(dVar);
                    String sb2 = sb.toString();
                    if (cVar != null) {
                        JSONObject jSONObject2 = cVar.f26149a;
                        if (jSONObject2 != null) {
                            jSONObject2.put("unique_key", sb2);
                        }
                    } else {
                        jSONObject.put("unique_key", sb2);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }
}
