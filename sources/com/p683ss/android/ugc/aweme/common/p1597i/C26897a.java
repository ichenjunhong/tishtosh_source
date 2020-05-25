package com.p683ss.android.ugc.aweme.common.p1597i;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.common.i.a */
public final class C26897a {
    /* renamed from: a */
    public static boolean m65024a() {
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "genymotion") || TextUtils.equals(Build.MODEL.toLowerCase(), "virtual machine") || Build.DEVICE.contains("generic_")) {
            return false;
        }
        return true;
    }
}
