package com.p683ss.android.ugc.aweme.crossplatform.business;

import com.p683ss.android.ugc.aweme.crossplatform.base.C27149c;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.c */
public class C27173c implements C27177g {

    /* renamed from: a */
    final C27149c f71692a;

    /* renamed from: b */
    private final BusinessService f71693b = new BusinessService(this);

    /* renamed from: a */
    public final void mo55524a() {
        ((WalletBusiness) this.f71693b.mo55483a(WalletBusiness.class)).mo55515a();
    }

    /* renamed from: a */
    public final <T extends Business> T mo55523a(Class<T> cls) {
        return this.f71693b.mo55483a(cls);
    }

    C27173c(C27149c cVar) {
        this.f71692a = cVar;
    }

    /* renamed from: a */
    public final void mo55525a(C27182a aVar) {
        if (aVar != null && aVar.f71718a.f71706c != null) {
            int intValue = aVar.f71718a.f71704a.intValue();
            boolean z = true;
            if (!(intValue == 3 || intValue == 1)) {
                z = false;
            }
            if (z && aVar.f71718a.f71706c.endsWith("pay")) {
                this.f71693b.mo55483a(WalletBusiness.class);
                IWalletService provideWalletService_Monster = DEFAULT.provideWalletService_Monster();
                if (provideWalletService_Monster != null) {
                    provideWalletService_Monster.syncWallet();
                }
            }
        }
    }
}
