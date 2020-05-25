package com.p683ss.android.ugc.aweme.util;

import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.util.c */
public final class C47615c {
    /* renamed from: a */
    public static final boolean m103090a(AwemeRawAd awemeRawAd) {
        C52711k.m112240b(awemeRawAd, "$this$isUseOrdinaryWeb");
        if (awemeRawAd.getUseOrdinaryWeb_() == null) {
            return true;
        }
        Boolean useOrdinaryWeb_ = awemeRawAd.getUseOrdinaryWeb_();
        C52711k.m112236a((Object) useOrdinaryWeb_, "useOrdinaryWeb_");
        return useOrdinaryWeb_.booleanValue();
    }
}
