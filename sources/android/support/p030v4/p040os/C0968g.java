package android.support.p030v4.p040os;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: android.support.v4.os.g */
public final class C0968g {
    /* renamed from: a */
    public static void m2813a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m2814a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
