package com.bytedance.android.live.uikit.p257c;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.android.live.uikit.c.c */
public final class C4206c {
    /* renamed from: a */
    public static boolean m10426a(Context context) {
        if (context == null || VERSION.SDK_INT <= 16) {
            return false;
        }
        if (context.getResources().getConfiguration().locale.getLanguage().equals("ar") || context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
