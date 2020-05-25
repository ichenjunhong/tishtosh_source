package com.p683ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.base.utils.m */
public class C23726m {

    /* renamed from: a */
    private static final String f63258a = "m";

    /* renamed from: a */
    public static String m58235a() {
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C11010c.m22280a().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getNetworkOperator();
            return str;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static int m58234a(Context context) {
        String a = m58236a(context, "-1");
        if ("46000".equals(a) || "46002".equals(a) || "46007".equals(a)) {
            return 3;
        }
        if ("46001".equals(a) || "46006".equals(a) || "46009".equals(a)) {
            return 2;
        }
        if ("46003".equals(a) || "46005".equals(a) || "46011".equals(a)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static String m58236a(Context context, String str) {
        String str2;
        if (context == null) {
            return str;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str2 = telephonyManager.getSimOperator();
            return str2;
        } catch (Exception unused) {
            str2 = str;
        }
    }
}
