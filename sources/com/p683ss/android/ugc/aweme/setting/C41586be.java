package com.p683ss.android.ugc.aweme.setting;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.be */
public final class C41586be {

    /* renamed from: a */
    public static final C41586be f105314a = new C41586be();

    /* renamed from: b */
    private static final byte[] f105315b = {-24, -86, 5, -47, 66, 42, 104, -3, 68, 77, 113, -28, -46, 78, -77, 52, 103, -118, 101, 64};

    private C41586be() {
    }

    /* renamed from: a */
    public static final boolean m91422a(Activity activity) {
        int i;
        Signature[] signatureArr;
        if (activity == null) {
            return false;
        }
        try {
            PackageManager packageManager = activity.getPackageManager();
            String str = "com.ss.android.ugc.aweme.av.test";
            if (VERSION.SDK_INT >= 28) {
                i = 134217728;
            } else {
                i = 64;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, i);
            C52711k.m112236a((Object) packageInfo, "settingActivity.packageM…geManager.GET_SIGNATURES)");
            if (VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = packageInfo.signingInfo;
                C52711k.m112236a((Object) signingInfo, "info.signingInfo");
                signatureArr = signingInfo.getApkContentsSigners();
            } else {
                signatureArr = packageInfo.signatures;
            }
            int length = signatureArr.length;
            int i2 = 0;
            while (i2 < length) {
                try {
                    byte[] digest = MessageDigest.getInstance("SHA1").digest(signatureArr[i2].toByteArray());
                    C52711k.m112236a((Object) digest, "sha1");
                    if (Arrays.equals(digest, f105315b)) {
                        return true;
                    }
                    i2++;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
        } catch (NameNotFoundException unused2) {
        }
        return false;
    }
}
