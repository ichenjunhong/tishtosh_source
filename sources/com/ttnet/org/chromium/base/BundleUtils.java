package com.ttnet.org.chromium.base;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import dalvik.system.BaseDexClassLoader;

public class BundleUtils {
    private static final boolean sIsBundle;

    public static boolean isBundle() {
        return sIsBundle;
    }

    static {
        boolean z;
        try {
            Class.forName("org.chromium.base.BundleCanary");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        sIsBundle = z;
    }

    private static String getNativeLibraryPath(String str) {
        Throwable th;
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            String findLibrary = ((BaseDexClassLoader) ContextUtils.getApplicationContext().getClassLoader()).findLibrary(str);
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return findLibrary;
        } catch (Throwable th2) {
            C17840a.m43752a(th, th2);
        }
        throw th;
    }
}
