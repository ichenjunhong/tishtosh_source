package com.p683ss.android.p1103ad.splash.p1123g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.g.c */
public final class C18737c {

    /* renamed from: a */
    public static Boolean f51820a;

    /* renamed from: b */
    public static List<String> f51821b;

    /* renamed from: a */
    public static boolean m45675a(String str) {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.isEmpty(lowerCase)) {
            return lowerCase.equals(str);
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m45680f(View view) {
        if (view == null || !view.isAttachedToWindow()) {
            return false;
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return false;
        }
        DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
        if (displayCutout != null && displayCutout.getSafeInsetTop() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m45681g(View view) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Activity i = m45683i(view);
        if (i != null) {
            Window window = i.getWindow();
            if ((window.getAttributes().flags & PreloadTask.BYTE_UNIT_NUMBER) == 1024) {
                z = true;
            }
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if ((systemUiVisibility & 4) == 4 && (systemUiVisibility & PreloadTask.BYTE_UNIT_NUMBER) == 1024) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    public static Activity m45683i(View view) {
        if (view == null) {
            return null;
        }
        while (view != null) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return null;
    }

    /* renamed from: a */
    public static int m45674a(View view) {
        if (view == null) {
            return 0;
        }
        Context context = view.getContext();
        if (context.getResources().getConfiguration().orientation != 1) {
            return 0;
        }
        if (m45675a("oppo")) {
            return C18752p.m45756b(context);
        }
        if (VERSION.SDK_INT >= 28 && (context instanceof Activity) && view.isAttachedToWindow()) {
            DisplayCutout displayCutout = view.getRootWindowInsets().getDisplayCutout();
            if (displayCutout != null) {
                return displayCutout.getSafeInsetTop();
            }
        }
        return C18752p.m45756b(context);
    }

    /* renamed from: b */
    public static boolean m45676b(View view) {
        Class cls;
        if (VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m45680f(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
                return false;
            }
        } else {
            cls = Class.forName("com.huawei.android.util.HwNotchSizeUtil");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getMethod("hasNotchInScreen", new Class[0]).invoke(cls, new Object[0])).booleanValue();
    }

    /* renamed from: c */
    public static boolean m45677c(View view) {
        Class cls;
        if (VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m45680f(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("android.util.FtFeature");
            } catch (ClassNotFoundException | Exception | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return false;
            }
        } else {
            cls = Class.forName("android.util.FtFeature");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", new Class[]{Integer.TYPE}).invoke(cls, new Object[]{Integer.valueOf(32)})).booleanValue();
    }

    /* renamed from: d */
    public static boolean m45678d(View view) {
        if (VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m45680f(view);
        }
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("getInt", new Class[]{String.class, Integer.TYPE});
            declaredMethod.setAccessible(true);
            if (((Integer) declaredMethod.invoke(cls, new Object[]{"ro.miui.notch", Integer.valueOf(0)})).intValue() == 1) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e) {
            e.getMessage();
            return false;
        } catch (NoSuchMethodException e2) {
            e2.getMessage();
            return false;
        } catch (IllegalAccessException e3) {
            e3.getMessage();
            return false;
        } catch (InvocationTargetException e4) {
            e4.getMessage();
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m45679e(View view) {
        Class cls;
        if (VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m45680f(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("flyme.config.FlymeFeature");
            } catch (ClassNotFoundException | Exception | IllegalAccessException | NoSuchFieldException unused) {
                return false;
            }
        } else {
            cls = Class.forName("flyme.config.FlymeFeature");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getDeclaredField("IS_FRINGE_DEVICE").get(Boolean.valueOf(false))).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if ((r4 & com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask.BYTE_UNIT_NUMBER) == 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if ((r4 & com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask.BYTE_UNIT_NUMBER) == 0) goto L_0x004d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m45682h(android.view.View r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.app.Activity r4 = m45683i(r4)
            r1 = 1
            if (r4 == 0) goto L_0x004e
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 < r3) goto L_0x0034
            android.view.Window r2 = r4.getWindow()
            android.view.View r2 = r2.getDecorView()
            int r2 = r2.getSystemUiVisibility()
            android.view.Window r4 = r4.getWindow()
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            int r4 = r4.flags
            r3 = r2 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x004e
            r2 = r2 & 4
            if (r2 != 0) goto L_0x004e
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L_0x004e
            goto L_0x004d
        L_0x0034:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r2 < r3) goto L_0x004e
            android.view.Window r4 = r4.getWindow()
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            int r4 = r4.flags
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r4
            if (r2 == 0) goto L_0x004e
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.splash.p1123g.C18737c.m45682h(android.view.View):boolean");
    }
}
