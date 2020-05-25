package com.bytedance.android.p140a.p151b;

import android.net.Uri;
import com.bytedance.android.p140a.p141a.p147f.C2790a;
import com.bytedance.android.p140a.p141a.p150i.C2802d;
import com.bytedance.android.p140a.p151b.p153b.C2822d;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.b */
public class C2810b extends C2790a {

    /* renamed from: a */
    private static volatile C2810b f8398a;

    /* renamed from: b */
    public final void mo7407b() {
        mo7393a("c2s_network_type_on_trigger", C2802d.m7968b(), (JSONObject) null);
    }

    /* renamed from: c */
    public final void mo7408c() {
        mo7393a("c2s_network_type_on_retry", C2802d.m7968b(), (JSONObject) null);
    }

    /* renamed from: a */
    public static C2810b m7996a() {
        if (f8398a == null) {
            synchronized (C2810b.class) {
                if (f8398a == null) {
                    f8398a = new C2810b();
                }
            }
        }
        return f8398a;
    }

    /* renamed from: a */
    public final void mo7406a(C2822d dVar, long j) {
        int i;
        if (dVar != null) {
            i = dVar.f8415a;
        } else {
            i = -1;
        }
        JSONObject a = m7935a((JSONObject) null, j);
        JSONObject jSONObject = new JSONObject();
        if (dVar != null) {
            try {
                JSONObject a2 = m7936a(jSONObject, dVar.f8420f);
                try {
                    a2.put("host", Uri.parse(dVar.f8419e.f8407b).getHost());
                    a2.put("method", dVar.f8419e.f8408c);
                } catch (Throwable unused) {
                }
                jSONObject = a2;
            } catch (Throwable unused2) {
            }
        }
        mo7394a("c2s_network_response_status", i, a, jSONObject);
    }
}
