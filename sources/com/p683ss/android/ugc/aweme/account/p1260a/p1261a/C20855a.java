package com.p683ss.android.ugc.aweme.account.p1260a.p1261a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.account.a.a.a */
public final class C20855a {
    /* renamed from: a */
    public static boolean m53171a() {
        if (!TextUtils.equals("vivo", Build.BRAND.toLowerCase())) {
            return false;
        }
        try {
            Class cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", new Class[]{Integer.TYPE}).invoke(cls, new Object[]{Integer.valueOf(32)})).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m53172a(Context context) {
        if (!TextUtils.equals("huawei", Build.BRAND.toLowerCase())) {
            return false;
        }
        try {
            Class loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }
}
