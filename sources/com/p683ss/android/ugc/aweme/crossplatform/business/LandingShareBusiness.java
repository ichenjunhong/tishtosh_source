package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.C42131b;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42121t;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42122u;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42123v;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42138d;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42346c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.LandingShareBusiness */
public class LandingShareBusiness extends AbsShareBusiness {
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo55471c() {
        super.mo55471c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo55468b() {
        if ((this.f71634k instanceof Activity) && this.f71614a != null) {
            C42350b bVar = new C42350b();
            bVar.mo86258a((C42307b) new C42138d(this.f71614a));
            C41979aq.m91946a().injectUniversalConfig(bVar, (Activity) this.f71634k, true);
            bVar.mo86259a((SharePackage) this.f71614a);
            bVar.mo86270b(true);
            bVar.mo86260a((C42346c) new C42346c() {
                /* renamed from: a */
                public final void mo55492a(SharePackage sharePackage) {
                }

                /* renamed from: a */
                public final void mo55493a(String str, SharePackage sharePackage) {
                }

                /* renamed from: b */
                public final boolean mo55494b(SharePackage sharePackage) {
                    Context context = LandingShareBusiness.this.f71634k;
                    Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(LandingShareBusiness.this.f71633j.f71718a.f71713j);
                    C26088l.m63293a(context, "share", rawAdAwemeById, C26088l.m63373m(context, rawAdAwemeById, "share"));
                    return true;
                }
            });
            bVar.mo86267b();
            this.f71614a.f106900i.putString("aweme_id", this.f71633j.f71718a.f71713j);
            if (this.f71633j.f71721d.f71798d) {
                bVar.mo86262a((C42357g) new C42123v());
            }
            if (this.f71615b.contains("copylink")) {
                bVar.mo86262a((C42357g) new C42121t("fromWeb", false, true));
            }
            if (this.f71615b.contains("browser")) {
                bVar.mo86262a((C42357g) new C42122u());
            }
            bVar.mo86265a(true);
            new C42131b(C11016e.m22312g(), bVar.mo86266a()).show();
        }
    }

    public LandingShareBusiness(C27173c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo55464a(WebView webView) {
        super.mo55464a(webView);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo55469b(WebView webView) {
        super.mo55469b(webView);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo55465a(String str) {
        super.mo55465a(str);
    }
}
