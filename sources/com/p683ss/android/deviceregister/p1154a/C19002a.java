package com.p683ss.android.deviceregister.p1154a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p683ss.android.deviceregister.p1155b.p1156a.p1157a.C19021c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.deviceregister.a.a */
public final class C19002a {

    /* renamed from: a */
    public static volatile String f52308a = "applog_stats";

    /* renamed from: b */
    public static boolean f52309b;

    /* renamed from: c */
    private static String f52310c;

    /* renamed from: a */
    public static String m46175a() {
        return f52308a;
    }

    /* renamed from: b */
    public static boolean m46176b() {
        return f52309b;
    }

    /* renamed from: c */
    public static String m46177c() {
        if (TextUtils.isEmpty(f52310c)) {
            f52310c = C19021c.m46256a("c25zc2RrX29wZW51ZGlk");
        }
        return f52310c;
    }

    /* renamed from: a */
    public static SharedPreferences m46174a(Context context) {
        return C35807d.m80935a(context, m46175a(), 0);
    }
}
