package com.p683ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.utils.s */
public final class C23734s {

    /* renamed from: a */
    public static final C23734s f63266a = new C23734s();

    private C23734s() {
    }

    /* renamed from: a */
    public static float m58272a(Activity activity) {
        int i;
        Object systemService = C11010c.m22280a().getSystemService("window");
        if (systemService != null) {
            WindowManager windowManager = (WindowManager) systemService;
            if (windowManager == null) {
                return 0.0f;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            int i2 = 0;
            try {
                Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
                int i3 = displayMetrics.heightPixels;
                if (activity == null || !TextUtils.equals("OnePlus", Build.BRAND)) {
                    C52711k.m112236a((Object) defaultDisplay, "display");
                    i = defaultDisplay.getHeight();
                } else {
                    Window window = activity.getWindow();
                    C52711k.m112236a((Object) window, "activity.window");
                    View decorView = window.getDecorView();
                    Rect rect = new Rect();
                    decorView.getWindowVisibleDisplayFrame(rect);
                    i = rect.bottom;
                }
                i2 = i3 - i;
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
            return (float) i2;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.WindowManager");
    }
}
