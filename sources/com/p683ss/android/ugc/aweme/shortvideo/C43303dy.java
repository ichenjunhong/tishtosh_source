package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.utils.C47743c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dy */
public final class C43303dy {

    /* renamed from: a */
    private static int f109479a;

    /* renamed from: a */
    public static boolean m94969a() {
        return C39629l.m88232a().mo58583n().mo83103a(C40790a.IsForcedToDefaultFullScreenPlan);
    }

    /* renamed from: a */
    public static int m94967a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (defaultDisplay == null) {
            return 0;
        }
        defaultDisplay.getSize(point);
        return point.y;
    }

    /* renamed from: b */
    public static int m94971b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    /* renamed from: c */
    public static int m94972c(Context context) {
        if (f109479a != 0) {
            return f109479a;
        }
        Resources resources = context.getResources();
        int i = 0;
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        }
        f109479a = i;
        return i;
    }

    /* renamed from: a */
    public static void m94968a(Activity activity) {
        if (m94969a()) {
            C43862ga.m96320a(activity);
        } else if (C18920g.m46057d()) {
            C43798ev.m96239a(activity);
        } else {
            C43798ev.m96240b(activity);
        }
    }

    /* renamed from: e */
    public static int m94974e(Context context) {
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
            return m94967a(context);
        }
    }

    /* renamed from: d */
    public static int m94973d(Context context) {
        int i;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        Rect rect = new Rect();
        Activity a = C47743c.m103371a(context);
        if (a != null) {
            a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return Math.min(Math.max((m94974e(context) - m94972c(context)) - rect.height(), 0), i);
        } else if (!m94975f(context)) {
            return 0;
        } else {
            return i;
        }
    }

    /* renamed from: f */
    private static boolean m94975f(Context context) {
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

    /* renamed from: a */
    public static boolean m94970a(Context context, int i) {
        try {
            float e = ((float) m94974e(context)) / context.getResources().getDisplayMetrics().density;
            double d = (double) (i * 52);
            Double.isNaN(d);
            if (((double) e) < d + 274.5d) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
