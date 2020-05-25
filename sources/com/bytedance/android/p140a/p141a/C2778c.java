package com.bytedance.android.p140a.p141a;

import com.bytedance.android.p140a.p141a.p147f.C2790a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.c */
public class C2778c extends C2790a {

    /* renamed from: a */
    private static volatile C2778c f8344a;

    private C2778c() {
    }

    /* renamed from: a */
    public static C2778c m7898a() {
        if (f8344a == null) {
            synchronized (C2778c.class) {
                if (f8344a == null) {
                    f8344a = new C2778c();
                }
            }
        }
        return f8344a;
    }

    /* renamed from: a */
    public final void mo7374a(long j) {
        mo7395a("host_dispatch_track_wait", j, (JSONObject) null);
    }

    /* renamed from: a */
    private static JSONObject m7899a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sp", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final void mo7376b(String str, long j) {
        mo7395a("host_sp_cost_edit", j, m7899a(str));
    }

    /* renamed from: a */
    public final void mo7373a(int i, List<String> list) {
        int i2;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("url_count", Integer.valueOf(i2));
        } catch (Throwable unused) {
        }
        mo7394a("host_c2s_track_trigger", i, jSONObject, null);
    }

    /* renamed from: a */
    public final void mo7375a(String str, long j) {
        mo7395a("host_sp_cost_init", j, m7899a(str));
    }
}
