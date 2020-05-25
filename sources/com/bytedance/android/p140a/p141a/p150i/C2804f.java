package com.bytedance.android.p140a.p141a.p150i;

import android.text.TextUtils;
import com.C2240a;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bytedance.android.a.a.i.f */
public final class C2804f {
    /* renamed from: b */
    public static String m7972b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static String m7971a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                byte b2 = b & 255;
                if (b2 < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toString(b2, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m7973c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt > 31) {
                    if (charAt < 127) {
                        sb.append(charAt);
                    }
                }
                sb.append(C2240a.m6772a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m7974d(String str) {
        char[] charArray;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= ' ' && c != 127) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
