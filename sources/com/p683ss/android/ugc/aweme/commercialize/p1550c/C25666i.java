package com.p683ss.android.ugc.aweme.commercialize.p1550c;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c.i */
final /* synthetic */ class C25666i implements C52670a {

    /* renamed from: a */
    private final AwemeRawAd f67883a;

    /* renamed from: b */
    private final Context f67884b;

    /* renamed from: c */
    private final String f67885c;

    C25666i(AwemeRawAd awemeRawAd, Context context, String str) {
        this.f67883a = awemeRawAd;
        this.f67884b = context;
        this.f67885c = str;
    }

    public final Object invoke() {
        AwemeRawAd awemeRawAd = this.f67883a;
        C26088l.m63325b(this.f67884b, awemeRawAd.getCreativeId() == null ? "" : awemeRawAd.getCreativeId().toString(), this.f67885c, awemeRawAd.getLogExtra());
        return null;
    }
}
