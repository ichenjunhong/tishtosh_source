package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.concurrent.Callable;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aq */
public final class C26397aq {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aq$a */
    static final class C26398a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52670a f69643a;

        C26398a(C52670a aVar) {
            this.f69643a = aVar;
        }

        public final /* synthetic */ Object call() {
            this.f69643a.invoke();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public static final boolean m63859a(Aweme aweme) {
        C52711k.m112240b(aweme, "$this$isHardAd");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || !awemeRawAd.isHardAd()) {
            return false;
        }
        return true;
    }
}
