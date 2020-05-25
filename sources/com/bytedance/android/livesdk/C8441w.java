package com.bytedance.android.livesdk;

import android.os.Build.VERSION;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.bytedance.android.livesdk.w */
final class C8441w {
    /* renamed from: a */
    static void m16641a(PopupWindow popupWindow) {
        popupWindow.dismiss();
    }

    /* renamed from: a */
    static void m16642a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }
}
