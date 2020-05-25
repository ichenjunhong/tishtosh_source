package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.i */
public final class C47927i {
    /* renamed from: a */
    public static boolean m103699a(Context context, String str) {
        if (C18920g.m46052b(context, str) || m103701c(context, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m103700b(Context context, String str) {
        String str2 = "";
        int i = -1;
        if (context == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                if (packageInfo != null) {
                    i = packageInfo.versionCode;
                }
            } catch (Exception e) {
                str2 = e.getMessage();
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            C23131p.m56692a("get_app_info", "", C23088c.m56631a().mo47824a("errorMsg", str2).mo47825b());
        }
        return i;
    }

    /* renamed from: c */
    private static boolean m103701c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
            if (!C9376b.m18558a((Collection<T>) installedPackages)) {
                for (PackageInfo packageInfo : installedPackages) {
                    if (packageInfo != null && str.equals(packageInfo.packageName)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
