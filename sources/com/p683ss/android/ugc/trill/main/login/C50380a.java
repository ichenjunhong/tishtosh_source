package com.p683ss.android.ugc.trill.main.login;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.utils.C47893fn;
import com.p683ss.android.ugc.trill.p2521f.C50322a;

/* renamed from: com.ss.android.ugc.trill.main.login.a */
public final class C50380a {
    /* renamed from: a */
    public static C23088c m108664a(String str) {
        return m108665a(str, null);
    }

    /* renamed from: a */
    private static C23088c m108665a(String str, C23088c cVar) {
        boolean z;
        C23088c a = C23088c.m56631a();
        if (TextUtils.equals(str, "google")) {
            PackageInfo a2 = C47893fn.m103595a(C11010c.m22280a(), "com.google.android.gms");
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
            a.mo47824a("eligible", String.valueOf(C50322a.m108601a(C11010c.m22280a())));
        }
        return a;
    }
}
