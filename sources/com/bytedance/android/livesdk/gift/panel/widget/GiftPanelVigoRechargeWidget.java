package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;

public class GiftPanelVigoRechargeWidget extends FakeGiftPanelVigoRechargeWidget {

    /* renamed from: a */
    public Room f20906a;

    /* renamed from: b */
    private GiftDialogViewModel f20907b;

    /* renamed from: c */
    private View f20908c;

    public int getLayoutId() {
        return R.layout.ai_;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f20907b.mo13948a(this);
    }

    public void onCreate() {
        super.onCreate();
        this.f20907b = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        this.f20906a = this.f20907b.f20772e;
        this.f20908c = this.contentView.findViewById(R.id.akw);
        this.f20907b.f20786s.observe(this, new C7589ai(this));
    }

    public void onEvent(C7713e eVar) {
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
        ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14535e().mo6158b();
        int i = eVar.f21218b;
        User user = (User) this.dataCenter.get("data_user_in_room");
        if (user != null) {
            user.setPayScores(user.getPayScores() + ((long) i));
            user.setNeverRecharge(false);
        }
    }
}
