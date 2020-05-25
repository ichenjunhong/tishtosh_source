package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.measurement.eq */
public class C16662eq {

    /* renamed from: a */
    private static volatile UserManager f46891a;

    /* renamed from: b */
    private static volatile boolean f46892b = (!m39809a());

    private C16662eq() {
    }

    /* renamed from: a */
    public static boolean m39809a() {
        return VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    static boolean m39810a(Context context) {
        boolean z = f46892b;
        if (!z) {
            boolean z2 = z;
            int i = 1;
            while (true) {
                if (i > 2) {
                    break;
                }
                UserManager b = m39811b(context);
                if (b == null) {
                    f46892b = true;
                    return true;
                }
                try {
                    if (!b.isUserUnlocked()) {
                        if (b.isUserRunning(Process.myUserHandle())) {
                            z2 = false;
                            f46892b = z2;
                        }
                    }
                    z2 = true;
                    f46892b = z2;
                } catch (NullPointerException unused) {
                    f46891a = null;
                    i++;
                }
            }
            z = z2;
            if (z) {
                f46891a = null;
            }
        }
        return z;
    }

    /* renamed from: b */
    private static UserManager m39811b(Context context) {
        UserManager userManager = f46891a;
        if (userManager == null) {
            synchronized (C16662eq.class) {
                userManager = f46891a;
                if (userManager == null) {
                    UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                    f46891a = userManager2;
                    userManager = userManager2;
                }
            }
        }
        return userManager;
    }
}
