package com.p683ss.android.agilelogger.p1136f;

import android.content.Context;

/* renamed from: com.ss.android.agilelogger.f.l */
public final class C18831l {
    /* renamed from: a */
    public static int m45924a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }
}
