package com.bytedance.android.livesdk.gift.panel.widget;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.ies.sdk.widgets.Widget;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class GiftPanelChargeRewardWidget extends Widget {

    /* renamed from: a */
    private C1689b f20825a = new C1689b();

    /* renamed from: b */
    private GiftDialogViewModel f20826b;

    public int getLayoutId() {
        return R.layout.ai_;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
    }

    public void onCreate() {
        super.onCreate();
        this.f20826b = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        this.f20825a.mo6181a(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14536f().mo6545f((C1710e<? super T>) new C7606l<Object>(this)));
    }
}
