package com.bytedance.android.livesdk.chatroom.presenter;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.presenter.C5891t.C5893a;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.u */
final /* synthetic */ class C5894u implements C1710e {

    /* renamed from: a */
    private final C5891t f15418a;

    /* renamed from: b */
    private final C7505d f15419b;

    /* renamed from: c */
    private final long f15420c;

    /* renamed from: d */
    private final Context f15421d;

    C5894u(C5891t tVar, C7505d dVar, long j, Context context) {
        this.f15418a = tVar;
        this.f15419b = dVar;
        this.f15420c = j;
        this.f15421d = context;
    }

    public final void accept(Object obj) {
        C5891t tVar = this.f15418a;
        C7505d dVar = this.f15419b;
        long j = this.f15420c;
        Context context = this.f15421d;
        C4177d dVar2 = (C4177d) obj;
        C7647s.m15648a(dVar.f20543d, tVar.f15414d.getId(), SystemClock.uptimeMillis() - j);
        if (dVar != null && dVar.f20539H) {
            C7647s.m15646a(dVar.f20543d, tVar.f15414d.getId(), 1, "fast_gift", SystemClock.uptimeMillis() - j);
        }
        if (tVar.mo8518c() != null) {
            C7514m mVar = (C7514m) dVar2.data;
            ((C5893a) tVar.mo8518c()).mo11788a(mVar);
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10091a(mVar.f20611c);
        }
    }
}
