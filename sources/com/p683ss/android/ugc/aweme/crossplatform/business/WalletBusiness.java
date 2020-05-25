package com.p683ss.android.ugc.aweme.crossplatform.business;

import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p683ss.android.ugc.aweme.p1486bz.C24476a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.WalletBusiness */
public class WalletBusiness extends Business {

    /* renamed from: a */
    public boolean f71674a;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo55515a() {
        if (this.f71674a) {
            if (((Integer) SharePrefCache.inst().getRefreshZhima().mo47782d()).intValue() != 1) {
                C47718bf.m103288a(new C24476a());
            } else if (this.f71631h instanceof C27114h) {
                ((C27114h) this.f71631h).mo54146b("https://wallet.snssdk.com/douyin/withdraw");
            }
            this.f71674a = false;
        }
    }

    WalletBusiness(C27173c cVar) {
        super(cVar);
    }
}
