package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.C15386i;
import com.google.android.gms.common.p1037d.C15377d;

/* renamed from: com.google.android.gms.common.util.t */
public final class C15529t {
    /* renamed from: a */
    public static boolean m32309a(Context context, int i) {
        if (!m32310a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C15386i a = C15386i.m31967a(context);
            if (packageInfo != null) {
                if (C15386i.m31970a(packageInfo, false)) {
                    return true;
                }
                if (!C15386i.m31970a(packageInfo, true) || !C15384g.m31958a(a.f39690a)) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m32310a(Context context, int i, String str) {
        return C15377d.m31951a(context).mo28320a(i, str);
    }
}
