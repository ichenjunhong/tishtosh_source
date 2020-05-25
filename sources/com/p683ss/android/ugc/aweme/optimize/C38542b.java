package com.p683ss.android.ugc.aweme.optimize;

import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.optimize.b */
public final class C38542b {

    /* renamed from: a */
    static Boolean f98037a;

    /* renamed from: b */
    static Boolean f98038b;

    /* renamed from: c */
    static Boolean f98039c;

    /* renamed from: d */
    static Boolean f98040d;

    /* renamed from: e */
    private static Keva m85886e() {
        return Keva.getRepo("optimize_config", 0);
    }

    /* renamed from: a */
    public static boolean m85881a() {
        if (f98037a == null) {
            f98037a = Boolean.valueOf(m85882a("log_open"));
        }
        return f98037a.booleanValue();
    }

    /* renamed from: b */
    public static boolean m85883b() {
        if (f98038b == null) {
            f98038b = Boolean.valueOf(m85882a("fps_open"));
        }
        return f98038b.booleanValue();
    }

    /* renamed from: c */
    public static boolean m85884c() {
        if (f98039c == null) {
            f98039c = Boolean.valueOf(m85882a("draw_checker"));
        }
        return f98039c.booleanValue();
    }

    /* renamed from: d */
    public static boolean m85885d() {
        if (f98040d == null) {
            f98040d = Boolean.valueOf(m85882a("battery"));
        }
        return f98040d.booleanValue();
    }

    /* renamed from: a */
    private static boolean m85882a(String str) {
        return m85886e().getBoolean(str, false);
    }

    /* renamed from: a */
    static void m85880a(String str, Boolean bool) {
        m85886e().storeBoolean(str, bool.booleanValue());
    }
}
