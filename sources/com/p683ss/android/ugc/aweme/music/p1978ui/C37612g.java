package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.g */
public final class C37612g {

    /* renamed from: a */
    public static final C37612g f95919a = new C37612g();

    private C37612g() {
    }

    /* renamed from: a */
    public static final Dialog m84061a(Activity activity, View view, int i, int i2) {
        Display display;
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(view, "view");
        Dialog dialog = new Dialog(activity, R.style.a5h);
        dialog.setCancelable(true);
        dialog.setContentView(view);
        WindowManager windowManager = activity.getWindowManager();
        LayoutParams layoutParams = null;
        if (windowManager != null) {
            display = windowManager.getDefaultDisplay();
        } else {
            display = null;
        }
        Window window = dialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.x = 0;
        }
        if (layoutParams != null) {
            layoutParams.gravity = 80;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.a4n;
        }
        Point point = new Point();
        if (display != null) {
            display.getSize(point);
        }
        if (layoutParams != null) {
            layoutParams.width = point.x;
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }
}
