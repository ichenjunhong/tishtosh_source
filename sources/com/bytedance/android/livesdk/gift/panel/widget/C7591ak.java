package com.bytedance.android.livesdk.gift.panel.widget;

import android.text.TextUtils;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.C4311b;
import com.bytedance.android.live.wallet.IWalletService;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.ak */
final /* synthetic */ class C7591ak implements C1710e {

    /* renamed from: a */
    private final MtGiftPanelBottomWidget f20924a;

    C7591ak(MtGiftPanelBottomWidget mtGiftPanelBottomWidget) {
        this.f20924a = mtGiftPanelBottomWidget;
    }

    public final void accept(Object obj) {
        MtGiftPanelBottomWidget mtGiftPanelBottomWidget = this.f20924a;
        Long l = (Long) obj;
        if (mtGiftPanelBottomWidget.isViewValid()) {
            C4311b walletCenter = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter();
            if (!TextUtils.isEmpty(walletCenter.mo10098f())) {
                mtGiftPanelBottomWidget.f20910b.setText(walletCenter.mo10098f());
            } else {
                mtGiftPanelBottomWidget.f20910b.setText(R.string.f2f);
            }
            mtGiftPanelBottomWidget.mo13977a(walletCenter.mo10092b());
        }
    }
}
