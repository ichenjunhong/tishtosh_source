package com.p683ss.android.ugc.aweme.bullet.business;

import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.p1486bz.C24476a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.WalletBusiness */
public final class WalletBusiness extends Business {

    /* renamed from: a */
    public boolean f64358a;

    /* renamed from: a */
    public final void mo50008a() {
        if (this.f64358a) {
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf refreshZhima = inst.getRefreshZhima();
            C52711k.m112236a((Object) refreshZhima, "SharePrefCache.inst().refreshZhima");
            Integer num = (Integer) refreshZhima.mo47782d();
            if (num != null && num.intValue() == 1) {
                WebView d = this.f64316k.mo50021d();
                if (d != null) {
                    String str = "https://wallet.snssdk.com/douyin/withdraw";
                    C18984e.m46161a(str);
                    d.loadUrl(str);
                }
                AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f64316k.mo50011a(AdWebStatBusiness.class);
                if (adWebStatBusiness != null) {
                    adWebStatBusiness.mo49970a();
                }
            } else {
                C47718bf.m103288a(new C24476a());
            }
            this.f64358a = false;
        }
    }

    public WalletBusiness(C24252a aVar) {
        C52711k.m112240b(aVar, "bulletBusiness");
        super(aVar);
    }
}
