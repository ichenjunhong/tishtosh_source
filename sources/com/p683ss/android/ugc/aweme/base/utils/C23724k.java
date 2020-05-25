package com.p683ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;

/* renamed from: com.ss.android.ugc.aweme.base.utils.k */
public final class C23724k {

    /* renamed from: a */
    private static int f63254a = -1;

    /* renamed from: b */
    private static int f63255b = -1;

    /* renamed from: c */
    private static int f63256c = -1;

    /* renamed from: d */
    private static int f63257d = -1;

    /* renamed from: b */
    public static int m58223b() {
        return m58224b(C11010c.m22280a());
    }

    /* renamed from: c */
    public static int m58225c() {
        Resources resources = C11010c.m22280a().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: d */
    public static int m58227d() {
        Resources resources = C11010c.m22280a().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static int[] m58222a() {
        DisplayMetrics displayMetrics = C11010c.m22280a().getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    /* renamed from: a */
    public static int m58221a(Context context) {
        if (f63255b > 0) {
            return f63255b;
        }
        if (context == null) {
            return 0;
        }
        m58230f(context);
        if (f63255b > 0) {
            return f63255b;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m58224b(Context context) {
        if (f63254a > 0) {
            return f63254a;
        }
        if (context == null) {
            return 0;
        }
        m58230f(context);
        if (f63254a > 0) {
            return f63254a;
        }
        return 0;
    }

    /* renamed from: c */
    public static int m58226c(Context context) {
        int i;
        int i2;
        if ("com.ss.android.ugc.aweme".equals(context.getPackageName())) {
            if (C18920g.m46047a()) {
                i2 = m58231g(context);
            } else {
                i2 = C9432q.m18670a(context);
            }
            i = C9432q.m18688b(context);
        } else {
            i2 = m58224b(context);
            i = m58221a(context);
        }
        if (i2 > i) {
            return i;
        }
        return i2;
    }

    /* renamed from: d */
    public static int m58228d(Context context) {
        int i = 0;
        if (!m58232h(context)) {
            return 0;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        }
        return i;
    }

    /* renamed from: e */
    public static int m58229e(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) context.getSystemService("window");
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            return displayMetrics.heightPixels;
        } catch (Exception unused) {
            return m58221a(context);
        }
    }

    /* renamed from: g */
    private static int m58231g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return m58224b(context);
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay == null) {
                return 0;
            }
            defaultDisplay.getSize(point);
            return point.x;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: f */
    private static void m58230f(Context context) {
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    if (defaultDisplay != null) {
                        if (VERSION.SDK_INT >= 17) {
                            defaultDisplay.getRealSize(point);
                        } else {
                            defaultDisplay.getSize(point);
                        }
                        f63255b = point.y;
                        f63254a = point.x;
                        return;
                    }
                    return;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                f63255b = displayMetrics.heightPixels;
                f63254a = displayMetrics.widthPixels;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    private static boolean m58232h(Context context) {
        boolean z;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier > 0) {
            z = resources.getBoolean(identifier);
        } else {
            z = false;
        }
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"qemu.hw.mainkeys"});
            if ("1".equals(str)) {
                return false;
            }
            if ("0".equals(str)) {
                return true;
            }
            return z;
        } catch (Exception unused) {
        }
    }
}
