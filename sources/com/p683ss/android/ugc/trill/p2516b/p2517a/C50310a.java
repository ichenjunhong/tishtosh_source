package com.p683ss.android.ugc.trill.p2516b.p2517a;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.trill.b.a.a */
public final class C50310a {

    /* renamed from: a */
    private static final boolean f126196a = false;

    /* renamed from: d */
    public static void m108583d() {
        C0013i.m16a(C50311b.f126197a);
    }

    /* renamed from: a */
    static SharedPreferences m108574a() {
        return C35807d.m80935a(C11010c.m22280a(), "aweme_friends", 0);
    }

    /* renamed from: b */
    public static String m108577b() {
        String a = m108575a("fb_access_token", "");
        long c = m108580c("fb_access_token_exp", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis <= 0 || c <= currentTimeMillis) {
            return "";
        }
        return a;
    }

    /* renamed from: c */
    public static Long m108581c() {
        return Long.valueOf(m108580c("fb_access_token_exp", 0));
    }

    /* renamed from: b */
    private static void m108578b(String str, long j) {
        m108574a().edit().putLong(str, j).apply();
    }

    /* renamed from: c */
    private static long m108580c(String str, long j) {
        return m108574a().getLong(str, 0);
    }

    /* renamed from: a */
    public static String m108575a(String str, String str2) {
        return m108574a().getString(str, str2);
    }

    /* renamed from: a */
    public static void m108576a(String str, long j) {
        m108582c("fb_access_token", str);
        m108578b("fb_access_token_exp", j);
    }

    /* renamed from: b */
    public static void m108579b(String str, String str2) {
        m108582c("twitter_access_token", str);
        m108582c("twitter_access_token_secret", str2);
    }

    /* renamed from: c */
    private static void m108582c(String str, String str2) {
        m108574a().edit().putString(str, str2).apply();
    }
}
