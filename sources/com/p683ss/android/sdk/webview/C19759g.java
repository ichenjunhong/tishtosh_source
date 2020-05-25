package com.p683ss.android.sdk.webview;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.ss.android.sdk.webview.g */
final class C19759g {
    /* renamed from: a */
    static void m48274a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }
}
