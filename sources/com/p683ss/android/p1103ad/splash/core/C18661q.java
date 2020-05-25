package com.p683ss.android.p1103ad.splash.core;

import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18610h;
import com.p683ss.android.p1103ad.splash.p1123g.C18740f;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.ss.android.ad.splash.core.q */
class C18661q {

    /* renamed from: a */
    private static C18661q f51576a;

    private C18661q() {
    }

    /* renamed from: a */
    public static C18661q m45313a() {
        if (f51576a == null) {
            synchronized (C18661q.class) {
                if (f51576a == null) {
                    f51576a = new C18661q();
                }
            }
        }
        return f51576a;
    }

    /* renamed from: b */
    public static List<C18602b> m45315b() {
        JSONArray jSONArray;
        try {
            String string = C18673u.m45399a().f51608b.getString("splash_ad_first_show_data", "");
            if (!C18747l.m45742a(string)) {
                jSONArray = new JSONArray(string);
            } else {
                jSONArray = new JSONArray();
            }
            return C18744j.m45713a(jSONArray, 0, true);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C18610h mo38085c() {
        long currentTimeMillis = System.currentTimeMillis();
        String i = C18673u.m45399a().mo38166i();
        String string = C18673u.m45399a().f51608b.getString("splash_ad_data", "");
        new StringBuilder("read sp data time cost: ").append(System.currentTimeMillis() - currentTimeMillis);
        C18610h hVar = new C18610h();
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            List<C18602b> b = m45316b(i);
            List<C18602b> b2 = m45316b(string);
            Map<String, C18602b> a = C18744j.m45715a(b);
            hVar.f51381b = b2;
            hVar.f51382c = a;
            hVar.f51380a = b;
            if (!C18740f.m45691a(b2)) {
                hVar.f51384e = C18610h.m45089a(b2);
            } else {
                hVar.f51384e = C18610h.m45089a(b);
            }
            new StringBuilder("parseSplashAdList time : ").append(System.currentTimeMillis() - currentTimeMillis2);
            return hVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static List<C18602b> m45314a(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!C18747l.m45742a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            new StringBuilder("generate json array time : ").append(System.currentTimeMillis() - currentTimeMillis);
            List<C18602b> a = C18744j.m45713a(jSONArray, 0, true);
            new StringBuilder("parseSplashAdList time : ").append(System.currentTimeMillis() - currentTimeMillis);
            return a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static List<C18602b> m45316b(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!C18747l.m45742a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            List<C18602b> a = C18744j.m45714a(jSONArray, false);
            new StringBuilder("parseSplashAdList time : ").append(System.currentTimeMillis() - currentTimeMillis);
            return a;
        } catch (Exception unused) {
            return null;
        }
    }
}
