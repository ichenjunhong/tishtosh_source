package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.panel.C7547n.C7549a;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.s */
final /* synthetic */ class C7554s implements C1710e {

    /* renamed from: a */
    private final C7547n f20724a;

    /* renamed from: b */
    private final C7525b f20725b;

    /* renamed from: c */
    private final long f20726c;

    C7554s(C7547n nVar, C7525b bVar, long j) {
        this.f20724a = nVar;
        this.f20725b = bVar;
        this.f20726c = j;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20724a;
        C7525b bVar = this.f20725b;
        long j = this.f20726c;
        C7514m mVar = (C7514m) ((C4177d) obj).data;
        mVar.f20617i = bVar.f20670a.size();
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10091a(mVar.f20611c);
        ((C7549a) nVar.mo8518c()).mo13928a(mVar.f20617i, bVar);
        C7647s.m15648a(998, nVar.f20706a.getId(), SystemClock.uptimeMillis() - j);
    }
}
