package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i;
import com.p683ss.android.ugc.aweme.report.C41201a;
import com.p683ss.android.ugc.aweme.share.ShareDependService;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.k */
public final class C31090k extends C31068i {
    public C31090k(C31051a aVar) {
        C52711k.m112240b(aVar, "actionsManager");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo63838a(View view) {
        C52711k.m112240b(view, "v");
        if (this.f81322e != null && C11016e.m22312g() != null) {
            Activity g = C11016e.m22312g();
            if (g == null) {
                C52711k.m112234a();
            }
            Context context = g;
            Aweme aweme = this.f81322e;
            if (aweme == null) {
                C52711k.m112234a();
            }
            if (aweme.isAd()) {
                Aweme aweme2 = this.f81322e;
                if (aweme2 == null) {
                    C52711k.m112234a();
                }
                if (aweme2.getAwemeRawAd() != null) {
                    Aweme aweme3 = this.f81322e;
                    if (aweme3 == null) {
                        C52711k.m112234a();
                    }
                    AwemeRawAd awemeRawAd = aweme3.getAwemeRawAd();
                    if (awemeRawAd == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) awemeRawAd, "mAweme!!.awemeRawAd!!");
                    if (awemeRawAd.isReportEnable()) {
                        IReportService a = C27013a.m65227a();
                        Activity a2 = C42149b.m92512a(context);
                        Aweme aweme4 = this.f81322e;
                        if (aweme4 == null) {
                            C52711k.m112234a();
                        }
                        a.reportAd(a2, C41201a.m90895a(aweme4, "long_press", C29094ad.f76264a));
                        return;
                    }
                }
            }
            ShareDependService a3 = C41922a.m91868a();
            Aweme aweme5 = this.f81322e;
            if (aweme5 == null) {
                C52711k.m112234a();
            }
            a3.showReportDialog(aweme5, this.f81323f, context, "long_press");
        }
    }
}
