package com.p683ss.android.ugc.aweme.account.login.authorize.platforms;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.platforms.a */
public final class C21087a {

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.platforms.a$a */
    public enum C21089a {
        SUCCESS,
        FAILURE,
        CANCEL
    }

    /* renamed from: a */
    public static void m53561a(C21089a aVar, String str, String str2) {
        int i;
        switch (aVar) {
            case FAILURE:
                i = 0;
                break;
            case CANCEL:
                i = 2;
                break;
            default:
                i = 1;
                break;
        }
        C20856a a = new C20856a().mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).mo44776a("platform", str2).mo44774a("status", i).mo44776a("fail_info", str).mo44774a("_perf_monitor", 1);
        if (i == 2) {
            try {
                if (TextUtils.equals(str2, "facebook")) {
                    Keva repo = Keva.getRepo("fb_login_failure");
                    String string = repo.getString("fb_login_failure", "");
                    if (!TextUtils.isEmpty(string)) {
                        a.mo44776a("info", string);
                        repo.clear();
                    }
                }
            } catch (Exception unused) {
            }
        }
        C26890h.m65011a("token_response", a.f56798a);
    }
}
