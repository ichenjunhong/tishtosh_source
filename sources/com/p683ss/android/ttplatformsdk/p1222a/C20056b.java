package com.p683ss.android.ttplatformsdk.p1222a;

import android.content.Context;

/* renamed from: com.ss.android.ttplatformsdk.a.b */
public class C20056b {

    /* renamed from: a */
    public static volatile C20055a f55122a;

    private C20056b() {
    }

    /* renamed from: a */
    public static void m49540a(Context context) {
        if (f55122a == null) {
            synchronized (C20056b.class) {
                if (f55122a == null) {
                    f55122a = C20055a.m49537a(context.getApplicationContext());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m49541a(Context context, String str, String str2) {
        m49540a(context);
        f55122a.mo42108a(str, str2);
    }

    /* renamed from: b */
    public static String m49543b(Context context, String str, String str2) {
        m49540a(context);
        return f55122a.mo42109b(str, str2);
    }

    /* renamed from: a */
    public static boolean m49542a(Context context, String str, Boolean bool) {
        m49540a(context);
        return f55122a.f55120a.getBoolean(str, bool.booleanValue());
    }
}
