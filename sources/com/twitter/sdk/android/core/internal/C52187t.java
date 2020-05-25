package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.models.C52197d;
import com.twitter.sdk.android.core.models.C52216s;

/* renamed from: com.twitter.sdk.android.core.internal.t */
public final class C52187t {
    /* renamed from: a */
    public static boolean m111610a(C52197d dVar) {
        if (("player".equals(dVar.f129925b) || "vine".equals(dVar.f129925b)) && m111611b(dVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m111611b(C52197d dVar) {
        C52216s sVar = (C52216s) dVar.f129924a.mo108925a("site");
        if (sVar != null) {
            try {
                if (Long.parseLong(sVar.f130031a) == 586671909) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
