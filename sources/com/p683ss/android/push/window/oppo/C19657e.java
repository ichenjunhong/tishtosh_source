package com.p683ss.android.push.window.oppo;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.common.utility.p526f.C9409b;

/* renamed from: com.ss.android.push.window.oppo.e */
public final class C19657e {
    /* renamed from: a */
    public static int m48025a(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            C9409b a = C9409b.m18609a((Object) appOpsManager);
            if (((Integer) a.mo17052a("checkOpNoThrow", (Class<?>[]) new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(((Integer) a.mo17051a("OP_POST_NOTIFICATION", (Class<?>[]) new Class[]{Integer.TYPE}).f25654a).intValue()), Integer.valueOf(i), packageName).f25654a).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
