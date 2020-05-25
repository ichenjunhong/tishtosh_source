package com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.util.C47625i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.b.e */
public final class C40249e {

    /* renamed from: a */
    static Keva f102788a;

    /* renamed from: b */
    public static final C40249e f102789b = new C40249e();

    private C40249e() {
    }

    static {
        try {
            f102788a = Keva.getRepoFromSp(C11010c.m22280a(), "ProfileV2Preferences", 0);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("SharedPreferencesAnnotatedManager getSP failed ");
            sb.append(th.getMessage());
            C47625i.m103103a(sb.toString());
        }
    }
}
