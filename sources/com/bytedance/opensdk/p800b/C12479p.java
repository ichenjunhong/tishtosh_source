package com.bytedance.opensdk.p800b;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.b.p */
public final class C12479p {

    /* renamed from: a */
    public static final C12479p f32783a = new C12479p();

    /* renamed from: b */
    private static final String f32784b = f32784b;

    /* renamed from: c */
    private static final String f32785c = f32785c;

    /* renamed from: d */
    private static final String f32786d = f32786d;

    /* renamed from: e */
    private static final String f32787e = f32787e;

    /* renamed from: f */
    private static final String f32788f = f32788f;

    /* renamed from: g */
    private static final String f32789g = f32789g;

    /* renamed from: h */
    private static final int f32790h = 13;

    /* renamed from: i */
    private static final int f32791i = 10;

    /* renamed from: j */
    private static final int f32792j = 32;

    /* renamed from: k */
    private static final int f32793k = 9;

    private C12479p() {
    }

    /* renamed from: a */
    public static String m25081a() {
        return f32784b;
    }

    /* renamed from: a */
    private static String m25082a(String str, String str2) {
        if (str2 == null) {
            try {
                str2 = f32786d;
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        }
        String encode = URLEncoder.encode(str, str2);
        C52711k.m112236a((Object) encode, "URLEncoder.encode(\n     …ENT_CHARSET\n            )");
        return encode;
    }

    /* renamed from: a */
    public final String mo23512a(Map<String, ? extends List<String>> map, String str) {
        boolean z;
        C52711k.m112240b(map, "paramMap");
        C52711k.m112240b(str, "encoding");
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            List<String> list = (List) entry.getValue();
            String a = m25082a(str2, str);
            if (!list.isEmpty()) {
                for (String a2 : list) {
                    String a3 = m25082a(a2, str);
                    if (sb.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        sb.append(f32788f);
                    }
                    sb.append(a);
                    sb.append(f32789g);
                    sb.append(a3);
                }
            }
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "result.toString()");
        return sb2;
    }
}
