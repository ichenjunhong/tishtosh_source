package com.p683ss.android.p1167g;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

/* renamed from: com.ss.android.g.d */
public final class C19165d {

    /* renamed from: a */
    public static volatile String f52817a = "snssdk143";

    /* renamed from: b */
    private static String f52818b;

    /* renamed from: a */
    private static String m46727a(Context context) {
        if (f52818b != null) {
            return f52818b;
        }
        return m46729a(context.getPackageCodePath());
    }

    /* renamed from: a */
    private static synchronized String m46729a(String str) {
        String str2;
        synchronized (C19165d.class) {
            if (f52818b != null) {
                String str3 = f52818b;
                return str3;
            }
            try {
                str2 = C19161a.m46711a(str);
            } catch (IOException unused) {
                str2 = null;
            }
            if (str2 != null) {
                if (str2.startsWith("growth") || str2.startsWith(f52817a)) {
                    Uri parse = Uri.parse(str2);
                    if ("growth".equals(parse.getScheme())) {
                        f52818b = parse.getQuery();
                    } else if (f52817a.equals(parse.getScheme())) {
                        f52818b = parse.getQuery();
                    }
                }
            }
            if (f52818b == null) {
                f52818b = "";
            }
            String str4 = f52818b;
            return str4;
        }
    }

    /* renamed from: a */
    public static String m46728a(Context context, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (m46730a(context, sb)) {
            return sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m46730a(Context context, StringBuilder sb) {
        String str;
        if (sb.indexOf("#") > 0) {
            return false;
        }
        String a = m46727a(context);
        if (a.length() == 0) {
            return false;
        }
        if (sb.indexOf("?") > 0) {
            str = "&";
        } else {
            str = "?";
        }
        sb.append(str);
        sb.append(a);
        return true;
    }
}
