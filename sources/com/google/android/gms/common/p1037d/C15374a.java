package com.google.android.gms.common.p1037d;

import android.content.Context;
import com.google.android.gms.common.util.C15524o;

/* renamed from: com.google.android.gms.common.d.a */
public final class C15374a {

    /* renamed from: a */
    private static Context f39655a;

    /* renamed from: b */
    private static Boolean f39656b;

    /* renamed from: a */
    public static synchronized boolean m31942a(Context context) {
        synchronized (C15374a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f39655a == null || f39656b == null || f39655a != applicationContext) {
                f39656b = null;
                if (C15524o.m32301i()) {
                    f39656b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f39656b = Boolean.valueOf(true);
                    } catch (ClassNotFoundException unused) {
                        f39656b = Boolean.valueOf(false);
                    }
                }
                f39655a = applicationContext;
                boolean booleanValue = f39656b.booleanValue();
                return booleanValue;
            }
            boolean booleanValue2 = f39656b.booleanValue();
            return booleanValue2;
        }
    }
}
