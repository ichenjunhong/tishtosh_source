package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26429bn;
import com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.DownloadBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.AdPopUpWebPageContainer */
public final class AdPopUpWebPageContainer extends C26429bn implements C0183j {

    /* renamed from: g */
    public static final C27099a f71470g = new C27099a(null);

    /* renamed from: f */
    public final C0184k f71471f;

    /* renamed from: h */
    private boolean f71472h;

    /* renamed from: i */
    private boolean f71473i = true;

    /* renamed from: j */
    private final int f71474j;

    /* renamed from: k */
    private final int f71475k;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.AdPopUpWebPageContainer$a */
    public static final class C27099a {
        private C27099a() {
        }

        public /* synthetic */ C27099a(C52707g gVar) {
            this();
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        mo55379i();
    }

    /* renamed from: i */
    public final void mo55379i() {
        if (this.f71473i) {
            this.f71472h = false;
            this.f69679b.mo55690g(this.f69678a);
        }
    }

    /* renamed from: a */
    public final void mo55377a() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f69682e.mo55523a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo55473a();
        }
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        mo55378h();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f69682e.mo55523a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo55480a(false);
        }
    }

    /* renamed from: h */
    public final void mo55378h() {
        if (this.f71472h) {
            this.f71472h = false;
            this.f69679b.mo55687d(this.f69678a);
            if (this.f69678a.findViewById(this.f71474j) != null) {
                ((DownloadBusiness) this.f69682e.mo55523a(DownloadBusiness.class)).mo55488a(this.f69678a);
            }
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        this.f69679b.mo55685c(this.f69678a);
        this.f69682e.mo55524a();
        DownloadBusiness downloadBusiness = (DownloadBusiness) this.f69682e.mo55523a(DownloadBusiness.class);
        if (downloadBusiness != null) {
            downloadBusiness.f71637a = this.f71474j;
            downloadBusiness.f71638b = this.f71475k;
            downloadBusiness.mo55489a(this.f69678a, (C27309j) mo54149e().mo55670a(C27309j.class));
            this.f71472h = true;
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f69682e.mo55523a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo55473a();
        }
    }

    public AdPopUpWebPageContainer(Activity activity, C27298a aVar, C27235d dVar, C27182a aVar2, C0184k kVar, int i, int i2) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aVar, "crossPlatformWebView");
        C52711k.m112240b(dVar, "iSingleWebViewStatus");
        C52711k.m112240b(aVar2, "crossPlatformParams");
        C52711k.m112240b(kVar, "lifecycleOwner");
        super(activity, aVar, dVar, aVar2);
        this.f71471f = kVar;
        this.f71474j = i;
        this.f71475k = i2;
        aVar.setCrossPlatformActivityContainer(this);
        this.f71471f.getLifecycle().mo324a(this);
    }
}
