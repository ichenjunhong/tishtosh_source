package com.p683ss.android.ugc.aweme.commercialize.feed;

import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.model.C26108ac;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.p */
final /* synthetic */ class C25919p implements Runnable {

    /* renamed from: a */
    private final CommerceVideoDelegate f68456a;

    /* renamed from: b */
    private final C26108ac f68457b;

    C25919p(CommerceVideoDelegate commerceVideoDelegate, C26108ac acVar) {
        this.f68456a = commerceVideoDelegate;
        this.f68457b = acVar;
    }

    public final void run() {
        CommerceVideoDelegate commerceVideoDelegate = this.f68456a;
        C26108ac acVar = this.f68457b;
        AwemeRawAd awemeRawAd = commerceVideoDelegate.f68301c.getAwemeRawAd();
        C26060ay ayVar = C26060ay.f68819a;
        StringBuilder sb = new StringBuilder("cpv_");
        sb.append(acVar.f68917a);
        sb.append("s");
        ayVar.mo53547a(sb.toString(), acVar.f68918b, awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), null, new C25921r(commerceVideoDelegate));
    }
}
