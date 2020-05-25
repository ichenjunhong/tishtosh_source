package com.bytedance.android.livesdk.gift.panel.widget;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p043v7.p044a.p045a.C1124a;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.p377g.C7454d;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C2203w;

public class MtGiftPanelBottomWidget extends FakeMtGiftPanelBottomWidget implements OnClickListener {

    /* renamed from: a */
    TextView f20909a;

    /* renamed from: b */
    TextView f20910b;

    /* renamed from: c */
    TextView f20911c;

    /* renamed from: d */
    private GiftDialogViewModel f20912d;

    public int getLayoutId() {
        return R.layout.ai9;
    }

    public void onResume() {
        super.onResume();
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
    }

    public void onCreate() {
        super.onCreate();
        this.f20912d = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        this.f20909a = (TextView) this.contentView.findViewById(R.id.d9e);
        this.f20910b = (TextView) this.contentView.findViewById(R.id.sm);
        this.f20911c = (TextView) this.contentView.findViewById(R.id.bn_);
        this.f20911c.setOnClickListener(this);
        this.f20910b.setOnClickListener(this);
        if (((Boolean) LiveSettingKeys.HIDE_CHARGE_ICON_FOR_USER.mo9431a()).booleanValue()) {
            this.f20910b.setVisibility(4);
        }
        Drawable b = C1124a.m3315b(this.context, R.drawable.bsx);
        if (b != null) {
            b.setBounds(new Rect(0, 0, (int) C4577ap.m10990a(this.context, 16.0f), (int) C9432q.m18687b(this.context, 16.0f)));
        }
        if (C4206c.m10426a(this.context)) {
            this.f20909a.setCompoundDrawables(null, null, b, null);
        } else {
            this.f20909a.setCompoundDrawables(b, null, null, null);
        }
        this.f20910b.setTextColor(getContext().getResources().getColor(C7454d.m15401a().mo13864e()));
        this.f20909a.setTextColor(getContext().getResources().getColor(C7454d.m15401a().mo13865f()));
        if (C4206c.m10426a(this.context)) {
            Drawable b2 = C1124a.m3315b(this.context, R.drawable.bqt);
            if (b2 != null) {
                b2.setBounds(new Rect(0, 0, (int) C4577ap.m10990a(this.context, 12.0f), (int) C9432q.m18687b(this.context, 12.0f)));
            }
            this.f20910b.setCompoundDrawables(b2, null, null, null);
            this.f20911c.setCompoundDrawables(b2, null, null, null);
        } else {
            Drawable b3 = C1124a.m3315b(this.context, C7454d.m15401a().mo13866g());
            if (b3 != null) {
                b3.setBounds(new Rect(0, 0, (int) C4577ap.m10990a(this.context, 12.0f), (int) C9432q.m18687b(this.context, 12.0f)));
            }
            this.f20910b.setCompoundDrawables(null, null, b3, null);
            this.f20911c.setCompoundDrawables(null, null, b3, null);
        }
        this.f20912d.f20756C.observe(this, new C7590aj(this));
        mo13977a(((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b());
        ((C4002ac) ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10089a().mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9406a(new C7591ak(this), C7592al.f20925a);
    }

    public void onEvent(C7713e eVar) {
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13977a(long j) {
        TextView textView = this.f20909a;
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            j = 0;
        }
        textView.setText(String.valueOf(j));
    }

    public void onClick(View view) {
        if (view.getId() == R.id.sm) {
            if (!((Boolean) LiveSettingKeys.LIVE_MT_USER_CAN_RECHARGE.mo9431a()).booleanValue()) {
                new C8552a(getContext(), 0).mo14996a(true).mo15009c((CharSequence) C2240a.m6772a(getContext().getResources().getString(R.string.e5a), new Object[]{LiveSettingKeys.LIVE_MT_LOW_AGE_USER_LIMIT.mo9431a()})).mo15003b(0, (int) R.string.e9e, (DialogInterface.OnClickListener) new C7593am(this)).mo15003b(1, (int) R.string.e9f, C7594an.f20927a).mo15001b().show();
            } else {
                this.f20912d.f20783p.postValue(Boolean.valueOf(true));
            }
        } else if (view.getId() == R.id.bn_) {
            this.f20912d.f20757D.postValue("more_prop");
        }
    }
}
