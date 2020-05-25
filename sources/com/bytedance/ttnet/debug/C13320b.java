package com.bytedance.ttnet.debug;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.bytedance.ttnet.debug.b */
public final class C13320b {

    /* renamed from: a */
    static String f34757a = "log_switcher";

    /* renamed from: b */
    static String f34758b = "x86_support";

    /* renamed from: c */
    private static String f34759c = "ttnet_debug_setting";

    /* renamed from: a */
    public static boolean m26824a(Context context) {
        return "true".equals(m26822a(context, f34757a));
    }

    /* renamed from: a */
    static String m26822a(Context context, String str) {
        if (context != null) {
            return C35807d.m80935a(context, f34759c, 0).getString(str, null);
        }
        return null;
    }

    /* renamed from: a */
    static void m26823a(Context context, String str, String str2) {
        if (context != null) {
            Editor edit = C35807d.m80935a(context, f34759c, 0).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
