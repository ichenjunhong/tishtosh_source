package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8772c;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.ies.p675g.p677b.C10807s;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.d */
public final class C4777d implements C10762d {

    /* renamed from: a */
    public final WeakReference<C10807s> f12991a;

    /* renamed from: b */
    public String f12992b;

    /* renamed from: c */
    private final WeakReference<Context> f12993c;

    /* renamed from: d */
    private IWalletService f12994d = ((IWalletService) C4116c.m10249a(IWalletService.class));

    public C4777d(WeakReference<Context> weakReference, C10807s sVar) {
        this.f12993c = weakReference;
        this.f12991a = new WeakReference<>(sVar);
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (hVar != null && hVar.f28947d != null) {
            hVar.f28951h = false;
            this.f12992b = hVar.f28945b;
            String optString = hVar.f28947d.optJSONObject("args").optString("auth_info");
            if (this.f12993c.get() instanceof Activity) {
                this.f12994d.verifyWithAli((Activity) this.f12993c.get(), optString, new C8772c() {
                });
            }
        }
    }
}
