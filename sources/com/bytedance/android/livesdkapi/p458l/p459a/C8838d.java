package com.bytedance.android.livesdkapi.p458l.p459a;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.l.a.d */
public final class C8838d {
    /* renamed from: a */
    private static String m17351a(String str, String str2) {
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
    public static String m17352a(List<? extends C8837c> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (C8837c cVar : list) {
            String a = m17351a(cVar.mo15816a(), str);
            String b = cVar.mo15817b();
            if (b != null) {
                str2 = m17351a(b, str);
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
