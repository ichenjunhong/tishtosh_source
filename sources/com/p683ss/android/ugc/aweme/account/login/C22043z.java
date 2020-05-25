package com.p683ss.android.ugc.aweme.account.login;

import com.p683ss.android.sdk.p1207a.C19718b;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.account.login.z */
public final class C22043z {
    /* renamed from: b */
    public static void m54778b(boolean z, String str) {
        String str2 = "create_account_next";
        C20856a a = C20856a.m53173a().mo44774a("is_success", z ? 1 : 0);
        String str3 = "enter_method";
        if (C23826bi.m58466g()) {
            str = "pop_up";
        }
        C26890h.m65011a(str2, a.mo44776a(str3, str).f56798a);
    }

    /* renamed from: c */
    public static void m54779c(boolean z, String str) {
        String str2 = "create_password_next";
        C20856a a = C20856a.m53173a().mo44774a("is_success", z ? 1 : 0);
        String str3 = "enter_method";
        if (C23826bi.m58466g()) {
            str = "pop_up";
        }
        C26890h.m65011a(str2, a.mo44776a(str3, str).f56798a);
    }

    /* renamed from: a */
    public static void m54777a(boolean z, String str) {
        String str2;
        boolean z2;
        int i;
        if (z) {
            IAccountUserService a = C23826bi.m58449a();
            if (C23826bi.m58466g()) {
                str2 = "pop_up";
            } else {
                str2 = C21635v.f58646a;
            }
            String str3 = "f_age_gate_show";
            C20856a a2 = C20856a.m53173a().mo44776a("enter_method", str2);
            String str4 = "user_is_login";
            boolean z3 = false;
            if (a == null || !a.isLogin()) {
                z2 = false;
            } else {
                z2 = true;
            }
            C20856a a3 = a2.mo44776a(str4, String.valueOf(z2)).mo44776a("is_bind_fb", String.valueOf(C19718b.m48210a().mo41123a("facebook"))).mo44776a("is_bind_gl", String.valueOf(C19718b.m48210a().mo41123a("google")));
            String str5 = "user_mode";
            if (a == null) {
                i = -1;
            } else {
                i = a.getCurUser().getUserMode();
            }
            C20856a a4 = a3.mo44774a(str5, i);
            String str6 = "is_ftc_enable";
            if (C22282t.m55147d() == 1) {
                z3 = true;
            }
            C26890h.m65011a(str3, a4.mo44776a(str6, String.valueOf(z3)).mo44776a("platform", str).f56798a);
            return;
        }
        C26890h.m65011a("age_gate_show", C20856a.m53173a().mo44776a("platform", str).f56798a);
    }

    /* renamed from: a */
    public static void m54776a(boolean z, AgeGateResponse ageGateResponse, String str) {
        String str2;
        int i;
        int i2 = 1;
        int i3 = -1;
        if (z) {
            String str3 = "f_age_gate_response";
            C20856a a = C20856a.m53173a().mo44776a("platform", str);
            String str4 = "enter_method";
            if (C23826bi.m58466g()) {
                str2 = "pop_up";
            } else {
                str2 = C21635v.f58646a;
            }
            C20856a a2 = a.mo44776a(str4, str2);
            String str5 = "f_mode";
            if (ageGateResponse == null || ageGateResponse.getStatus_code() != 0) {
                i = -1;
            } else if (ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.getRegisterAgeGatePostAction() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            C20856a a3 = a2.mo44774a(str5, i);
            String str6 = "is_success";
            if (!(ageGateResponse != null && ageGateResponse.getStatus_code() == 0 && ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.getRegisterAgeGatePostAction() == 0)) {
                i2 = 0;
            }
            C20856a a4 = a3.mo44774a(str6, i2);
            String str7 = "error_code";
            if (ageGateResponse != null) {
                i3 = ageGateResponse.getStatus_code();
            }
            C26890h.m65011a(str3, a4.mo44774a(str7, i3).f56798a);
            return;
        }
        String str8 = "age_gate_response";
        C20856a a5 = C20856a.m53173a().mo44776a("platform", str);
        String str9 = "is_success";
        if (!(ageGateResponse != null && ageGateResponse.getStatus_code() == 0 && ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.getRegisterAgeGatePostAction() == 0)) {
            i2 = 0;
        }
        C20856a a6 = a5.mo44774a(str9, i2);
        String str10 = "error_code";
        if (ageGateResponse != null) {
            i3 = ageGateResponse.getStatus_code();
        }
        C26890h.m65011a(str8, a6.mo44774a(str10, i3).f56798a);
    }
}
