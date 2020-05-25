package com.p683ss.android.ugc.aweme.property;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.ss.android.ugc.aweme.property.z */
final class C40835z {
    /* renamed from: a */
    static void m90307a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }
}
