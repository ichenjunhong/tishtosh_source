package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.google.gson.C17971f;
import com.p683ss.android.sdk.activity.p1208a.C19723a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.n */
public final class C26529n {

    /* renamed from: a */
    public static final C26529n f69861a = new C26529n();

    private C26529n() {
    }

    /* renamed from: a */
    public static final C19723a m64186a() {
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf adLandingPageConfig = inst.getAdLandingPageConfig();
        if (adLandingPageConfig != null) {
            String str = (String) adLandingPageConfig.mo47782d();
            if (str != null) {
                return (C19723a) new C17971f().mo34884a(str, C19723a.class);
            }
        }
        return null;
    }
}
