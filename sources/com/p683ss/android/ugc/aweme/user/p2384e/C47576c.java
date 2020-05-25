package com.p683ss.android.ugc.aweme.user.p2384e;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C24514cb;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.user.C47557d.C47558a;

/* renamed from: com.ss.android.ugc.aweme.user.e.c */
public final class C47576c {
    /* renamed from: a */
    private static SharedPreferences m103027a() {
        return C35807d.m80935a(C24514cb.m59923b(), "aweme_user", 0);
    }

    /* renamed from: b */
    private static SharedPreferences m103029b() {
        return C35807d.m80935a(C24514cb.m59923b(), "com.ss.spipe_setting", 0);
    }

    /* renamed from: a */
    public static void m103028a(String str) {
        m103027a().edit().putString("user_info_raw", str).commit();
    }

    /* renamed from: b */
    public static C47558a m103030b(String str) {
        long j = m103029b().getLong("user_id", 0);
        String string = m103029b().getString("session_key", "");
        String string2 = m103029b().getString("user_name", "");
        boolean z = m103029b().getBoolean("user_verified", false);
        String string3 = m103029b().getString("country_code", "");
        String string4 = m103029b().getString(C22835a.f61196a, "");
        if (!TextUtils.equals(str, String.valueOf(j))) {
            return null;
        }
        return C47558a.m103010a(j, string, string2, z, string3, string4);
    }
}
