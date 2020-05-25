package com.rocket.android.opensdk.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;

public class OpenSDKUtils {

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m44433x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C11010c.m22280a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C18970b.f52271a == null) {
                C18970b.f52271a = packageManager.getApplicationInfo(str, i);
            }
            return C18970b.f52271a;
        }
    }

    private static Signature[] getRawSignature(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.signatures;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static int getSDKVersionFromMetaData(Context context, int i) {
        try {
            ApplicationInfo com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo = _lancet.m44433x89c42dc8(context.getPackageManager(), "com.feiliao.flipchat.android", 128);
            if (com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData != null) {
                return com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData.getInt("ROCKET_OPEN_SDK_SUPPORT_VERSION");
            }
            return i;
        } catch (NameNotFoundException unused) {
            return i;
        }
    }

    public static String getMD5Signature(Context context, String str) {
        Signature[] rawSignature = getRawSignature(context, str);
        if (rawSignature == null || rawSignature.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Signature byteArray : rawSignature) {
            sb.append(MD5.getMessageDigest(byteArray.toByteArray()));
        }
        return sb.toString();
    }
}
