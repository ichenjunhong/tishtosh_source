package com.bytedance.ies.ugc.p694a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ies.ugc.a.h */
public final class C11023h {

    /* renamed from: a */
    private static WeakReference<Bundle> f29617a;

    /* renamed from: a */
    public static String m22324a(Context context, String str) {
        return (String) m22326c(context, str);
    }

    /* renamed from: b */
    public static int m22325b(Context context, String str) {
        return ((Integer) m22326c(context, str)).intValue();
    }

    /* renamed from: c */
    private static Object m22326c(Context context, String str) {
        Bundle bundle;
        ApplicationInfo applicationInfo;
        if (context == null) {
            return null;
        }
        try {
            if (f29617a != null) {
                bundle = (Bundle) f29617a.get();
            } else {
                bundle = null;
            }
            if (bundle == null) {
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
                bundle = applicationInfo.metaData;
                f29617a = new WeakReference<>(bundle);
            }
            return bundle.get(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
