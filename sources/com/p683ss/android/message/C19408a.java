package com.p683ss.android.message;

import android.app.Application;
import com.bytedance.common.p519b.C9347a;
import com.p683ss.android.message.p1191b.C19470k;

/* renamed from: com.ss.android.message.a */
public final class C19408a {

    /* renamed from: a */
    private static Application f53646a;

    /* renamed from: b */
    private static boolean f53647b;

    /* renamed from: a */
    public static Application m47500a() {
        return f53646a;
    }

    /* renamed from: b */
    public static int m47502b() {
        return f53646a.getApplicationInfo().targetSdkVersion;
    }

    /* renamed from: a */
    public static void m47501a(Application application) {
        f53646a = application;
        if (!f53647b) {
            f53647b = true;
            if (C19470k.m47658c(application)) {
                f53646a.registerActivityLifecycleCallbacks(C9347a.m18519a());
            }
        }
    }
}
