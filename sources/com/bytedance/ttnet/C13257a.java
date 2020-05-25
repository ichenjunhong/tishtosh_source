package com.bytedance.ttnet;

import android.text.TextUtils;

/* renamed from: com.bytedance.ttnet.a */
public final class C13257a {
    /* renamed from: a */
    public static String m26657a() {
        String d = C13303d.m26799b().mo24906d();
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        throw new IllegalArgumentException("apiIHostPrefix is not init !!!");
    }

    /* renamed from: b */
    public static String m26659b() {
        String c = C13303d.m26799b().mo24905c();
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        throw new IllegalArgumentException("hostSuffix is not init !!!");
    }

    /* renamed from: a */
    public static String m26658a(String str) {
        String c = C13303d.m26799b().mo24905c();
        if (str == null || TextUtils.isEmpty(c)) {
            throw new IllegalArgumentException("hostSuffix is not init !!!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }
}
