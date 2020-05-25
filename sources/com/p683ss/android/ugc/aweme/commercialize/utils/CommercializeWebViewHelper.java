package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27149c;
import com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a.C27183a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper */
public class CommercializeWebViewHelper extends C26429bn implements C0183j {

    /* renamed from: f */
    private C0184k f69460f;

    /* renamed from: g */
    private long f69461g;

    /* renamed from: a */
    public final PreRenderWebViewBusiness mo54005a() {
        return PreRenderWebViewBusiness.m65563a((C27149c) this);
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
        this.f69679b.mo55672a(this.f69678a);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f69679b.mo55690g(this.f69678a);
        this.f69460f.getLifecycle().mo325b(this);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        this.f69679b.mo55687d(this.f69678a);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f69682e.mo55523a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo55480a(false);
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f69461g;
        this.f69461g = 0;
        C23089d a = C23089d.m56640a();
        a.mo47827a("duration", currentTimeMillis);
        C26890h.m65011a("h5_stay_time", a.f61491a);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        this.f69679b.mo55685c(this.f69678a);
        this.f69682e.mo55524a();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f69682e.mo55523a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo55473a();
        }
        this.f69461g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static CommercializeWebViewHelper m63705a(C27298a aVar, C27235d dVar, C0184k kVar, Activity activity, Bundle bundle) {
        CommercializeWebViewHelper commercializeWebViewHelper = new CommercializeWebViewHelper(activity, aVar, dVar, C27183a.m65605a(bundle), kVar);
        return commercializeWebViewHelper;
    }

    private CommercializeWebViewHelper(Activity activity, C27298a aVar, C27235d dVar, C27182a aVar2, C0184k kVar) {
        super(activity, aVar, dVar, aVar2);
        aVar.setCrossPlatformActivityContainer(this);
        this.f69460f = kVar;
        this.f69460f.getLifecycle().mo324a(this);
    }
}
