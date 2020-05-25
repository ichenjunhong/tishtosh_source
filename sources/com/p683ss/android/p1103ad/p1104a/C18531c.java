package com.p683ss.android.p1103ad.p1104a;

import android.content.Context;
import com.p683ss.android.p1103ad.p1104a.p1105a.C18516b;
import com.p683ss.android.p1103ad.p1104a.p1105a.C18517c;
import com.p683ss.android.p1103ad.p1104a.p1105a.C18519e;
import com.p683ss.android.p1103ad.p1104a.p1105a.C18520f;
import com.p683ss.android.p1103ad.p1104a.p1105a.C18521g;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.a.c */
public final class C18531c {

    /* renamed from: a */
    public static C18520f f51067a;

    /* renamed from: b */
    public static C18517c f51068b;

    /* renamed from: c */
    public static C18516b f51069c;

    /* renamed from: d */
    public static String f51070d;

    /* renamed from: e */
    public static C18521g f51071e;

    /* renamed from: f */
    public static Context f51072f;

    /* renamed from: g */
    public static int f51073g;

    /* renamed from: h */
    private static C18519e f51074h;

    /* renamed from: i */
    private static int f51075i;

    /* renamed from: j */
    private static int f51076j;

    /* renamed from: a */
    public static String m44842a() {
        return f51070d;
    }

    /* renamed from: b */
    public static C18519e m44844b() {
        return f51074h;
    }

    /* renamed from: c */
    public static C18521g m44845c() {
        return f51071e;
    }

    /* renamed from: d */
    public static int m44846d() {
        return f51073g;
    }

    /* renamed from: e */
    public static int m44847e() {
        return f51075i;
    }

    /* renamed from: f */
    public static int m44848f() {
        return f51076j;
    }

    /* renamed from: g */
    public static Context m44849g() {
        return f51072f;
    }

    /* renamed from: a */
    public static void m44843a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", "smartphone");
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("category", "umeng");
            f51068b.mo37781a(str, str2, str3, str4, jSONObject);
        } catch (Exception unused) {
        }
    }
}
