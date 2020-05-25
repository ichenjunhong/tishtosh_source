package com.p683ss.android.ugc.aweme.util;

import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;

/* renamed from: com.ss.android.ugc.aweme.util.r */
public final class C47638r {
    /* renamed from: a */
    public static void m103133a(String str, boolean z, String str2) {
        C23088c a = C23088c.m56631a().mo47824a("url", str).mo47824a("errorDesc", str2);
        if (z) {
            C23569o.m57776a("aweme_open_schema_rate", 0, a.mo47825b());
        } else {
            C23569o.m57776a("aweme_open_schema_rate", 1, a.mo47825b());
        }
    }
}
