package com.bytedance.android.live.uikit.p257c;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.bytedance.android.live.uikit.c.b */
final class C4205b {
    /* renamed from: a */
    static void m10425a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }
}
