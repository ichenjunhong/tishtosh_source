package com.p683ss.android.ugc.aweme.base.utils;

import android.os.Build;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.base.utils.f */
public final class C23717f {
    /* renamed from: a */
    public static void m58206a(String str) {
        C26890h.m65011a(str, C23089d.m56640a().mo47829a("mobile_model", Build.MODEL).mo47829a("mobile_brand", Build.BRAND).mo47829a("android_version", VERSION.RELEASE).f61491a);
    }
}
