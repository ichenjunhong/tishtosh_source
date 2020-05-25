package com.p683ss.android.ugc.trill.p2518c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.trill.c.a */
public class C50312a {

    /* renamed from: a */
    public static final String f126198a = "a";

    /* renamed from: b */
    public static String f126199b;

    /* renamed from: c */
    public static SharedPreferences f126200c = C35807d.m80935a(C11010c.m22280a(), "gaid_sp_name", 0);

    /* renamed from: d */
    private static String f126201d;

    /* renamed from: e */
    private static boolean f126202e;

    /* renamed from: a */
    public static void m108584a() {
        if (!m108588e()) {
            m108589f();
        }
    }

    /* renamed from: e */
    public static boolean m108588e() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m108585b() {
        if (f126201d == null) {
            if (m108588e()) {
                return f126200c.getString("key_android_id", "");
            }
            m108589f();
        }
        return f126201d;
    }

    /* renamed from: c */
    public static String m108586c() {
        if (f126199b != null) {
            return f126199b;
        }
        C0013i.m16a(C50313b.f126203a);
        return f126200c.getString("key_gaid", "");
    }

    /* renamed from: d */
    public static String m108587d() {
        if (f126201d != null) {
            return f126201d;
        }
        C0013i.m16a(C50314c.f126204a);
        return f126200c.getString("key_android_id", "");
    }

    /* renamed from: f */
    public static void m108589f() {
        if (!f126202e) {
            try {
                m108592i();
                AppLog.setGoogleAId(f126199b);
                f126202e = true;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    private static void m108592i() {
        Editor edit = f126200c.edit();
        try {
            C14903a a = C14902a.m30575a(C11010c.m22280a());
            if (a != null && !TextUtils.isEmpty(a.f38442a)) {
                edit.putString("key_gaid", a.f38442a);
                f126199b = a.f38442a;
            }
        } catch (Exception unused) {
        }
        String a2 = C50315d.m108593a(C11010c.m22280a().getContentResolver(), "android_id");
        if (!TextUtils.isEmpty(a2)) {
            edit.putString("key_android_id", a2);
            f126201d = a2;
        }
        edit.commit();
    }
}
