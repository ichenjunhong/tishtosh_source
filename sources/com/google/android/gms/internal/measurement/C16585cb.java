package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15520k;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.cb */
public final class C16585cb {

    /* renamed from: a */
    private static final char[] f46604a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static long m39586a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static C16840kr m39587a(C16568bl blVar, String str) {
        C15464q.m32123a(blVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String str2 = "?";
            String valueOf = String.valueOf(str);
            Map a = C15520k.m32288a(new URI(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)), "UTF-8");
            C16840kr krVar = new C16840kr();
            krVar.f47279e = (String) a.get("utm_content");
            krVar.f47277c = (String) a.get("utm_medium");
            krVar.f47275a = (String) a.get("utm_campaign");
            krVar.f47276b = (String) a.get("utm_source");
            krVar.f47278d = (String) a.get("utm_term");
            krVar.f47280f = (String) a.get("utm_id");
            krVar.f47281g = (String) a.get("anid");
            krVar.f47282h = (String) a.get("gclid");
            krVar.f47283i = (String) a.get("dclid");
            krVar.f47284j = (String) a.get("aclid");
            return krVar;
        } catch (URISyntaxException e) {
            blVar.mo32498c("No valid campaign data found", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m39588a(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m39589a(Map<String, String> map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    /* renamed from: b */
    public static MessageDigest m39592b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m39591a(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo != null && receiverInfo.enabled && (!z || receiverInfo.exported)) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m39590a(Context context, String str) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}
