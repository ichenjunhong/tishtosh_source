package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.x */
public class C17228x {

    /* renamed from: a */
    static String f48683a;

    /* renamed from: b */
    static Map<String, String> f48684b = new HashMap();

    /* renamed from: a */
    public static void m42190a(Context context, String str) {
        String a = m42189a(str, "conv");
        if (a != null && a.length() > 0) {
            f48684b.put(a, str);
            C17188az.m42124a(context, "gtm_click_referrers", a, str);
        }
    }

    /* renamed from: a */
    private static String m42189a(String str, String str2) {
        String str3 = "http://hostname/?";
        String valueOf = String.valueOf(str);
        return Uri.parse(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3)).getQueryParameter(str2);
    }
}
