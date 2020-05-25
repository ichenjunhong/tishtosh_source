package com.p683ss.android.ugc.aweme.compliance.businesses.vzbv.p1610a;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.ProfileServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.vzbv.a.a */
public final class C27075a {
    /* renamed from: b */
    public static int m65302b() {
        return C23794bh.m58381G().mo47252m();
    }

    /* renamed from: a */
    public static boolean m65301a() {
        if (!C20854a.m53167g().isLogin()) {
            return false;
        }
        if (C23794bh.m58381G().mo47251l() && !C20854a.m53167g().getCurUser().isSecret()) {
            ProfileServiceImpl.createIProfileServicebyMonsterPlugin().newUserPresenter().mo81854a(true);
            SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().mo47776a(Boolean.valueOf(true));
        }
        if (C23794bh.m58381G().mo47252m() <= 0 || C20854a.m53167g().getCurUser().isSecret()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m65300a(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "privacy_account_setting_show")) {
            str2 = "account_privacy_show";
        } else {
            str2 = "account_privacy_confirm";
        }
        C26890h.m65011a(str2, C23089d.m56640a().mo47826a("is_register", z ^ true ? 1 : 0).f61491a);
    }

    /* renamed from: b */
    public static void m65303b(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "privacy_account_setting_show")) {
            str2 = "force_account_privacy_show";
        } else {
            str2 = "force_account_privacy_confirm";
        }
        C26890h.m65011a(str2, C23089d.m56640a().mo47826a("is_register", z ^ true ? 1 : 0).f61491a);
    }
}
