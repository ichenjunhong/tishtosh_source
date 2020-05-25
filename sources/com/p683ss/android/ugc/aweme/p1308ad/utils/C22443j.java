package com.p683ss.android.ugc.aweme.p1308ad.utils;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.j */
public final class C22443j {
    /* renamed from: a */
    public static boolean m55473a(Context context) {
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
