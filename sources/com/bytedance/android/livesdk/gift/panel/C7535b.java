package com.bytedance.android.livesdk.gift.panel;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.gift.C4127e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.panel.p380a.C7526c;
import com.bytedance.android.livesdk.gift.panel.widget.C7595ao;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7564c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1674ab;
import p064c.p065a.C2203w;

/* renamed from: com.bytedance.android.livesdk.gift.panel.b */
final /* synthetic */ class C7535b implements C0199s {

    /* renamed from: a */
    private final C7521a f20694a;

    C7535b(C7521a aVar) {
        this.f20694a = aVar;
    }

    public final void onChanged(Object obj) {
        int i;
        C7521a aVar = this.f20694a;
        C7526c cVar = (C7526c) obj;
        if (!C7546m.m15540a(aVar.f20641a)) {
            C4204a.m10421a((Context) aVar.f20641a, (int) R.string.e77);
        } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            ((C4002ac) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(aVar.f20641a, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev8)).mo14539a(1001).mo14544d("live_detail").mo14545e("gift_send").mo14543c("enableGift").mo14541a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) aVar))).mo9407a((C1674ab<? super T>) aVar.f20648h);
        } else {
            if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.GIFT)) {
                if (((IHostContext) C4116c.m10249a(IHostContext.class)).isNeedProtectUnderage()) {
                    C4575an.m10981a((int) R.string.epj);
                    return;
                }
                C7505d findGiftById = GiftManager.inst().findGiftById(cVar.f20675b);
                if (findGiftById != null) {
                    i = findGiftById.f20545f;
                    if (cVar.f20674a == C7564c.DOODLE_GIFT && cVar.f20678e != null) {
                        i = cVar.f20678e.f20673d;
                    }
                } else {
                    i = 0;
                }
                if (findGiftById == null || cVar.f20674a == C7564c.PROP || ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10093b((long) i) || ((IHostContext) C4116c.m10249a(IHostContext.class)).isLocalTest()) {
                    if (cVar.f20674a == C7564c.GIFT && findGiftById != null && findGiftById.f20544e == 11) {
                        long j = cVar.f20675b;
                        C7545l lVar = new C7545l(aVar, cVar);
                        if (C4127e.m10264a().f11317a == null) {
                            lVar.mo9490a(false);
                        }
                    } else {
                        aVar.f20647g.mo13940a(cVar);
                    }
                    if (cVar.f20677d) {
                        aVar.dismiss();
                    }
                } else {
                    if (aVar.f20644d.f20776i.getValue() != null) {
                        ((C7595ao) aVar.f20644d.f20776i.getValue()).ordinal();
                    }
                    C4575an.m10983a(aVar.getContext(), (int) R.string.f0x);
                }
            }
        }
    }
}
