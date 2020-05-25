package com.p683ss.android.ugc.aweme.util.p2386a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.util.a.a */
public final class C47612a {
    /* renamed from: d */
    public static void m103083d() {
        m103080a("is_first_like_success", false);
    }

    /* renamed from: a */
    public static SharedPreferences m103077a() {
        return C35807d.m80935a(C11010c.m22280a(), "apps_flyer_cache", 0);
    }

    /* renamed from: b */
    public static Editor m103081b() {
        return m103077a().edit();
    }

    /* renamed from: c */
    public static boolean m103082c() {
        return m103077a().getBoolean("is_first_like_success", true);
    }

    /* renamed from: e */
    public static int m103084e() {
        return m103077a().getInt("like_success_count", 0);
    }

    /* renamed from: f */
    public static long m103085f() {
        return m103077a().getLong("active_time", 0);
    }

    /* renamed from: a */
    public static void m103078a(int i) {
        m103079a("like_success_count", i);
    }

    /* renamed from: a */
    private static void m103079a(String str, int i) {
        m103081b().putInt(str, i).apply();
    }

    /* renamed from: a */
    public static void m103080a(String str, boolean z) {
        m103081b().putBoolean(str, z).apply();
    }
}
