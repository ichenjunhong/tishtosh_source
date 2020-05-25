package com.bytedance.jirafast.p752ui;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.bytedance.jirafast.ui.b */
final class C12092b {
    /* renamed from: a */
    static void m24525a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }
}
