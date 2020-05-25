package com.bytedance.android.livesdk.p426x;

import android.view.KeyEvent;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p388k.C7708a;
import com.bytedance.android.livesdkapi.depend.live.C8644c;

/* renamed from: com.bytedance.android.livesdk.x.a */
public class C8565a implements C8644c {

    /* renamed from: a */
    private static volatile C8565a f23498a;

    /* renamed from: b */
    public final void mo15021b() {
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
    }

    /* renamed from: a */
    public static C8644c m16905a() {
        if (f23498a == null) {
            synchronized (C8565a.class) {
                if (f23498a == null) {
                    f23498a = new C8565a();
                }
            }
        }
        return f23498a;
    }

    /* renamed from: a */
    public final boolean mo15020a(int i, int i2, KeyEvent keyEvent) {
        C4495a.m10823a().mo10301a((Object) new C7708a(0, i2, keyEvent));
        return false;
    }
}
