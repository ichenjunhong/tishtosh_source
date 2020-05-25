package com.p683ss.p2549c.p2550a.p2551a.p2552a;

import android.text.TextUtils;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.ss.c.a.a.a.a */
public final class C51169a {

    /* renamed from: a */
    public final String f127802a;

    /* renamed from: b */
    public final C51171b f127803b;

    /* renamed from: c */
    public final List<Pair<String, String>> f127804c;

    C51169a(C51172c cVar) {
        this.f127802a = cVar.f127813b;
        this.f127803b = cVar.f127814c;
        this.f127804c = cVar.f127815d;
    }

    /* renamed from: a */
    private static String m110077a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m110078a(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) >= 0) {
            sb.append("&");
        } else if (list.size() > 0) {
            sb.append("?");
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append("&");
            }
            Pair pair = (Pair) list.get(i);
            sb.append((String) pair.first);
            sb.append('=');
            sb.append(m110077a((String) pair.second, "UTF-8"));
        }
        return sb.toString();
    }
}
