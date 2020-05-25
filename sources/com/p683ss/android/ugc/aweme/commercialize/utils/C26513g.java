package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.g */
public final class C26513g implements C26419bd {
    /* renamed from: a */
    public final String mo54129a(int i) {
        String a = C26512f.m64127a(i);
        C52711k.m112236a((Object) a, "AdDataUtils.getStarAtlasTagLabel(starStatus)");
        return a;
    }

    /* renamed from: a */
    public final String mo54130a(AwemeRawAd awemeRawAd) {
        C52711k.m112240b(awemeRawAd, "awemeRawAd");
        if (TextUtils.isEmpty(awemeRawAd.getHomepageBottomTextual())) {
            return AwemeApplication.m56199a().getString(R.string.db);
        }
        return awemeRawAd.getHomepageBottomTextual();
    }
}
