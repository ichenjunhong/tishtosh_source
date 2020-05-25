package com.bytedance.p126ad.symphony.p136f;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import java.util.Locale;

/* renamed from: com.bytedance.ad.symphony.f.d */
public final class C2735d {
    /* renamed from: a */
    public static String m7797a() {
        if (VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            if (localeList != null && !localeList.isEmpty()) {
                return localeList.get(0).getCountry();
            }
        }
        return Locale.getDefault().getCountry();
    }

    /* renamed from: a */
    public static String m7798a(Context context) {
        String str = "";
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso();
        }
        if (str != null) {
            return str;
        }
        return "";
    }
}
