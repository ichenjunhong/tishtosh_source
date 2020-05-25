package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.w */
public final class C45460w {
    /* renamed from: a */
    public static boolean m99064a() {
        return m99065b().contains("x86");
    }

    /* renamed from: b */
    private static String m99065b() {
        String str;
        try {
            if (VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0 || TextUtils.isEmpty(Build.SUPPORTED_ABIS[0])) {
                str = Build.CPU_ABI;
            } else {
                str = Build.SUPPORTED_ABIS[0];
            }
            if (TextUtils.isEmpty(str)) {
                return "unknown";
            }
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("x86")) {
                return "x86";
            }
            if (lowerCase.startsWith("arm64")) {
                return "arm64";
            }
            if (lowerCase.startsWith("armeabi")) {
                return "armeabi";
            }
            return "unknown";
        } catch (Exception unused) {
        }
    }
}
