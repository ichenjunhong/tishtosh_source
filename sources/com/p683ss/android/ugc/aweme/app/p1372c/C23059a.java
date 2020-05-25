package com.p683ss.android.ugc.aweme.app.p1372c;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.c.a */
public final class C23059a {
    /* renamed from: a */
    private static boolean m56591a() {
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

    /* renamed from: b */
    private static boolean m56593b(Context context) {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.equals("huawei", lowerCase) && !TextUtils.equals("honor", lowerCase)) {
            return false;
        }
        try {
            Class loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m56595d(Context context) {
        String str;
        if (context == null || VERSION.SDK_INT < 27) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier > 0) {
                str = resources.getString(identifier);
            } else {
                str = null;
            }
            if (str == null || TextUtils.isEmpty(str)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m56594c(Context context) {
        if (!(context instanceof Activity) || VERSION.SDK_INT < 28) {
            return false;
        }
        View decorView = ((Activity) context).getWindow().getDecorView();
        try {
            Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
            Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
            List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
            if (list == null || list.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m56592a(Context context) {
        boolean z;
        if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
            z = context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } else {
            z = false;
        }
        if (z || m56591a() || m56593b(context) || m56590a("ro.miui.notch", context) == 1 || m56594c(context) || m56595d(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m56590a(String str, Context context) {
        if ("Xiaomi".equals(Build.MANUFACTURER)) {
            try {
                Class loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) loadClass.getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(loadClass, new Object[]{new String(str), new Integer(0)})).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return 0;
    }
}
