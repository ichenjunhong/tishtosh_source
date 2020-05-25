package com.p683ss.android.ugc.aweme.p1807im.sdk.debug;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.debug.a */
final class C34053a {
    /* renamed from: a */
    static void m77825a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }
}
