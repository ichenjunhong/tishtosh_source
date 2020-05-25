package com.p683ss.android.ugc.aweme.account.login;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.util.C22283u;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.main.service.C36694o;

/* renamed from: com.ss.android.ugc.aweme.account.login.h */
public final class C21355h {
    /* renamed from: a */
    public static C23088c m53973a(String str) {
        return m53974a(str, (C23088c) null);
    }

    /* renamed from: a */
    public static void m53978a(String str, String str2) {
        m53979a("", str, str2);
    }

    /* renamed from: a */
    private static C23088c m53974a(String str, C23088c cVar) {
        boolean z;
        C23088c a = C23088c.m56631a();
        if (TextUtils.equals(str, "google")) {
            PackageInfo a2 = C22283u.m55154a(C23826bi.m58460b(), "com.google.android.gms");
            String str2 = "google_isInstalled";
            if (a2 != null) {
                z = true;
            } else {
                z = false;
            }
            a.mo47824a(str2, String.valueOf(z));
            if (a2 != null) {
                a.mo47824a("google_versionName", a2.versionName);
                a.mo47824a("google_versionCode", String.valueOf(a2.versionCode));
            }
            a.mo47824a("eligible", String.valueOf(C22299f.m55185a(C23826bi.m58460b())));
        }
        return a;
    }

    /* renamed from: a */
    public static void m53975a(int i, int i2, String str) {
        C22089b.m54868a("aweme_email_register_rate", i, C23088c.m56631a().mo47824a("errorCode", String.valueOf(i2)).mo47824a("errorDesc", str).mo47825b());
    }

    /* renamed from: b */
    public static void m53980b(int i, int i2, String str) {
        C22089b.m54868a("aweme_agegate_rate", i, C23088c.m56631a().mo47824a("eligible", String.valueOf(i2)).mo47824a("errorDesc", str).mo47825b());
    }

    /* renamed from: c */
    public static void m53981c(int i, int i2, String str) {
        C22089b.m54868a("aweme_phone_login_rate", i, C23088c.m56631a().mo47824a("errorCode", String.valueOf(i2)).mo47824a("errorDesc", str).mo47825b());
    }

    /* renamed from: d */
    public static void m53982d(int i, int i2, String str) {
        C22089b.m54868a("aweme_phone_register_rate", i, C23088c.m56631a().mo47824a("errorCode", String.valueOf(i2)).mo47824a("errorDesc", str).mo47825b());
    }

    /* renamed from: a */
    public static void m53977a(int i, String str, String str2) {
        if (C21356i.m53983a(C23826bi.m58460b())) {
            C22089b.m54868a("aweme_thirdparty_login_error_rate", 0, m53973a(str2).mo47824a("app_language", ((C36694o) C23826bi.m58450a(C36694o.class)).mo47888a()).mo47824a("platform", str2).mo47824a("errorCode", String.valueOf(i)).mo47824a("errorDesc", String.valueOf(str)).mo47825b());
        }
    }

    /* renamed from: a */
    private static void m53979a(String str, String str2, String str3) {
        if (C21356i.m53983a(C23826bi.m58460b())) {
            C22089b.m54868a("aweme_thirdparty_login_error_rate", 0, m53973a(str3).mo47824a("app_language", ((C36694o) C23826bi.m58450a(C36694o.class)).mo47888a()).mo47824a("platform", str3).mo47824a("errorDesc", String.valueOf(str2)).mo47824a("errorUrl", str).mo47825b());
        }
    }

    /* renamed from: a */
    public static void m53976a(int i, String str, int i2, String str2) {
        C22089b.m54868a("aweme_user_email_login_rate", i, C23088c.m56631a().mo47824a("type", String.valueOf(str)).mo47824a("errorCode", String.valueOf(i2)).mo47824a("errorDesc", str2).mo47825b());
    }
}
