package com.p683ss.android.ugc.aweme.p1308ad.utils;

import com.p683ss.android.ugc.aweme.commercialize.model.C26146y;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.l */
public final class C22445l {

    /* renamed from: a */
    public static final C22445l f60441a = new C22445l();

    private C22445l() {
    }

    /* renamed from: a */
    public static final boolean m55475a(Aweme aweme, int i) {
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C26146y omVast = awemeRawAd.getOmVast();
                if (omVast != null && omVast.providerType == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
