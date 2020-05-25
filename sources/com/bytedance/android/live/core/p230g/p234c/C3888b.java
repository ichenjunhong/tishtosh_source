package com.bytedance.android.live.core.p230g.p234c;

import android.os.Build.VERSION;
import com.bytedance.android.live.core.p230g.C3866ad;
import com.bytedance.common.utility.p526f.C9407a;
import p2658e.p2659a.p2660a.p2661a.p2662a.C53032a;

/* renamed from: com.bytedance.android.live.core.g.c.b */
public final class C3888b extends C53032a {

    /* renamed from: a */
    static String f10897a;

    /* renamed from: b */
    static String f10898b;

    /* renamed from: c */
    public static boolean f10899c;

    static {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        f10899c = z;
    }

    /* renamed from: a */
    public static int m9829a() {
        try {
            if (m112779b()) {
                return Integer.parseInt(((String) C9407a.m18600a("android.os.SystemProperties", "get", "ro.miui.ui.version.name", "")).trim().substring(1));
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    /* renamed from: a */
    public static String m9830a(String str) {
        return C3866ad.m9801a(str);
    }
}
