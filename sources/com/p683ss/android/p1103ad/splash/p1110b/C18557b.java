package com.p683ss.android.p1103ad.splash.p1110b;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.b.b */
public class C18557b {

    /* renamed from: c */
    private static volatile C18557b f51148c;

    /* renamed from: a */
    public volatile boolean f51149a = true;

    /* renamed from: b */
    public volatile long f51150b;

    /* renamed from: d */
    private volatile long f51151d;

    private C18557b() {
    }

    /* renamed from: b */
    public final void mo37851b() {
        this.f51151d = System.currentTimeMillis();
        this.f51149a = true;
    }

    /* renamed from: a */
    public static C18557b m44917a() {
        if (f51148c == null) {
            synchronized (C18557b.class) {
                if (f51148c == null) {
                    f51148c = new C18557b();
                }
            }
        }
        return f51148c;
    }

    /* renamed from: d */
    public final void mo37853d() {
        long currentTimeMillis = System.currentTimeMillis() - this.f51150b;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_ad_show_total_time", currentTimeMillis);
            C18550a.m44899a().mo37845a("service_splash_ad_show_time", jSONObject, (JSONObject) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public void mo37852c() {
        if (m44917a().f51149a) {
            try {
                long j = this.f51150b - this.f51151d;
                if (j > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("duration_init_to_show_ad", Long.valueOf(j));
                    C18550a.m44899a().mo37845a("service_init_to_show_ad", jSONObject, (JSONObject) null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m44918a(int i) {
        C18550a.m44899a().mo37843a("service_splash_ad_show_result", i, (JSONObject) null);
    }
}
