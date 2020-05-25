package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C15088b;

/* renamed from: com.google.android.gms.internal.measurement.bk */
public final class C16567bk {

    /* renamed from: a */
    private static volatile C15088b f46563a = new C16551av();

    /* renamed from: a */
    public static void m39526a(String str, Object obj) {
        C16568bl b = C16568bl.m39529b();
        if (b != null) {
            b.mo32501d(str, obj);
            return;
        }
        if (m39527a(3) && obj != null) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(":");
            sb.append(valueOf);
        }
    }

    /* renamed from: a */
    private static boolean m39527a(int i) {
        if (f46563a == null || f46563a.mo27828a() > 3) {
            return false;
        }
        return true;
    }
}
