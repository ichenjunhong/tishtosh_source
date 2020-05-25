package com.twitter.sdk.android.core.internal.scribe;

import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.w */
public final class C52183w {
    /* renamed from: a */
    public static C52181v m111607a(C52158e eVar, String str, long j, String str2, String str3, List<C52144aa> list) {
        char c;
        String str4 = eVar.f129825a;
        if (str4.hashCode() == 114757 && str4.equals("tfw")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            C52149ab abVar = new C52149ab(eVar, j, str2, str3, list);
            return abVar;
        }
        C52151ac acVar = new C52151ac(eVar, str, j, str2, str3, list);
        return acVar;
    }
}
