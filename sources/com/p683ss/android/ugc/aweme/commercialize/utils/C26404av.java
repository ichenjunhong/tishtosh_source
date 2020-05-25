package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.av */
public final class C26404av {

    /* renamed from: a */
    private static Aweme f69651a;

    /* renamed from: a */
    public static Aweme m63870a() {
        return f69651a;
    }

    /* renamed from: b */
    public static boolean m63871b() {
        try {
            if (!C32816h.m75716b().getShopping().getDisableCard().booleanValue()) {
                return true;
            }
            return false;
        } catch (C10174a unused) {
            return true;
        }
    }
}
