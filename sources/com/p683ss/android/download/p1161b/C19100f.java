package com.p683ss.android.download.p1161b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.bytedance.common.utility.C9431p;
import java.io.File;

/* renamed from: com.ss.android.download.b.f */
public final class C19100f {
    /* renamed from: a */
    public static boolean m46523a(Context context, String str) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null || str == null || C9431p.m18664a(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1);
                if (packageArchiveInfo == null) {
                    return false;
                }
                String str2 = packageArchiveInfo.packageName;
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str2, 1);
                } catch (NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if (i <= packageInfo.versionCode) {
                        z = true;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return z;
    }
}
