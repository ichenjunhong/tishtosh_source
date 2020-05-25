package com.p683ss.android.ugc.asve.p1241e;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.e.f */
public final class C20395f {

    /* renamed from: a */
    public static final C20395f f55923a = new C20395f();

    private C20395f() {
    }

    /* renamed from: a */
    public static final boolean m50601a(Context context) {
        C52711k.m112240b(context, "context");
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        Resources resources = context.getResources();
        C52711k.m112236a((Object) resources, "resources");
        Configuration configuration = resources.getConfiguration();
        C52711k.m112236a((Object) configuration, "configuration");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final int m50602b(Context context) {
        C52711k.m112240b(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return point.x;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: c */
    public static final int m50603c(Context context) {
        WindowManager windowManager;
        C52711k.m112240b(context, "context");
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
            C52711k.m112236a((Object) windowManager, "context.windowManager");
        } else {
            Object systemService = context.getSystemService("window");
            if (systemService != null) {
                windowManager = (WindowManager) systemService;
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class cls = Class.forName("android.view.Display");
            C52711k.m112236a((Object) cls, "Class.forName(\"android.view.Display\")");
            cls.getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            return displayMetrics.heightPixels;
        } catch (Exception unused) {
            C52711k.m112240b(context, "context");
            Object systemService2 = context.getSystemService("window");
            if (systemService2 != null) {
                Display defaultDisplay2 = ((WindowManager) systemService2).getDefaultDisplay();
                Point point = new Point();
                if (defaultDisplay2 == null) {
                    return 0;
                }
                defaultDisplay2.getSize(point);
                return point.y;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.WindowManager");
        }
    }
}
