package com.bytedance.ies.dmt.p664ui.p669e;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: com.bytedance.ies.dmt.ui.e.b */
public final class C10704b {

    /* renamed from: a */
    private static int f28503a;

    /* renamed from: b */
    private static int f28504b;

    /* renamed from: a */
    public static int m21577a(Context context) {
        if (f28503a != 0) {
            return f28503a;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            f28503a = point.x;
            f28504b = point.y;
        }
        if (f28503a == 0 || f28504b == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f28503a = displayMetrics.widthPixels;
            f28504b = displayMetrics.heightPixels;
        }
        return f28503a;
    }

    /* renamed from: b */
    public static int m21578b(Context context) {
        if (f28504b != 0) {
            return f28504b;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            f28503a = point.x;
            f28504b = point.y;
        }
        if (f28503a == 0 || f28504b == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f28503a = displayMetrics.widthPixels;
            f28504b = displayMetrics.heightPixels;
        }
        return f28504b;
    }
}
