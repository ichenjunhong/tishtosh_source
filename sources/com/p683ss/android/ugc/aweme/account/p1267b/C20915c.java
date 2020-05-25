package com.p683ss.android.ugc.aweme.account.p1267b;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.account.b.c */
public final class C20915c {
    /* renamed from: a */
    public static void m53258a(String str) {
        C26890h.m65011a("uc_bind_click_exit", C20856a.m53173a().mo44776a("enter_from", str).mo44776a("params_for_special", "uc_login").f56798a);
    }

    /* renamed from: b */
    public static void m53261b(String str, String str2) {
        C26890h.m65011a("uc_bind_submit", C20856a.m53173a().mo44776a("enter_from", str).mo44776a("bind_type", str2).mo44776a("params_for_special", "uc_login").f56798a);
    }

    /* renamed from: a */
    public static void m53259a(String str, String str2) {
        C26890h.m65011a("uc_bind_notify", C20856a.m53173a().mo44776a("enter_from", str).mo44776a("bind_type", str2).mo44776a("params_for_special", "uc_login").f56798a);
    }

    /* renamed from: a */
    public static void m53260a(String str, String str2, int i, String str3, String str4) {
        String str5;
        C20856a a = C20856a.m53173a().mo44776a("enter_from", str).mo44776a("bind_type", str2);
        String str6 = "status";
        if (i == 0) {
            str5 = "success";
        } else {
            str5 = "fail";
        }
        C20856a a2 = a.mo44776a(str6, str5).mo44774a("error_code", i).mo44776a("fail_info", str3).mo44776a("params_for_special", "uc_login");
        if (str4 != null) {
            try {
                a2.mo44774a("phone_country", PhoneNumberUtil.getInstance().parse(str4, null).getCountryCode());
            } catch (NumberParseException unused) {
            }
        }
        C26890h.m65011a("uc_bind_result", a2.f56798a);
    }
}
