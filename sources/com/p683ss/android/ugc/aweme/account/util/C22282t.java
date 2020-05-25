package com.p683ss.android.ugc.aweme.account.util;

import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.C20842a;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.account.util.t */
public final class C22282t {

    /* renamed from: a */
    private static int f60050a = -1;

    /* renamed from: a */
    public static boolean m55142a() {
        return m55151f().getBoolean("enable_passport_service_switch", true);
    }

    /* renamed from: b */
    public static int m55143b() {
        return m55151f().getInt("ftc_age_gate_response_mode", 0);
    }

    /* renamed from: c */
    public static boolean m55146c() {
        return m55151f().getBoolean("user_has_password", false);
    }

    /* renamed from: e */
    public static String m55149e() {
        return m55151f().getString("after_login_birthday", "");
    }

    /* renamed from: f */
    public static SharedPreferences m55151f() {
        return C35807d.m80935a(C20842a.f56783a, "aweme-app", 0);
    }

    /* renamed from: g */
    public static SharedPreferences m55153g() {
        return C35807d.m80935a(C20842a.f56783a, "aweme_account_terminal_relative_sp", 0);
    }

    /* renamed from: d */
    public static int m55147d() {
        if (f60050a == -1) {
            f60050a = m55151f().getInt("ftc_age_enable", 0);
        }
        return f60050a;
    }

    /* renamed from: a */
    public static void m55139a(int i) {
        m55151f().edit().putInt("sync_to_toutiao", i).apply();
    }

    /* renamed from: b */
    public static void m55144b(boolean z) {
        m55151f().edit().putBoolean("is_accept_term_privacy_new", true).apply();
    }

    /* renamed from: c */
    public static void m55145c(boolean z) {
        m55151f().edit().putBoolean("ftc_delete_video_alert_showing", z).apply();
    }

    /* renamed from: e */
    public static void m55150e(boolean z) {
        m55151f().edit().putBoolean("ftc_create_password_showing", z).apply();
    }

    /* renamed from: f */
    public static void m55152f(boolean z) {
        m55153g().edit().putBoolean("account_terminal_app_has_logged_out", z).apply();
    }

    /* renamed from: a */
    public static void m55140a(String str) {
        m55151f().edit().putString("after_login_birthday", str).apply();
    }

    /* renamed from: d */
    public static void m55148d(boolean z) {
        m55151f().edit().putBoolean("ftc_create_account_showing", z).apply();
    }

    /* renamed from: a */
    public static void m55141a(boolean z) {
        m55151f().edit().putBoolean("is_sync_to_huoshan", z).apply();
    }
}
