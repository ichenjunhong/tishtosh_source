package com.p683ss.android.deviceregister.p1158c;

import android.content.Context;
import android.provider.Settings.Secure;
import com.bytedance.common.utility.C9431p;
import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;

/* renamed from: com.ss.android.deviceregister.c.b */
public final class C19031b {

    /* renamed from: a */
    private static String f52401a;

    /* renamed from: b */
    public static String m46308b(Context context) {
        return "02:00:00:00:00:00";
    }

    /* renamed from: a */
    public static String m46307a(Context context) {
        try {
            return Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m46309c(Context context) {
        if (!C9431p.m18664a(f52401a)) {
            return f52401a;
        }
        String str = null;
        try {
            Class.forName("com.google.android.gms.ads.b.a");
            C14903a a = C14902a.m30575a(context);
            if (a != null) {
                str = a.f38442a;
            }
        } catch (Throwable unused) {
        }
        if (!C9431p.m18664a(str)) {
            f52401a = str;
        }
        return str;
    }
}
