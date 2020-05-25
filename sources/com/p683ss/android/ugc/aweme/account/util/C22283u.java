package com.p683ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.ss.android.ugc.aweme.account.util.u */
public final class C22283u {
    /* renamed from: a */
    public static synchronized PackageInfo m55154a(Context context, String str) {
        PackageInfo packageInfo;
        synchronized (C22283u.class) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 1);
            } catch (Exception unused) {
                packageInfo = null;
            }
        }
        return packageInfo;
    }
}
