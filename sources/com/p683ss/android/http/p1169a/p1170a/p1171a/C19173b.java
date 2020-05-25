package com.p683ss.android.http.p1169a.p1170a.p1171a;

import com.p683ss.android.http.p1169a.C19186d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.ss.android.http.a.a.a.b */
public final class C19173b {
    /* renamed from: a */
    private static String m46743a(String str, String str2) {
        if (str2 == null) {
            try {
                return URLEncoder.encode(str, "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (str2.equals("null_encoding")) {
            return str;
        } else {
            return URLEncoder.encode(str, str2);
        }
    }

    /* renamed from: a */
    public static String m46744a(List<? extends C19186d> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (C19186d dVar : list) {
            String a = m46743a(dVar.mo39131a(), str);
            String b = dVar.mo39132b();
            if (b != null) {
                str2 = m46743a(b, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
