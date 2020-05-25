package com.bytedance.android.livesdk.gift.panel;

import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1674ab;
import p064c.p065a.C2203w;

/* renamed from: com.bytedance.android.livesdk.gift.panel.c */
final /* synthetic */ class C7536c implements C0199s {

    /* renamed from: a */
    private final C7521a f20695a;

    C7536c(C7521a aVar) {
        this.f20695a = aVar;
    }

    public final void onChanged(Object obj) {
        C7521a aVar = this.f20695a;
        Boolean bool = (Boolean) obj;
        String str = "click";
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            ((C4002ac) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(aVar.f20641a, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev9)).mo14539a((int) BaseNotice.CHECK_PROFILE).mo14544d("live_detail").mo14545e("gift_send").mo14543c("enableGift").mo14541a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) aVar))).mo9407a((C1674ab<? super T>) aVar.f20648h);
            return;
        }
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.RECHARGE)) {
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo9431a()).intValue() == 1) {
                if (aVar.getActivity() != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, aVar.f20642b);
                    bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, str);
                    if (((IWalletService) C4116c.m10249a(IWalletService.class)).getRechargeType() != 3) {
                        ((IWalletService) C4116c.m10249a(IWalletService.class)).showRechargeDialog(aVar.getActivity(), bundle, aVar.f20646f, null);
                    } else {
                        ((IWalletService) C4116c.m10249a(IWalletService.class)).showRechargeDialog(aVar.getActivity(), bundle, aVar.f20646f, null);
                    }
                }
                return;
            }
            ((IWalletService) C4116c.m10249a(IWalletService.class)).openWallet(aVar.f20641a);
        }
    }
}
