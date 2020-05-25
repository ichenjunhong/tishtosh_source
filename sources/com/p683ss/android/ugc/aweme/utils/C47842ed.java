package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.ugc.aweme.utils.ed */
public final class C47842ed {
    /* renamed from: a */
    public static boolean m103485a(Context context) {
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
