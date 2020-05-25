package com.p683ss.android.ugc.aweme.commercialize.views;

import android.graphics.Rect;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.k */
final /* synthetic */ class C26742k implements Runnable {

    /* renamed from: a */
    private final SearchAdView f70452a;

    C26742k(SearchAdView searchAdView) {
        this.f70452a = searchAdView;
    }

    public final void run() {
        SearchAdView searchAdView = this.f70452a;
        if (searchAdView.f70218b != null && searchAdView.f70222f < searchAdView.f70221e) {
            searchAdView.f70222f = System.currentTimeMillis();
            if (searchAdView.f70219c == null) {
                searchAdView.f70219c = new Rect();
            }
            if (!searchAdView.getGlobalVisibleRect(searchAdView.f70219c) || searchAdView.f70219c.isEmpty()) {
                searchAdView.f70220d = false;
            } else if (!searchAdView.f70220d) {
                searchAdView.f70220d = true;
                if (!(searchAdView.f70218b == null || searchAdView.f70218b.adType == 1)) {
                    C26088l.m63297a(searchAdView.getContext(), Long.toString(searchAdView.f70218b.f68945id), searchAdView.mo54472d() ? "flash" : "superstar_region", searchAdView.f70218b.logExtra);
                    C26060ay.f68819a.mo53545a("show", searchAdView.f70218b.trackUrlList, Long.valueOf(searchAdView.f70218b.getCreativeId()), searchAdView.f70218b.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26743l<Object,Object,Object>(searchAdView));
                }
            }
        }
    }
}
