package com.snapchat.kit.sdk.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.support.p030v4.content.FileProvider;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.io.File;

public class SnapUtils {

    class _lancet {
        private _lancet() {
        }
    }

    public static String getFileProviderAuthority(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".fileprovider");
        return sb.toString();
    }

    public static Uri getFileProviderUri(Context context, File file) {
        if (file == null) {
            return null;
        }
        return FileProvider.getUriForFile(context, getFileProviderAuthority(context), file);
    }

    public static boolean isSnapchatInstalled(PackageManager packageManager, String str) {
        boolean z;
        try {
            TextUtils.equals(str, C11010c.m22280a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (applicationInfo.enabled) {
                if (packageInfo.versionCode >= 1729) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
