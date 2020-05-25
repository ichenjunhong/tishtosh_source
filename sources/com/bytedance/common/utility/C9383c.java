package com.bytedance.common.utility;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.utility.c */
public final class C9383c {

    /* renamed from: a */
    private static Boolean f25613a;

    /* renamed from: a */
    public static boolean m18564a() {
        if (f25613a != null) {
            return f25613a.booleanValue();
        }
        boolean z = false;
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[]{"ro.build.version.emui"});
            if ((invoke instanceof String) && !C9431p.m18664a((String) invoke) && !"unknown".equals((String) invoke)) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        f25613a = Boolean.valueOf(z);
        return z;
    }
}
