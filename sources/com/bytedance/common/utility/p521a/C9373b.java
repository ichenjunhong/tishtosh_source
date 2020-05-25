package com.bytedance.common.utility.p521a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;

/* renamed from: com.bytedance.common.utility.a.b */
public final class C9373b {
    /* renamed from: a */
    public static String m18553a(Context context, String str) {
        return (String) m18555c(context, str);
    }

    /* renamed from: b */
    public static int m18554b(Context context, String str) {
        return ((Integer) m18555c(context, str)).intValue();
    }

    /* renamed from: c */
    private static Object m18555c(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (TextUtils.equals(packageName, C11010c.m22280a().getPackageName())) {
                if (C18970b.f52271a == null) {
                    C18970b.f52271a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = C18970b.f52271a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
            return applicationInfo.metaData.get(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
