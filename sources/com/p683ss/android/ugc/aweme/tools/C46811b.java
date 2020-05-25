package com.p683ss.android.ugc.aweme.tools;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.ugc.aweme.tools.b */
public final class C46811b {
    /* renamed from: a */
    public static boolean m101654a(Context context) {
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
