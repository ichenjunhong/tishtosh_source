package com.bytedance.ies.ugc.statisticlogger.config;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.C18846a;
import p2628d.C52857u;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.config.a */
public final class C11054a implements C18846a {

    /* renamed from: a */
    static boolean f29683a;

    /* renamed from: b */
    public static final C11054a f29684b = new C11054a();

    /* renamed from: c */
    private static String f29685c;

    private C11054a() {
    }

    /* renamed from: a */
    public final String mo20027a() {
        return C11010c.m22296q();
    }

    /* renamed from: b */
    public final int mo20028b() {
        return C11010c.m22289j();
    }

    /* renamed from: c */
    public final String mo20029c() {
        return C11010c.m22295p();
    }

    /* renamed from: d */
    public final Context mo20030d() {
        return C11010c.m22280a();
    }

    /* renamed from: e */
    public final int mo20031e() {
        return (int) C11010c.m22293n();
    }

    /* renamed from: g */
    public final int mo20033g() {
        return (int) C11010c.m22286g();
    }

    /* renamed from: i */
    public final String mo20035i() {
        return C11010c.m22288i();
    }

    /* renamed from: j */
    public final String mo20036j() {
        return C11010c.m22283d();
    }

    /* renamed from: k */
    public final int mo20037k() {
        return (int) C11010c.m22287h();
    }

    /* renamed from: f */
    public final String mo20032f() {
        if (f29683a) {
            return mo20035i();
        }
        return null;
    }

    /* renamed from: h */
    public final String mo20034h() {
        if (f29685c != null) {
            return f29685c;
        }
        try {
            Object systemService = C11010c.m22280a().getSystemService("phone");
            if (systemService != null) {
                f29685c = ((TelephonyManager) systemService).getDeviceId();
                if (f29685c == null) {
                    f29685c = "";
                }
                return f29685c;
            }
            throw new C52857u("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
        }
    }
}
