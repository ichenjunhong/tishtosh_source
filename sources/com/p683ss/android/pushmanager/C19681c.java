package com.p683ss.android.pushmanager;

import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.p683ss.android.message.C19408a;

/* renamed from: com.ss.android.pushmanager.c */
public class C19681c {
    /* renamed from: a */
    public String mo41022a() {
        return "message";
    }

    /* renamed from: b */
    public String mo41023b() {
        return C19658a.f54154a;
    }

    /* renamed from: c */
    public static String m48081c() {
        String str = "";
        try {
            str = ((TelephonyManager) C19408a.m47500a().getSystemService("phone")).getSimCountryIso();
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = Resources.getSystem().getConfiguration().locale.getCountry();
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase();
        }
        return "";
    }
}
