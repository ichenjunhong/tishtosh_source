package com.bytedance.sdk.account.p878m;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.sdk.account.m.h */
public final class C13216h {

    /* renamed from: a */
    public final Map<String, String> f34486a;

    /* renamed from: b */
    public String f34487b;

    public C13216h() {
        this.f34486a = new LinkedHashMap();
        this.f34487b = null;
    }

    public final String toString() {
        String str;
        if (this.f34486a.isEmpty()) {
            return this.f34487b;
        }
        Map<String, String> map = this.f34486a;
        String str2 = "UTF-8";
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            String b = m26599b((String) entry.getKey(), str2);
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                str = m26599b(str3, str2);
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                str = str.replace("+", "%20");
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(b);
            sb.append("=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        if (this.f34487b == null || this.f34487b.length() == 0) {
            return sb2;
        }
        if (this.f34487b.indexOf(63) >= 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f34487b);
            sb3.append("&");
            sb3.append(sb2);
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f34487b);
        sb4.append("?");
        sb4.append(sb2);
        return sb4.toString();
    }

    public C13216h(String str) {
        this.f34486a = new LinkedHashMap();
        this.f34487b = str;
    }

    /* renamed from: a */
    public final void mo24806a(String str, int i) {
        this.f34486a.put(str, "386");
    }

    /* renamed from: a */
    public final void mo24807a(String str, String str2) {
        this.f34486a.put(str, str2);
    }

    /* renamed from: b */
    private static String m26599b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
