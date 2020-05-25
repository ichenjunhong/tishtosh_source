package com.p2620vk.sdk.p2621a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.vk.sdk.a.c */
public class C52325c {

    /* renamed from: a */
    public static final /* synthetic */ boolean f130306a = (!C52325c.class.desiredAssertionStatus());

    /* renamed from: a */
    public static Map<String, String> m111793a(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("&");
        HashMap hashMap = new HashMap(split.length);
        for (String split2 : split) {
            String[] split3 = split2.split("=");
            hashMap.put(split3[0], split3[1]);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m111792a(Context context) {
        Object obj;
        try {
            Context applicationContext = context.getApplicationContext();
            if (!f130306a) {
                if (applicationContext == null) {
                    throw new AssertionError();
                }
            }
            PackageManager packageManager = applicationContext.getPackageManager();
            if (!f130306a) {
                if (packageManager == null) {
                    throw new AssertionError();
                }
            }
            String packageName = context.getPackageName();
            TextUtils.equals(packageName, C11010c.m22280a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            if (applicationInfo != null) {
                obj = packageManager.getApplicationLabel(applicationInfo);
            } else {
                obj = "(unknown)";
            }
            return (String) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m111796b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    StringBuilder sb2 = new StringBuilder("0");
                    sb2.append(hexString);
                    hexString = sb2.toString();
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static Map<String, Object> m111794a(Object... objArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(objArr.length / 2);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= objArr.length) {
                return linkedHashMap;
            }
            if (!(objArr[i] == null || objArr[i2] == null || !(objArr[i] instanceof String))) {
                linkedHashMap.put(objArr[i], objArr[i2]);
            }
            i += 2;
        }
    }

    /* renamed from: b */
    public static boolean m111797b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (!f130306a) {
                if (packageManager == null) {
                    throw new AssertionError();
                }
            }
            packageManager.getPackageInfo(str, 1);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String[] m111795a(Context context, String str) {
        if (context != null) {
            try {
                if (context.getPackageManager() != null) {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                    if (!f130306a) {
                        if (packageInfo.signatures == null) {
                            throw new AssertionError();
                        }
                    }
                    String[] strArr = new String[packageInfo.signatures.length];
                    Signature[] signatureArr = packageInfo.signatures;
                    int length = signatureArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        Signature signature = signatureArr[i];
                        MessageDigest instance = MessageDigest.getInstance("SHA");
                        instance.update(signature.toByteArray());
                        int i3 = i2 + 1;
                        byte[] digest = instance.digest();
                        BigInteger bigInteger = new BigInteger(1, digest);
                        StringBuilder sb = new StringBuilder("%0");
                        sb.append(digest.length << 1);
                        sb.append("X");
                        strArr[i2] = C2240a.m6772a(sb.toString(), new Object[]{bigInteger});
                        i++;
                        i2 = i3;
                    }
                    return strArr;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
