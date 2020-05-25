package com.p683ss.android.ugc.tools.view.widget;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.ss.android.ugc.tools.view.widget.f */
final class C50282f {
    /* renamed from: a */
    static void m108552a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }
}
