package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.apm.C8936b;
import com.bytedance.keva.Keva;
import com.google.gson.C17971f;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.setting.b */
public final class C41562b {

    /* renamed from: a */
    public static final C41562b f105272a = new C41562b();

    /* renamed from: b */
    public Keva f105273b;

    /* renamed from: c */
    public Random f105274c = new Random();

    /* renamed from: d */
    public boolean f105275d;

    /* renamed from: e */
    private C17971f f105276e;

    /* renamed from: a */
    public final C17971f mo85347a() {
        if (this.f105276e == null) {
            this.f105276e = new C17971f();
        }
        return this.f105276e;
    }

    private C41562b() {
        boolean z;
        if (this.f105274c.nextInt(1000) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f105275d = z;
        System.nanoTime();
        this.f105273b = Keva.getRepoSync("abtest_data_repo", 1);
    }

    /* renamed from: a */
    public final void mo85348a(String str, String str2) {
        this.f105273b.storeString(str, str2);
    }

    /* renamed from: a */
    public final boolean mo85349a(String str, boolean z) {
        return this.f105273b.getBoolean(str, z);
    }

    /* renamed from: a */
    public static void m91399a(Object obj, Object obj2, boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("kv_perf_type", "ab");
            jSONObject.put("kv_perf_key", str);
            jSONObject.put("kv_perf_spsp_value", obj2);
            jSONObject.put("kv_perf_keva_value", obj);
            jSONObject.put("kv_perf_read_same", true);
        } catch (Throwable unused) {
        }
        C8936b.m17655a("aweme_monitor_ab_report", jSONObject);
    }
}
