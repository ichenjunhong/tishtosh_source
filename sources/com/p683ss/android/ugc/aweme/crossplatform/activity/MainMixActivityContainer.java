package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.crossplatform.business.DownloadBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.ShareBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.MainMixActivityContainer */
public class MainMixActivityContainer extends MixActivityContainer {
    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo55391o() {
        super.mo55391o();
        ((DownloadBusiness) this.f71490d.mo55523a(DownloadBusiness.class)).mo55488a(this.f71487a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo55392p() {
        super.mo55392p();
        ((DownloadBusiness) this.f71490d.mo55523a(DownloadBusiness.class)).mo55489a(this.f71487a, (C27309j) mo54149e().mo55670a(C27309j.class));
    }

    /* renamed from: q */
    public final void mo55393q() {
        super.mo55393q();
        ((ShareBusiness) getCrossPlatformBusiness().mo55523a(ShareBusiness.class)).mo55465a(mo54149e().getCurrentUrl());
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo55389m() {
        super.mo55389m();
        ((ShareBusiness) this.f71490d.mo55523a(ShareBusiness.class)).mo55464a((WebView) ((C27309j) mo54149e().mo55670a(C27309j.class)).mo55729a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo55390n() {
        super.mo55390n();
        if (mo54151g()) {
            ((ShareBusiness) this.f71490d.mo55523a(ShareBusiness.class)).mo55469b(((C27309j) mo54149e().mo55670a(C27309j.class)).mo55729a());
        } else {
            ((ShareBusiness) this.f71490d.mo55523a(ShareBusiness.class)).mo55471c();
        }
    }

    public MainMixActivityContainer(Activity activity, C27182a aVar) {
        super(activity, aVar);
    }
}
