package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.d */
public final class C35264d {
    /* renamed from: a */
    public static String m79723a(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }
}
