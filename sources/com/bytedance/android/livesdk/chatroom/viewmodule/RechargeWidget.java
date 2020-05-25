package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.p296a.C4764b;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class RechargeWidget extends Widget {

    /* renamed from: a */
    Dialog f17545a;

    /* renamed from: b */
    private C0649f f17546b;

    /* renamed from: c */
    private C0199s<KVData> f17547c = new C6564eo(this);

    /* renamed from: d */
    private C1689b f17548d = new C1689b();

    public void onCreate() {
        super.onCreate();
        this.dataCenter.observeForever("cmd_show_recharge_dialog", this.f17547c);
        this.dataCenter.observeForever("cmd_show_pay_dialog", this.f17547c);
        if (this.f17548d != null) {
            this.f17548d.mo6180a();
        }
        m13800a(C4764b.class);
        m13800a(C7713e.class);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f17548d != null) {
            this.f17548d.mo6180a();
        }
        this.dataCenter.removeObserver(this.f17547c);
        if (this.f17546b != null && this.f17546b.getDialog() != null && this.f17546b.getDialog().isShowing()) {
            this.f17546b.dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12524a(String str) {
        TTLiveSDKContext.getHostService().mo10310c().openWallet((Activity) this.context);
    }

    /* renamed from: a */
    private <T> void m13800a(Class<T> cls) {
        this.f17548d.mo6181a(C4495a.m10823a().mo10300a(cls).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C4764b) {
                    RechargeWidget.this.onEvent((C4764b) t);
                    return;
                }
                if (t instanceof C7713e) {
                    RechargeWidget.this.onEvent((C7713e) t);
                }
            }
        }));
    }

    public void onEvent(C4764b bVar) {
        if (TextUtils.equals("in_room_dialog", bVar.f12966a)) {
            mo12525a(bVar.f12967b, bVar.f12968c, bVar.f12969d, 0);
        } else {
            mo12524a(bVar.f12967b);
        }
    }

    public void onEvent(C7713e eVar) {
        if (this.f17545a != null && this.f17545a.isShowing()) {
            C6565ep.m13940a(this.f17545a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12525a(String str, String str2, String str3, int i) {
        boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        Bundle bundle = new Bundle();
        bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, booleanValue);
        bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, str3);
        this.f17546b = ((IWalletService) C4116c.m10249a(IWalletService.class)).showRechargeDialog((FragmentActivity) this.context, bundle, this.dataCenter, null);
    }
}
