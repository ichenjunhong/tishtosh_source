package com.p683ss.android.ugc.aweme.commercialize.feed;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ap */
public final class C25884ap {

    /* renamed from: a */
    public static final C25884ap f68414a = new C25884ap();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ap$a */
    public static final class C25885a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ List f68415a;

        public C25885a(List list) {
            this.f68415a = list;
        }

        public final /* synthetic */ Object call() {
            for (Aweme aweme : this.f68415a) {
                if (aweme != null && aweme.isAd()) {
                    C25884ap.f68414a.mo53205a("feedApi", aweme);
                }
            }
            return C52860x.f131107a;
        }
    }

    private C25884ap() {
    }

    /* renamed from: a */
    private static String m62802a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("{ adid = ");
        sb.append(awemeRawAd.getAdId());
        sb.append(", cid = ");
        sb.append(awemeRawAd.getCreativeId());
        sb.append(", title = ");
        sb.append(awemeRawAd.getTitle());
        sb.append(", buttonText = ");
        sb.append(awemeRawAd.getButtonText());
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo53205a(String str, Aweme aweme) {
        C52711k.m112240b(str, "label");
        C52711k.m112240b(aweme, "aweme");
        C32458a.m75141a(3, "MaskDebugLog", m62803b(str, aweme));
    }

    /* renamed from: b */
    private final String m62803b(String str, Aweme aweme) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : aid=  ");
        sb.append(aweme.getAid());
        sb.append(", isad= ");
        sb.append(aweme.isAd());
        sb.append(", desc= ");
        sb.append(aweme.getDesc());
        sb.append(", awemeRawAd= ");
        sb.append(m62802a(aweme.getAwemeRawAd()));
        sb.append(", shareUrl = ");
        sb.append(aweme.getShareUrl());
        return sb.toString();
    }
}
