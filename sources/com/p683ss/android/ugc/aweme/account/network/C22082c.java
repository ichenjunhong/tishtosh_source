package com.p683ss.android.ugc.aweme.account.network;

import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity;
import com.p683ss.android.ugc.aweme.main.service.C36688i;
import com.p683ss.android.ugc.aweme.services.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.services.interceptor.PicCaptchaInterceptor;
import com.p683ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.network.c */
public final class C22082c {
    /* renamed from: a */
    public static boolean m54857a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/passport/")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Map<String, String> m54856a(int i, String str, String str2) {
        IInterceptor iInterceptor;
        if (C21459s.f58194d.contains(Integer.valueOf(i))) {
            iInterceptor = new TwoStepAuthenticationInterceptor();
        } else if (!C22083d.f59593a.contains(Integer.valueOf(i)) || !(((C36688i) C23826bi.m58450a(C36688i.class)).mo47883b() instanceof SignUpOrLoginActivity)) {
            iInterceptor = null;
        } else {
            iInterceptor = new PicCaptchaInterceptor();
        }
        if (iInterceptor == null) {
            return new C0777a();
        }
        return iInterceptor.tryToIntercept(str, str2, i);
    }
}
